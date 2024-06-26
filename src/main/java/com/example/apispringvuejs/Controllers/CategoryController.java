package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.Dtocategory;
import com.example.apispringvuejs.Service.Impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/categories")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Dtocategory>> getAllCategory(){
        List<Dtocategory> dtocategories = this.categoryServiceImpl.getAllCategory();
        if(dtocategories != null){
            return ResponseEntity.ok(dtocategories);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtocategories);
        }
    }
}
