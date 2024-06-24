package com.example.apispringvuejs.Controllers;

import com.example.apispringvuejs.Dto.Dtohradministration;
import com.example.apispringvuejs.Service.Impl.HrAdministrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hradministration")
@CrossOrigin(origins = "http://localhost:3000")
public class HrAdministrationController {
        @Autowired
        private HrAdministrationServiceImpl hrAdministrationServiceImpl;

        @GetMapping("/list")
        @ResponseBody
        public ResponseEntity<List<Dtohradministration>> getAllHradministration(){
            List<Dtohradministration> dtohradministrationList = this.hrAdministrationServiceImpl.getAllHrAdministration();
            if(dtohradministrationList != null) {
                return ResponseEntity.ok(dtohradministrationList);
            }else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dtohradministrationList);
            }
        }
}
