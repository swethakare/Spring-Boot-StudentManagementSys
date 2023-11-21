package com.project.swedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.swedemo.model.*;

@Repository
public interface StudentSurveyRepo extends JpaRepository<StudentSurveyData, Long>{

}