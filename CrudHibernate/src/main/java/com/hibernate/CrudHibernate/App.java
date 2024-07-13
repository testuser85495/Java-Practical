package com.hibernate.CrudHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		User u1 = new User(1,"java", 987654321, "anand", "p@gmail.com", "java123");
//		session.save(u1);

		session.update(u1);

		User u = session.get(User.class, 2);
		System.out.println(u);

		tx.commit();
		session.close();
		sf.close();
	}
}
