package Java8Features;

interface TestInterface4{
	void abc();
//  void abc1();
}


//  Method reference doesn't show any effect by return type

public class MethodRef {

	public static int myMethod(){
		System.out.println("my method ");
		return 100;
	}
	
	//Non-static methods
	public int myMethod1(){
		System.out.println("my method1 ");
		return 100;
	}
	
	public static void main(String[] args) {
		
		TestInterface4 i=MethodRef::myMethod;
		i.abc();

		//Another way of method referencing
		TestInterface4 j = new MethodRef()::myMethod1;
		j.abc();
		
	}

}