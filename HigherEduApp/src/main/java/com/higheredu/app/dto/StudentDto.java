package com.higheredu.app.dto;

public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long totalCharges; 
    private Long totalCredits;
    
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
    
    
	public StudentDto(Long id, String firstName, String lastName, String email, Long totalCharges, Long totalCredits) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.totalCharges = totalCharges;
		this.totalCredits = totalCredits;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
