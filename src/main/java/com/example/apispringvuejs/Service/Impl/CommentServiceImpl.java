package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtocomment;
import com.example.apispringvuejs.Entity.Comment;
import com.example.apispringvuejs.Mapper.MapperApply;
import com.example.apispringvuejs.Mapper.MapperComment;
import com.example.apispringvuejs.Repository.CommentRepository;
import com.example.apispringvuejs.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }
    @Override
    public boolean createCommentDto(Dtocomment dtocomment) {
        Comment comment = MapperComment.mapToComment(dtocomment);
        Comment saveComment = commentRepository.save(comment);
        return saveComment != null;
    }


    public List<Dtocomment> getAllComment(){
        List<Dtocomment> dtocommentList = this.commentRepository.findAll()
                .stream().map(MapperComment::mapToCommentDto)
                .collect(Collectors.toList());
        return dtocommentList;
    }
}
