package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtouser;
import com.example.apispringvuejs.Entity.User;

public class MapperUser {
    public static Dtouser MapToUserDto (User user){
        Dtouser dtouser = new Dtouser();
        dtouser.setId(user.getId());
        dtouser.setUsername(user.getUsername());
        dtouser.setEmail(user.getEmail());
        dtouser.setPassword(user.getPassword());
        dtouser.setCreateAt(user.getCreateAt());
        dtouser.setUpdateAt(user.getUpdateAt());
        return dtouser;
    }
    public static User MapUser (Dtouser dtouser){
        User user = new User();
        user.setId(dtouser.getId());
        user.setEmail(dtouser.getEmail());
        user.setUsername(dtouser.getUsername());
        user.setPassword(dtouser.getPassword());
        user.setCreateAt(dtouser.getCreateAt());
        user.setUpdateAt(dtouser.getUpdateAt());
        return user;
    }
}
