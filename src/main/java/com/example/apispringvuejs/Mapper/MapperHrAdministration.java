package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtohradministration;
import com.example.apispringvuejs.Entity.CategoryHrAdministration;
import com.example.apispringvuejs.Entity.HrAdministration;

public class MapperHrAdministration {
    public static Dtohradministration MapToDtoHrAdministration (HrAdministration hrAdministration) {
        Dtohradministration dtohradministration = new Dtohradministration();
        dtohradministration.setId(hrAdministration.getId());
        dtohradministration.setDescription(hrAdministration.getDescription());
        dtohradministration.setTitle(hrAdministration.getTitle());
        dtohradministration.setContent(hrAdministration.getContent());
        dtohradministration.setImage(hrAdministration.getImage());
        if (hrAdministration.getCategoryHrAdministration() != null) {
            dtohradministration.setCategoryHrAdministration(hrAdministration.getCategoryHrAdministration().getId());
        }
        dtohradministration.setCreateAt(hrAdministration.getCreateAt());
        dtohradministration.setUpdateAt(hrAdministration.getUpdateAt());
        return dtohradministration;
    }
    public static HrAdministration MapHradministration (Dtohradministration dtohradministration){
        HrAdministration hrAdministration = new HrAdministration();
        hrAdministration.setId(dtohradministration.getId());
        hrAdministration.setContent(dtohradministration.getContent());
        hrAdministration.setTitle(dtohradministration.getTitle());
        hrAdministration.setDescription(dtohradministration.getDescription());
        hrAdministration.setImage(dtohradministration.getImage());
        if(dtohradministration.getCategoryHrAdministration() != null){
            CategoryHrAdministration categoryHrAdministration = new CategoryHrAdministration();
            categoryHrAdministration.setId(dtohradministration.getId());
            hrAdministration.setCategoryHrAdministration(categoryHrAdministration);
        }
        hrAdministration.setCreateAt(dtohradministration.getCreateAt());
        hrAdministration.setUpdateAt(dtohradministration.getUpdateAt());
        return hrAdministration;
    }

}
