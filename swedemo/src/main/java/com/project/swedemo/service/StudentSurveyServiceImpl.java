package com.project.swedemo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.swedemo.exception.ResourceNotFoundException;
import com.project.swedemo.model.StudentSurveyData;
import com.project.swedemo.repository.*;

@Service
public class StudentSurveyServiceImpl implements StudentSurveyService {

// dependency injection helps us to make use of all the methods of the particular class.
@Autowired
private StudentSurveyRepo studentSurveyRepository;
	public StudentSurveyServiceImpl(StudentSurveyRepo studentSurveyRepository) {
		super();
		this.studentSurveyRepository = studentSurveyRepository;
	}
//adding all the information related to student to the database.	
	@Override
	public StudentSurveyData addStudentSurveyData(StudentSurveyData student) {
		return studentSurveyRepository.save(student);
	}
//creating a view of the entire list of items from the database
	@Override
	public List<StudentSurveyData> getAllStudentSurveyRecord() {
		return studentSurveyRepository.findAll();
	}
// Retrieving a student based on the student ID	
   @Override
   public StudentSurveyData getStudentById(Long id) {
	   return studentSurveyRepository.findById(id).get();
   }
   
//updating the required student information 	
	@Override
	public StudentSurveyData updateStudentSurvey(StudentSurveyData student, Long id) {
		StudentSurveyData existingStudent = studentSurveyRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student","Id",id));
		
		existingStudent.setLikedAboutCampus(student.getLikedAboutCampus());
		existingStudent.setLikelihoodOfRecommendation(student.getLikelihoodOfRecommendation());
		existingStudent.setInterestedInUniversity(student.getInterestedInUniversity());
		return studentSurveyRepository.save(student);
	}
//deleting an unnecessary row based on the specified id from the student table	
	@Override
	public void deleteStudentSurvey(Long id) {
		studentSurveyRepository.deleteById(id);	
	}
}
