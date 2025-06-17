package kh.edu.cstad.account;


import kh.edu.cstad.account.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InMemoryDatabase {

    public List<Student> data;
    public InMemoryDatabase() {
        Student student = new Student();
        student.setId(1);
        student.setName("Kanha");
        student.setScore(50.33);
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Raksmey");
        student2.setScore(85.22);
        this.data = new ArrayList<>();
        this.data.add(student);
        this.data.add(student2);
    }

    public void insert(Student student) {
        this.data.add(student);
    }
    @Bean
    public List<Student> students(Student s1,
                                  Student s2) {
        return data;
    }

    @Bean("s1")
    public Student student1(){
        Student student = new Student();
        student.setId(1);
        student.setName("Kanha");
        student.setScore(50.33);
        return student;
    }
    @Bean("s2")
    public Student student2(){
        Student student = new Student();
        student.setId(2);
        student.setName(" Raksmey ");
        student.setScore(85.22);
        return student;
    }

}
