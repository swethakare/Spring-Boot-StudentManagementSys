package com.project.swedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.swedemo.model.StudentSurveyData;
import com.project.swedemo.service.*;

@RestController
@RequestMapping("/api/students")
public class StudentSurveyController {
	
	@Autowired
	private StudentSurveyService studentService;

	public StudentSurveyController(StudentSurveyService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@PostMapping
	public ResponseEntity<StudentSurveyData> saveStudent(@RequestBody StudentSurveyData student){
		return new ResponseEntity<StudentSurveyData>(studentService.addStudentSurveyData(student),HttpStatus.CREATED);	
	}
	// Retrieve all the students
	@GetMapping
	public List<StudentSurveyData> getAllStudentSurveyData() {
		return studentService.getAllStudentSurveyRecord();		
	}
	// Retrieve student by id
	@GetMapping("/{id}")
	public ResponseEntity<StudentSurveyData> getStudentById(@PathVariable("id") Long studentId){
		return new ResponseEntity<StudentSurveyData>(studentService.getStudentById(studentId),HttpStatus.OK);
	}
	// update
	@PutMapping("/{id}")
	public ResponseEntity<StudentSurveyData> updateStudent(@PathVariable("id") Long id, @RequestBody StudentSurveyData student){
		return new ResponseEntity<StudentSurveyData>(studentService.updateStudentSurvey(student,id),HttpStatus.OK);
	}
	//delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id){
		studentService.deleteStudentSurvey(id);
		return new ResponseEntity<String>("Employee deleted successfully.!",HttpStatus.OK);
	}
	

}