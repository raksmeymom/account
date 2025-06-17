package kh.edu.cstad.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

	private final AnnotationConfig config;
	private final AnnotationConfig config2;

	private Student student;
	private Student student2;

	public AccountApplication(AnnotationConfig config, AnnotationConfig config2) {
		this.config = config;
		this.config2 = config2;
	}

	@Autowired
	@Qualifier("s1")
	public void setStudent(Student student) {
		this.student = student;
	}

	@Autowired
	@Qualifier("s2")
	public void setStudent2(Student student2) {
		this.student2 = student2;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(student);
		System.out.println(student2);
	}
}
