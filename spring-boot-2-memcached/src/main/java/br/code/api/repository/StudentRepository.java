package br.code.api.repository;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentRepository {

    public List<Student> getAll() {
        System.out.println("reading-from-repo");
        List<Student> all = Arrays.asList(
                new Student("STD-01", "John Who", Student.Gender.MALE, 1),
                new Student("STD-02", "John Waa", Student.Gender.MALE, 1),
                new Student("STD-03", "John How", Student.Gender.MALE, 1)
        );
        return all;
    }

}
