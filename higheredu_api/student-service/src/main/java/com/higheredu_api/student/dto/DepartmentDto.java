package com.higheredu_api.student.dto;

public class DepartmentDto {

    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    private String description;
    private String departmentType; 
    private String departmentState;

    // Default constructor
    public DepartmentDto() {
        super();
    }

    // Constructor with parameters
    public DepartmentDto(Long id, String departmentName, String departmentAddress, String departmentCode, 
                         String description, String departmentType, String departmentState) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
        this.description = description;
        this.departmentType = departmentType;
        this.departmentState = departmentState;
    }

    // Getters and Setters
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

    // toString() method
    @Override
    public String toString() {
        return "DepartmentDto [id=" + id + ", departmentName=" + departmentName + ", departmentAddress=" 
                + departmentAddress + ", departmentCode=" + departmentCode + ", description=" + description 
                + ", departmentType=" + departmentType + ", departmentState=" + departmentState + "]";
    }
}
