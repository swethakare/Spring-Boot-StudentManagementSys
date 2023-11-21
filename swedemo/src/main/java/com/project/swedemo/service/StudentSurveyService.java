package com.project.swedemo.service;

import java.util.*;
import com.project.swedemo.model.StudentSurveyData;
public interface StudentSurveyService {
	/* The application allows prospective students to provide survey feedback about their campus visit. 
	It also allows users to view all surveys recorded to date. 
	The application also provide capabilities to update and delete a specific survey. */
	StudentSurveyData addStudentSurveyData(StudentSurveyData student);// add all the information related to the student to the database
	List<StudentSurveyData> getAllStudentSurveyRecord(); // Retrieves all the studentSurveyRecords
	StudentSurveyData updateStudentSurvey(StudentSurveyData student,Long id); // Updates a specific student survey
	void deleteStudentSurvey(Long id);// Delete a specific student survey
	StudentSurveyData getStudentById(Long id);

}
