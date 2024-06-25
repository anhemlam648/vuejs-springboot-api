package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtohradministration;
import com.example.apispringvuejs.Entity.CategoryHrAdministration;
import com.example.apispringvuejs.Entity.HrAdministration;
import com.example.apispringvuejs.Mapper.MapperCategoryHrAdministration;
import com.example.apispringvuejs.Mapper.MapperHrAdministration;
import com.example.apispringvuejs.Repository.CategoryRepository;
import com.example.apispringvuejs.Repository.HrAdministrationRepository;
import com.example.apispringvuejs.Service.HrAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HrAdministrationServiceImpl implements HrAdministrationService {
    private final HrAdministrationRepository hrAdministrationRepository;

    @Autowired
    private HrAdministrationServiceImpl(HrAdministrationRepository hrAdministrationRepository){
        this.hrAdministrationRepository = hrAdministrationRepository;

    }
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Dtohradministration> getAllHrAdministration() {
        List<Dtohradministration> dtohradministrationList = hrAdministrationRepository.findAll().stream()
                .map(MapperHrAdministration::MapToDtoHrAdministration)
                .collect(Collectors.toList());
        return dtohradministrationList;
    }

    @Override
    public boolean createHrAdministrationDto(Dtohradministration dtohradministration) {
        HrAdministration hrAdministration = MapperHrAdministration.MapHradministration(dtohradministration);
        String base64Image = dtohradministration.getImage();
        if(base64Image != null && !base64Image.isEmpty()){
            try {
                String decodedImage = new String(Base64.getDecoder().decode(base64Image));
                hrAdministration.setImage(decodedImage);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            HrAdministration savehrAdministration = hrAdministrationRepository.save(hrAdministration);
            return savehrAdministration != null;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateHrAdministrationDto(Dtohradministration dtohradministration) {
        Optional<HrAdministration> optionalHrAdministration =this.hrAdministrationRepository.findById(dtohradministration.getId());
        if(optionalHrAdministration.isPresent()){
            HrAdministration hrAdministration = optionalHrAdministration.get();
            hrAdministration.setDescription(dtohradministration.getDescription());
            hrAdministration.setImage(dtohradministration.getImage());
            hrAdministration.setTitle(dtohradministration.getTitle());
            hrAdministration.setContent(dtohradministration.getContent());
            hrAdministration.setCreateAt(dtohradministration.getCreateAt());
            hrAdministration.setUpdateAt(dtohradministration.getUpdateAt());
            //Cập nhật Category
            Optional<CategoryHrAdministration> optionalCategoryHrAdministration = this.categoryRepository.findById(dtohradministration.getCategoryHrAdministration());
            optionalCategoryHrAdministration.ifPresent(hrAdministration::setCategoryHrAdministration);
            hrAdministrationRepository.save(hrAdministration);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteHrAdministrationDto(Long id) {
        Optional<HrAdministration> deleteHrAdministration =this.hrAdministrationRepository.findById(id);
        if(deleteHrAdministration.isPresent()){
            hrAdministrationRepository.delete(deleteHrAdministration.get());
            return true;
        }
        return false;
    }

    @Override
    public Dtohradministration getHrAdministrationDtoById(Long id) {
        Optional<HrAdministration> optionalHrAdministration = this.hrAdministrationRepository.findById(id);
        if(optionalHrAdministration.isPresent()){
            HrAdministration hrAdministration =optionalHrAdministration.get();
            return MapperHrAdministration.MapToDtoHrAdministration(hrAdministration);
        }else {
            return null;
        }
    }


}
