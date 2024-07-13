package collectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("collection Type");
		ApplicationContext conn =new ClassPathXmlApplicationContext("collectionType/config.xml");
		User u = (User)conn.getBean("u1");
		System.out.println(u);
		
		User u2 = (User)conn.getBean("u2");
		System.out.println(u2);
	}
}
