package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.Dtoarchiteture;
import com.example.apispringvuejs.Entity.Architeture;
import com.example.apispringvuejs.Repository.ArchitetureRepository;
import com.example.apispringvuejs.Service.Impl.ArchitetureServiceImpl;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/architetures")
@CrossOrigin("http://localhost:3000")
public class ArchitetureController {
    @Autowired
    private ArchitetureServiceImpl architetureServiceImpl;

    @Autowired
    private ArchitetureRepository architetureRepository;

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Dtoarchiteture>> getAllArchiteture(){
        List<Dtoarchiteture> dtoarchitetures = this.architetureServiceImpl.getAllArchiteture();
        if(dtoarchitetures != null){
            return ResponseEntity.ok(dtoarchitetures);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtoarchitetures);
        }
    }
    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity createArchiteture (@RequestBody() Dtoarchiteture dtoarchiteture){
            boolean isSuccess = this.architetureServiceImpl.createArchiteture(dtoarchiteture);
            if(isSuccess){
                return ResponseEntity.ok(isSuccess);
            }else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
            }
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity updateArchiteture(@PathVariable Long id,@RequestBody Dtoarchiteture dtoarchiteture){
        dtoarchiteture.setId(id);
        boolean isSuccess = this.architetureServiceImpl.updateArchiteture(dtoarchiteture);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }
    @GetMapping("/architeture/{id}")
    @ResponseBody
    public ResponseEntity getArchiteture (@PathVariable Long id){
        Dtoarchiteture dtoarchiteture = this.architetureServiceImpl.getArchitetureDtoById(id);
        if(dtoarchiteture!= null){
            return ResponseEntity.ok(dtoarchiteture);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtoarchiteture);
        }
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity deleteArchiteture (@PathVariable Long id){
        boolean isSuccess = this.architetureServiceImpl.deleteArchiteture(id);
        if(isSuccess){
            return ResponseEntity.ok(isSuccess);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(isSuccess);
        }
    }
}
