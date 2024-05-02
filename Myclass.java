package Ch16.Project_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Myclass {
	@Bean
	public Quiz quiz1() {
		Quiz quiz=new Quiz();
		quiz.setQuizname("java");
		quiz.setQuizid(101);
		List Availablequizs=new ArrayList();
		Availablequizs.add("java");
		Availablequizs.add("Python");
		Availablequizs.add("Mysql");
		Availablequizs.add("Angular");
		quiz.setAvailablequizs(Availablequizs);
		return quiz;
		
	}
	@Bean
	public Student student1() {
		Student student=new Student("Meghana",101,quiz1());
		return student;
	}

}

