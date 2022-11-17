
package java_based.java_annotation_based_project;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean
	public Book getBook()
	{
		return new Book("My Last WorldCup", 55);
	}
}
