package kh.edu.cstad.account;


import kh.edu.cstad.account.InMemoryDatabase;
import kh.edu.cstad.account.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class TestController {

    private final List<Student> students;
    private final InMemoryDatabase inMemoryDatabase;

    @GetMapping("/add")
    public void add(){
        Student student = new Student();
        student.setId(3);
        student.setName("Mey Mom");
        student.setScore(34.33);
        inMemoryDatabase.insert(student);
    }

    @GetMapping("/api/students")
    public List<Student> test(){
        return students;
    }
}
