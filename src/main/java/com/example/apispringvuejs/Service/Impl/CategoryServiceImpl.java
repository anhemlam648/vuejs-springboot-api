package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtocategory;
import com.example.apispringvuejs.Entity.CategoryHrAdministration;
import com.example.apispringvuejs.Mapper.MapperCategoryHrAdministration;
import com.example.apispringvuejs.Repository.CategoryRepository;
import com.example.apispringvuejs.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    private CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @Override
    public boolean createCategory(Dtocategory dtocategory) {
        CategoryHrAdministration categoryHrAdministration = MapperCategoryHrAdministration.MapToCategory(dtocategory);
        CategoryHrAdministration saveCategory = this.categoryRepository.save(categoryHrAdministration);
        return  saveCategory != null;
    }

    @Override
    public boolean updateCategory(Dtocategory dtocategory) {
        Optional<CategoryHrAdministration> optionalCategoryHrAdministration = this.categoryRepository.findById(dtocategory.getId());
        if(optionalCategoryHrAdministration.isPresent()){
            CategoryHrAdministration categoryHrAdministration = optionalCategoryHrAdministration.get();
            categoryHrAdministration.setName(dtocategory.getName());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCategory(Long id) {
        Optional<CategoryHrAdministration> optionalCategoryHrAdministration = this.categoryRepository.findById(id);
        if(optionalCategoryHrAdministration != null){
            categoryRepository.delete(optionalCategoryHrAdministration.get());
            return true;
        }
        return false;
    }

    @Override
    public Dtocategory getCategoryDtoById(Long id) {
        Optional<CategoryHrAdministration> optionalCategoryHrAdministration = this.categoryRepository.findById(id);
        if(optionalCategoryHrAdministration.isPresent()){
            CategoryHrAdministration categoryHrAdministration = optionalCategoryHrAdministration.get();
            return MapperCategoryHrAdministration.MapToDtoCategory(categoryHrAdministration);
        }
        return null;
    }
    public List<Dtocategory> getAllCategory(){
        List<Dtocategory> dtocategories = this.categoryRepository.findAll().stream()
                .map(MapperCategoryHrAdministration :: MapToDtoCategory)
                .collect(Collectors.toList());
        return dtocategories;
    }
}
