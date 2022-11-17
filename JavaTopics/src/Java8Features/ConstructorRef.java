package Java8Features;

interface TestInterface5{
	void abc();
	//void abc1();
}

// Constructor reference 


public class ConstructorRef {

	ConstructorRef(){
		System.out.println("my method ");

	}
	
	public static void main(String[] args) {
		
//		TestInterface i=new Day9Demos()::myMethod;
		
		ConstructorRef d=new ConstructorRef();
		
		//Referring the constructor to the interface method
		TestInterface5 i=ConstructorRef::new;	
		i.abc();
		
	}

}