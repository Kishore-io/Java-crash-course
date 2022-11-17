package Java8Features;

//The target type of this expression must be a functional interface

//functional interface : interface with 1 abstract method 

@FunctionalInterface  // ensures below interface is functional
interface TestInterface2{
	void disp();
//	void abc();
}


public class LambdaExp {
	public static void main(String[] args) {
		
		TestInterface2 i= ()->{
			
			System.out.println("disp meth with lambda");
		};
	
		i.disp();
		

		
	}

}
