package br.code.api.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = -3191207047785237499L;

    public enum Gender {
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
