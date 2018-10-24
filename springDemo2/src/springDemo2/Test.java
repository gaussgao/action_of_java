package springDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDemo2.Client;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {


		context = new ClassPathXmlApplicationContext("NewFile.xml");
		
		Client user = (Client)context.getBean("user");
		
		System.out.println(user);
		
	
		
		}
	
	
	
}
