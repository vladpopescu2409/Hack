package com.project.HR.Connect.repository;

import com.project.HR.Connect.entitie.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FAQRepository extends JpaRepository<FAQ, Integer> {

    List<FAQ> getAllByAnswerNot(String s1);

}
