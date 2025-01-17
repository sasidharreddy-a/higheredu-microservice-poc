package com.higheredu.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private Long totalCharges;  
    private Long totalCredits;  

    // Default constructor
    public Student() {
        super();
    }

    // Constructor with fields
    public Student(Long id, String firstName, String lastName, String email, Long totalCharges, Long totalCredits) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
    }

    // Getters and Setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(Long totalCharges) {
        this.totalCharges = totalCharges;
    }

    public Long getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Long totalCredits) {
        this.totalCredits = totalCredits;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", totalCharges=" + totalCharges + ", totalCredits=" + totalCredits + "]";
    }
}
