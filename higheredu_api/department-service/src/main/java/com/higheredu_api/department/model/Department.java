package com.higheredu_api.department.model;


import jakarta.persistence.*;
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    private String description;
    private String departmentType; 
    private String departmentState;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartmentType() {
		return departmentType;
	}
	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}
	public String getDepartmentState() {
		return departmentState;
	}
	public void setDepartmentState(String departmentState) {
		this.departmentState = departmentState;
	}
	
	public Department(String departmentName, String departmentAddress, String departmentCode, String description, String departmentType, String departmentState) {
		super();
	
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	    this.description = description;
	    this.departmentType = departmentType;
	    this.departmentState = departmentState;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
    @Override
    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentAddress=" 
                + departmentAddress + ", departmentCode=" + departmentCode + ", description=" + description 
                + ", departmentType=" + departmentType + ", departmentState=" + departmentState + "]";
    }
    
    
    
    
}
