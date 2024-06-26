package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtoarchiteture;
import com.example.apispringvuejs.Entity.Architeture;

public class MapperArchiteture {
    public static Dtoarchiteture MapToDtoArchiteture (Architeture architeture){
        Dtoarchiteture dtoarchiteture = new Dtoarchiteture();
        dtoarchiteture.setId(architeture.getId());
        dtoarchiteture.setTitle(architeture.getTitle());
        dtoarchiteture.setDescription(architeture.getDescription());
        dtoarchiteture.setContent(architeture.getContent());
        dtoarchiteture.setImage(architeture.getImage());
        dtoarchiteture.setCreateAt(architeture.getCreatedAt());
        dtoarchiteture.setUpdateAt(architeture.getUpdatedAt());
        return dtoarchiteture;
    }
    public static Architeture MapToArchiteture (Dtoarchiteture dtoarchiteture){
        Architeture architeture = new Architeture();
        architeture.setId(dtoarchiteture.getId());
        architeture.setTitle(dtoarchiteture.getTitle());
        architeture.setDescription(dtoarchiteture.getDescription());
        architeture.setContent(dtoarchiteture.getContent());
        architeture.setImage(dtoarchiteture.getImage());
        architeture.setCreatedAt(dtoarchiteture.getCreateAt());
        architeture.setUpdatedAt(dtoarchiteture.getUpdateAt());
        return architeture;
    }
}
