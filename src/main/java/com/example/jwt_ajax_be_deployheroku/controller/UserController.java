package com.example.jwt_ajax_be_deployheroku.controller;

import com.example.jwt_ajax_be_deployheroku.dto.response.ResponseMessage;
import com.example.jwt_ajax_be_deployheroku.model.Users;
import com.example.jwt_ajax_be_deployheroku.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<Users> users = userService.findById(id);
        if (!users.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userService.deleteById(id);
        return new ResponseEntity<>(new ResponseMessage("Delete success!"), HttpStatus.OK);
    }
}
