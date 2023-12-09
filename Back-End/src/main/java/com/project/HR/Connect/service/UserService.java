package com.project.HR.Connect.service;

import com.project.HR.Connect.entitie.User;
import com.project.HR.Connect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Pair<Boolean,String> add(User u){
        try {
            userRepository.save(u);
        }catch (DataIntegrityViolationException e){
            System.out.println(e);
            return Pair.of(false, "User was not added because of a database error.");
        }
        return Pair.of(true, "");
    }
}
