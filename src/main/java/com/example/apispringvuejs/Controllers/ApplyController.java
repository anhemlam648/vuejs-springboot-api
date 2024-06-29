package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.Dtoapply;
import com.example.apispringvuejs.Entity.Apply;
import com.example.apispringvuejs.Service.Impl.ApplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/apply")
@CrossOrigin("http://localhost:3000")
public class ApplyController {
    @Autowired
    private ApplyServiceImpl applyServiceImpl;

    @GetMapping("/list")
    @ResponseBody
    private ResponseEntity<List<Dtoapply>> GetAllApply(){
        List<Dtoapply> dtoapplyList = this.applyServiceImpl.getAllapply();
        if(dtoapplyList != null){
            return ResponseEntity.ok(dtoapplyList);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtoapplyList);
        }
    }
    @PostMapping("/add")
    @ResponseBody
    private ResponseEntity createApply (@RequestBody() Dtoapply dtoapply){
        boolean isSuccess = this.applyServiceImpl.createApply(dtoapply);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    private ResponseEntity updateApply (@PathVariable Long id,@RequestBody() Dtoapply dtoapply){
        dtoapply.setId(id);
        boolean isSuccess = this.applyServiceImpl.updateApply(dtoapply);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }
    @GetMapping("/applies/{id}")
    @ResponseBody
    private ResponseEntity getApplyById(@PathVariable Long id){
        Dtoapply dtoapply = this.applyServiceImpl.getApplyDtoById(id);
        if(dtoapply != null){
            return ResponseEntity.ok(dtoapply);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtoapply);
        }
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    private ResponseEntity DeleteApply (@PathVariable Long id){
        boolean isSuccess = this.applyServiceImpl.deleteApply(id);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }

}
