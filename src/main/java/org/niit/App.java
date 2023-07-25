package org.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext emp=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(emp.getBean(Employee.class));

        System.out.println( "Hello World!" );
    }
}
