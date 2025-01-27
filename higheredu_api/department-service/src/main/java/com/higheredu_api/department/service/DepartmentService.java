package com.higheredu_api.department.service;

import com.higheredu_api.department.model.Department;

import java.util.List;

public interface DepartmentService {
	
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
    Department updateDepartment(Long departmentId, Department department);
    List<Department> getAllDepartments();
    void deleteDepartment(Long departmentId);
}
