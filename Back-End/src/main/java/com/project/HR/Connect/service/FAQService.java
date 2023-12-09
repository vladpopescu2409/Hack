package com.project.HR.Connect.service;

import com.project.HR.Connect.entitie.FAQ;
import com.project.HR.Connect.repository.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FAQService {

    @Autowired
    private FAQRepository faqRepository;

    public List<FAQ> getAll(){
        return faqRepository.getAllByAnswerNot("");
    }

    public void add(FAQ faq){
        faqRepository.save(faq);
    }
}
