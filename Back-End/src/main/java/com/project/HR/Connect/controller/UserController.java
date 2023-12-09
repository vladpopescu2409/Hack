package com.project.HR.Connect.controller;

import com.project.HR.Connect.entitie.User;
import com.project.HR.Connect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAll());
    }

    @PutMapping
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<?> addUser(@RequestBody User user){
        var out = userService.add(user);
        if (out.getFirst()){
            return ResponseEntity.ok(user);
        }else{
            return ResponseEntity.badRequest().body(out.getSecond());
        }
    }
}
