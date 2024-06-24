package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtoapply;
import com.example.apispringvuejs.Entity.Apply;

public class MapperApply {
    public Dtoapply MapTotoApply (Apply apply){
        Dtoapply dtoapply = new Dtoapply();
        dtoapply.setId(apply.getId());
        dtoapply.setTitle(apply.getTitle());
        dtoapply.setContent(apply.getContent());
        dtoapply.setDescription(apply.getDescription());
        dtoapply.setImage(apply.getImage());
        dtoapply.setCreateAt(apply.getCreateAt());
        dtoapply.setUpdateAt(apply.getUpdateAt());
        return dtoapply;
    }
    public Apply MapToDtoApply (Dtoapply dtoapply){
        Apply apply = new Apply();
        apply.setId(dtoapply.getId());
        apply.setTitle(dtoapply.getTitle());
        apply.setDescription(dtoapply.getDescription());
        apply.setContent(dtoapply.getContent());
        apply.setImage(dtoapply.getImage());
        apply.setCreateAt(dtoapply.getCreateAt());
        apply.setUpdateAt(dtoapply.getUpdateAt());
        return apply;
    }
}
