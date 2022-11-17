package wp.xm_based;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//lazy loading-> object are loaded only when they r required
		
		
    			//Book book=new Book(5, "My life");
    			//System.out.println(book);
    			
    	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring1.xml"));		
    			
    	//Get bean by Type
//    	Book book1= factory.getBean(Book.class);

    	//Get bean by id
//    	Book book2= (Book) factory.getBean("book3");

//    	System.out.println(book1);
    	
//    	System.out.println(book2);
    	
    	Library library = factory.getBean(Library.class);
    	System.out.println(library);
    }
}
