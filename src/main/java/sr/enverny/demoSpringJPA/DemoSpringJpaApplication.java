package sr.enverny.demoSpringJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student maria = new Student(
					"Maria", "Jones", "maria.jones@hotmail.com", 21
			);
			studentRepository.save(maria);
		};
	}
}
