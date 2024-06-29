package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtoapply;
import com.example.apispringvuejs.Entity.Apply;

public class MapperApply {
    public static Dtoapply mapToDtoApply(Apply apply) {
        Dtoapply dtoApply = new Dtoapply();
        dtoApply.setId(apply.getId());
        dtoApply.setTitle(apply.getTitle());
        dtoApply.setContent(apply.getContent());
        dtoApply.setDescription(apply.getDescription());
        dtoApply.setImage(apply.getImage());
        dtoApply.setCreateAt(apply.getCreateAt());
        dtoApply.setUpdateAt(apply.getUpdateAt());
        return dtoApply;
    }
    public static Apply mapToApply(Dtoapply dtoApply) {
        Apply apply = new Apply();
        apply.setId(dtoApply.getId());
        apply.setTitle(dtoApply.getTitle());
        apply.setContent(dtoApply.getContent());
        apply.setDescription(dtoApply.getDescription());
        apply.setImage(dtoApply.getImage());
        apply.setCreateAt(dtoApply.getCreateAt());
        apply.setUpdateAt(dtoApply.getUpdateAt());
        return apply;
    }
}
