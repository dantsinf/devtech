package com.coop.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
//lombok, ta simplificando a escrita do código
@Getter //cria métodos setter, com lombok
@Setter //cria métodos getter, com lombok
@AllArgsConstructor
public class Course {
    private String id;
    private String name;
    private String description;
    private List<String> steps;

    /* escrever @Getter e @Setter, lá encima é a mesma coisa que escrever o que está abaixo
    //lombok deixa a escrita menos verbosa
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }*/
}
