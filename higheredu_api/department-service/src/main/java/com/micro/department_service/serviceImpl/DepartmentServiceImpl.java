package com.micro.department_service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.department_service.model.Department;
import com.micro.department_service.repository.DepartmentRepository;
import com.micro.department_service.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        // Save the department to the database
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        // Retrieve a department by its ID
        return departmentRepository.findById(departmentId).orElse(null);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department updatedDepartment) {
        // Find the existing department and update its details
        return departmentRepository.findById(departmentId).map(existingDepartment -> {
            existingDepartment.setDepartmentName(updatedDepartment.getDepartmentName());
            existingDepartment.setDepartmentAddress(updatedDepartment.getDepartmentAddress());
            existingDepartment.setDepartmentCode(updatedDepartment.getDepartmentCode());
            existingDepartment.setDescription(updatedDepartment.getDescription());
            existingDepartment.setDepartmentType(updatedDepartment.getDepartmentType());
            existingDepartment.setDepartmentState(updatedDepartment.getDepartmentState());
            // Save and return the updated department
            return departmentRepository.save(existingDepartment);
        }).orElse(null);
    }

    @Override
    public List<Department> getAllDepartments() {
        // Retrieve all departments
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        // Delete a department by its ID
        departmentRepository.deleteById(departmentId);
    }
}
