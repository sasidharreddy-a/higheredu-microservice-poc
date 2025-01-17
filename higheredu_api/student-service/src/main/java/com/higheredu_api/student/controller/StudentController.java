package com.higheredu_api.student.controller;

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

import com.higheredu_api.student.model.Student;
import com.higheredu_api.student.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/students")
@AllArgsConstructor
public class StudentController {

	@Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        Student savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long studentId){
        Student student = studentService.getStudent(studentId);
        if(student == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(student);
    }
    
    @PutMapping("/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long studentId, @RequestBody Student student) {
    	Student updatedStudent = studentService.updateStudent(studentId, student);
    	if (updatedStudent != null) {
    	   return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    	} else {
    	   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }
   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        String result = studentService.deleteStudent(id);
        if (result.equals("Student deleted successfully.")) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
}