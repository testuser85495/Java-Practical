package com.core.SpringCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext conn =  new ClassPathXmlApplicationContext("com/core/SpringCore/config.xml");
        User u = (User) conn.getBean("u1");
        System.out.println(u);
    }
}
