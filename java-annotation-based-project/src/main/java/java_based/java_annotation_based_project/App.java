package java_based.java_annotation_based_project;

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
		ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Book book= factory.getBean(Book.class);

		System.out.println(book);
    }
}
