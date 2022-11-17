package Java8Features;

interface TestInterface1{
	void disp();
	void abc();
}

 // A class doesn't have any explicit name but its methods gets implemented , it is called Anonymous class.


public class AnonymousClass {
	public static void main(String[] args) {
//		
//		TestInterface i= ()->{
//			
//			System.out.println("disp meth with lambda");
//		};
//	
//		i.disp();
		

		TestInterface1 i1=new TestInterface1() {
			
			@Override
			public void disp() {
			System.out.println("disp meth override");			
			}
			
			@Override
			public void abc() {
				System.out.println("abc meth override");
			}
		};
		
		
		i1.disp();
		i1.abc();
		
	}

}