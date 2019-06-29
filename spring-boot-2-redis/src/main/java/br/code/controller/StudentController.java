package br.code.controller;

import br.code.api.repository.Student;
import br.code.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public void StudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/add")
    public Student add() {
        Student student = new Student("Eng2015002", "John Doe", Student.Gender.MALE, 1);
        studentRepository.save(student);
        Student retrievedStudent = studentRepository.findById("Eng2015001").get();
        return retrievedStudent;
    }

}
