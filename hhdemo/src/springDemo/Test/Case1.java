package springDemo.Test;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDemo.User;  

import org.springframework.orm.hibernate5.HibernateTemplate;

import org.hibernate.Session;

import org.hibernate.Transaction;

public class Case1 {

	public static void main(String[] args) {

		ApplicationContext context =new ClassPathXmlApplicationContext("appContextxml.xml");

		User user = (User)context.getBean("user");
		System.out.println(user);
		
		try
		{
			ApplicationContext context1 =new ClassPathXmlApplicationContext("appContextxml2.xml");
			
			HibernateTemplate ht = (HibernateTemplate) context1.getBean("hibernateTemplate");
			
			Session ses = ht.getSessionFactory().openSession();
			
			
			
			hd.User adduser = new hd.User("Sky1551","35533","409169399@qq.com","xiamen_sh55");
			
			Transaction trans = ses.beginTransaction();
			
			ses.save(adduser);
			
			trans.commit();
			
			ses.close();
			
			System.out.print("ok");
			
		}
		catch (Exception exp)
		{
			exp.printStackTrace();
		}
	}
	

	
}
