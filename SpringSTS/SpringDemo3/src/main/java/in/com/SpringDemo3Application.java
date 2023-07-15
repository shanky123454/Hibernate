package in.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.com.Impl.Student;

@SpringBootApplication
public class SpringDemo3Application {

	public static void main(String[] args) {
	ApplicationContext applicationContext =	SpringApplication.run(SpringDemo3Application.class, args);
	
	Student s = applicationContext.getBean("std",Student.class);
	String result =s.getDetails();
	System.out.println(result);
	}
	

}
