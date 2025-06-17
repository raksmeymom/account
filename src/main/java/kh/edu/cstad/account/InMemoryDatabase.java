package kh.edu.cstad.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class InMemoryDatabase {

    @Bean
    public List<Student> students() {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(1);
        student1.setFullname("Kanha");
        student1.setScore(85.5);

        Student student2 = new Student();
        student2.setId(2);
        student2.setFullname("Mey");
        student2.setScore(92.0);

        students.add(student1);
        students.add(student2);

        return students;
    }
}
