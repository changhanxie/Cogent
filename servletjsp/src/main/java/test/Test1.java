package test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Student;

public class Test1{
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Student s = (Student)ap.getBean("t");
	}
}