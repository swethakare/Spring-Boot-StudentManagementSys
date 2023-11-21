package com.project.swedemo.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_survey")
public class StudentSurveyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip", nullable = false)
    private String zip;

    @Column(name = "telephone_number", nullable = false)
    private String telephoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_of_survey", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfSurvey;

    @Enumerated(EnumType.STRING)
    @Column(name = "liked_about_campus")
    private LikedAboutCampus likedAboutCampus;

    @Enumerated(EnumType.STRING)
    @Column(name = "interested_in_university")
    private InterestedInUniversity interestedInUniversity;

    @Enumerated(EnumType.STRING)
    @Column(name = "likelihood_of_recommendation")
    private LikelihoodOfRecommendation likelihoodOfRecommendation;
    
    public StudentSurveyData(){
    	
    }
    
    public StudentSurveyData(String firstName, String lastName, String streetAddress, String city, String state,
            String zip, String telephoneNumber, String email, Date dateOfSurvey) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.streetAddress = streetAddress;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.telephoneNumber = telephoneNumber;
			this.email = email;
			this.dateOfSurvey = dateOfSurvey;
	}

    // Getters and setters

    // Getters
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public LikedAboutCampus getLikedAboutCampus() {
        return likedAboutCampus;
    }

    public InterestedInUniversity getInterestedInUniversity() {
        return interestedInUniversity;
    }

    public LikelihoodOfRecommendation getLikelihoodOfRecommendation() {
        return likelihoodOfRecommendation;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public void setLikedAboutCampus(LikedAboutCampus likedAboutCampus) {
        this.likedAboutCampus = likedAboutCampus;
    }

    public void setInterestedInUniversity(InterestedInUniversity interestedInUniversity) {
        this.interestedInUniversity = interestedInUniversity;
    }

    public void setLikelihoodOfRecommendation(LikelihoodOfRecommendation likelihoodOfRecommendation) {
        this.likelihoodOfRecommendation = likelihoodOfRecommendation;
    }

    // Inner Enums
    // ... (same as previously provided)
    public enum LikedAboutCampus {
        STUDENTS,
        LOCATION,
        CAMPUS,
        ATMOSPHERE,
        DORM_ROOMS,
        SPORTS
    }

    public enum InterestedInUniversity {
        FRIENDS,
        TELEVISION,
        INTERNET,
        OTHER
    }

    public enum LikelihoodOfRecommendation {
        VERY_LIKELY,
        LIKELY,
        UNLIKELY
    }

}
