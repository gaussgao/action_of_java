package springDemo.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDemo.User;  

public class Case1 {

	public static void main(String[] args) {


		ApplicationContext context =new ClassPathXmlApplicationContext("appContextxml.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
		}
	

	
}
