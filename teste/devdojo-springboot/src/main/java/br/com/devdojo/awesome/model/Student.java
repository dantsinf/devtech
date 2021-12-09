package br.com.devdojo.awesome.model;

public class Student {
    //fez essa string e gerou um contrutor com e sem nome e get e set
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
