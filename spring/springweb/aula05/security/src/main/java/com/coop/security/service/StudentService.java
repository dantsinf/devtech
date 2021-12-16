package com.coop.security.service;

import com.coop.security.model.Course;
import com.coop.security.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class StudentService {
    private static List<Student> students = new ArrayList<>();

    static {
        //aqui cri 3 tipos de estudante
        Course course1 = new Course("Course1", "Spring", "10 Steps",
                Arrays.asList("Learn Maven", "Import Project", "First Example",
                        "Second Example"));

        Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
                Arrays.asList("Learn Maven", "Import Project", "First Example",
                        "Second Example"));

        Student ranga = new Student("Student1", "Ranga Karanam",
                "Kiker, Programmer and Architect", new ArrayList<>(
                Arrays.asList(course1, course2)));
        students.add(ranga);
    }

    public Student retrieveStudent(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)){
            return student;
        }
    }
    return null;
    }

    public List<Course> retrieveCourses(String studentId){
        //busca dados do estudante
        Student student = retrieveStudent(studentId);
        if (student == null){
            return null;
        }
        return student.getCourses();
    }

}
