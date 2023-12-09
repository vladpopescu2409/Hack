package com.project.HR.Connect.controller;

import com.project.HR.Connect.entitie.FAQ;
import com.project.HR.Connect.service.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Controller {

    @Autowired
    private FAQService faqService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    boolean test(){
        return true;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/faq")
    List<FAQ> getAllFAQ(){
        return faqService.getAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/faq")
    void getAllFAQ(@RequestBody FAQ faq){
        faqService.add(faq);
    }
}
