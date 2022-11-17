package Java8Features;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsAndFilters {

	public static void main(String[] args) {
		
		ArrayList<Integer> test=new ArrayList<Integer>();
		
		
		test.add(6);
		test.add(5);
		test.add(3);
		test.add(2);
		test.add(1);
		test.add(11);
		test.add(16);
		test.add(15);
		test.add(13);
		test.add(12);
		test.add(22);
		test.add(3);
		test.add(16);


		
		
//		Stream<Integer> s= test.stream();
//		s=s.filter((x)->(x>10));
//		System.out.println(s.collect(Collectors.toList()));
	
//		Stream<Integer> s =test.stream().filter(x->(x>10));
//		s.forEach(x->{System.out.println(x);} );
		
		test.stream().filter(x->(x>10)).forEach(x->{System.out.println(x);} );

		System.out.println("-------");
		test.forEach(x->{System.out.println(x);});
		
		System.out.println("Set values are: ");
		Set<Integer> evenValues = test.stream().filter(x->(x%2==0)).collect(Collectors.toSet());
		System.out.println(evenValues);
	
	
	}

}