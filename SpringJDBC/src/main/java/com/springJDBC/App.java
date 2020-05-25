package com.springJDBC;

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
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
    	CustomerDao dao=(CustomerDao)ctx.getBean("custDao");
        System.out.println( "Hello World!" );
        System.out.println("Run.......................");
		Customer customer= new Customer(2,"Subhash","s@gmail",12345,"BLR");
		dao.addCstomer(customer);
    }
}
