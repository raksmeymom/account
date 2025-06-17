// AccountApplication.java
package kh.edu.cstad.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

	private final AnnotionConfig config;
	private final Student student;

	@Autowired
	private List<Student> students;

//	private final List<Student> students;

	@Autowired
	public void SomeService(List<Student> students) {
		this.students = students;
	}


	// Constructor Injection for required beans
	@Autowired
	public AccountApplication(AnnotionConfig config, Student student) {
		this.config = config;
		this.student = student;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(" Running Application...");

		System.out.println(" [From AnnotionConfig]");
		config.printStudent();

		System.out.println(" [Injected Student in Bean]");
		System.out.println(student);
	}
}
