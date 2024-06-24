package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtocategory;
import com.example.apispringvuejs.Entity.CategoryHrAdministration;

public class MapperCategoryHrAdministration {
    public Dtocategory MapToDtoCategory (CategoryHrAdministration categoryHrAdministration){
        Dtocategory dtocategory = new Dtocategory();
        dtocategory.setId(categoryHrAdministration.getId());
        dtocategory.setName(categoryHrAdministration.getName());
        return dtocategory;
    }
    public CategoryHrAdministration MapToCategory (Dtocategory dtocategory){
        CategoryHrAdministration categoryHrAdministration = new CategoryHrAdministration();
        categoryHrAdministration.setId(dtocategory.getId());
        categoryHrAdministration.setName(dtocategory.getName());
        return categoryHrAdministration;
    }

}
