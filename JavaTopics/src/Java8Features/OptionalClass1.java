package Java8Features;

import java.util.Optional;

public class OptionalClass1 {

	public static void main(String[] args) {

		
		//String name=null;
		
		String name="Hello world";
		
		//name.toUpperCase();
		
		Optional<String> optStr= Optional.ofNullable(name);
		String res= optStr.orElse("name is null").toUpperCase();
		
		System.out.println(res);
		
	}

}