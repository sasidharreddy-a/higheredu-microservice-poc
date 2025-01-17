package com.micro.department_service.service;

import java.util.List;

import com.micro.department_service.model.Department;

public interface DepartmentService {
	
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
    Department updateDepartment(Long departmentId, Department department);
    List<Department> getAllDepartments();
    void deleteDepartment(Long departmentId);
}
