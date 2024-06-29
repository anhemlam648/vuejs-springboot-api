package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.Dtocomment;
import com.example.apispringvuejs.Service.Impl.CommentServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comments")
@CrossOrigin("http://localhost:3000")
public class CommentController {
    @Autowired
    private CommentServiceImpl commentServiceImpl;

    @PostMapping("/add")
    private ResponseEntity<Object> createComment(@RequestBody Dtocomment dtocomment, HttpSession httpSession){
        Long userId =(Long)httpSession.getAttribute("userId");
        if(userId !=null){
            return ResponseEntity.ok(userId);
        }
        boolean isSuccess = this.commentServiceImpl.createCommentDto(dtocomment);
        System.out.println("Gọi" + isSuccess);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }

    @GetMapping("/comment/{id}")
    private ResponseEntity<List<Dtocomment>> getCommentByHrId(@PathVariable Long id){
            List<Dtocomment>dtocommentList =commentServiceImpl.getCommentsByHrId(id);
            return ResponseEntity.ok(dtocommentList);
    }
}
