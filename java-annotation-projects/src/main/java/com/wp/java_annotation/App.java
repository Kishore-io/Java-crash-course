package com.wp.java_annotation;

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
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
//    	Book book = context.getBean(Book.class);
    	
    	Library library = context.getBean(Library.class);
    	Library library2 = (Library) context.getBean(Library.class);

    	library.setLibraryName("Saradhar Valla Bhai Patel Library");
    	System.out.println(library);
    	System.out.println(library2);

    	System.out.println("Home Address: "+library.getHomeAddress());
    	System.out.println("Office Address: "+library.getOfficeAddress());

    }
}
