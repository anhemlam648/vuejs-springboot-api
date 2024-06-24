package com.example.apispringvuejs.Mapper;

import com.example.apispringvuejs.Dto.Dtocomment;
import com.example.apispringvuejs.Entity.Comment;
import com.example.apispringvuejs.Entity.HrAdministration;
import com.example.apispringvuejs.Entity.User;

public class MapperComment {
    public static Dtocomment MapToCommentDto(Comment comment){
        Dtocomment dtocomment = new Dtocomment();
        dtocomment.setId(comment.getId());
        dtocomment.setContent(comment.getContent());
        if(comment.getUsers() != null){
            dtocomment.setUsers(comment.getUsers().getId());
        }
        if(comment.getHrAdministration() != null){
            dtocomment.setHrAdministration(comment.getHrAdministration().getId());
        }
        return dtocomment;
    }
    public static Comment MapDtocomment(Dtocomment dtocomment){
        Comment comment = new Comment();
        comment.setId(dtocomment.getId());
        comment.setContent(dtocomment.getContent());
        if(dtocomment.getUsers() != null){
            User user = new User();
            user.setId(dtocomment.getId());
            comment.setUsers(user);
        }
        if(dtocomment.getHrAdministration() != null){
            HrAdministration hrAdministration = new HrAdministration();
            hrAdministration.setId(dtocomment.getHrAdministration());
            comment.setHrAdministration(hrAdministration);
        }
        return comment;
    }
}
