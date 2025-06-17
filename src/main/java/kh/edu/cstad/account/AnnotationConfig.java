package kh.edu.cstad.account;
import kh.edu.cstad.account.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class AnnotationConfig {
    public void printStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("Saina Ina");
        student.setScore(23.33);
        System.out.println(student);
    }

}
