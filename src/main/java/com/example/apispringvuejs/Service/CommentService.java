package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.Dtocomment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    boolean createCommentDto(Dtocomment dtocomment);
    List<Dtocomment> getCommentsByHrId (Long id);
}
