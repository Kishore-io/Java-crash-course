package Java8Features;
import java.util.ArrayList;
import java.util.Collections;

import com.wp.collections.Student;

public class LambdaWithCompartor {
	public static void main(String[] args) {
		
		
		Student student1=new Student(1, "Raj", 40);
		Student student2=new Student(2, "Raju", 40);
		Student student3=new Student(3, "Rajesh", 40);
		Student student4=new Student(4, "Raja", 40);
		
		ArrayList<Student> students=new ArrayList<Student>();
		
		
		students.add(student4);
		students.add(student2);
		students.add(student3);
		students.add(student1);
		
		
		Collections.sort(students,(o1,o2)->{return o1.getRollNo() - o2.getRollNo();});
//		Collections.sort(students,(o1,o2)->(o1.getRollNo() - o2.getRollNo()));
		
		students.forEach((x) -> System.out.println(x));
		//Method reference
//		students.forEach(System.out::println);
		
		System.out.println("\n");

		
		for(Student s:students)
		{
			System.out.println(s);
		}
		
		
	}

}