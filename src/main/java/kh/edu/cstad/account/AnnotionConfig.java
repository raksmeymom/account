// AnnotionConfig.java
package kh.edu.cstad.account;

import org.springframework.stereotype.Component;

@Component
public class AnnotionConfig {
    public void printStudent() {
        Student student = new Student();
        student.setId(1);
        student.setFullname("Tola");
        student.setScore(95.5);

        System.out.println("Student from AnnotionConfig:");
        System.out.println(student);
    }
}
