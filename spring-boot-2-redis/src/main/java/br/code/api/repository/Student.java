package br.code.api.repository;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
public class Student implements Serializable {

    private static final long serialVersionUID = -3191207047785237499L;

    public enum Gender {
        MALE, FEMALE
    }

    public Student() {}

    public Student(String id, String name, Gender gender, int grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
