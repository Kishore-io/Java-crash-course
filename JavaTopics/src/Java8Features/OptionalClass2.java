package Java8Features;

import java.util.Optional;

public class OptionalClass2 {

	public static void main(String[] args) {

		
//		String name=null;
		
		String name="Hello world";
		
		Optional<String> optStr=Optional.ofNullable(name);
		
//		System.out.println(optStr.get());
		if(optStr.isPresent())
			System.out.println("not null "+name.toUpperCase());
		else
			System.out.println("name is null");
			
			
	}

}