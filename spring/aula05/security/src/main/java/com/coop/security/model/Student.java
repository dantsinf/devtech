package com.coop.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
//lombok, ta simplificando a escrita do código
@Setter //cria métodos setter, com lombok
@Getter //cria métodos getter, com lombok
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private String description;
    private List<Course> courses;

}
