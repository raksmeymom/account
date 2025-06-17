package kh.edu.cstad.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private List<Student> students;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }
}
