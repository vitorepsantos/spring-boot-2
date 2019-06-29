package br.code.controller;

import br.code.api.repository.Student;
import br.code.api.repository.StudentRepository;
import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController() {}

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    @ReadThroughSingleCache(namespace = "students", expiration = 3600)
    public List<Student> get(@RequestParam @ParameterValueKeyProvider String key) {
        return studentRepository.getAll();
    }

}
