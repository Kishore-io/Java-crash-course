package Java8Features;

@FunctionalInterface
interface TestInterface6
{

	void disp();
	
	default void test()
	{
		
		System.out.println("def meth test in interface");
	}
	
}


public class DefaultInterface {

	public static void main(String[] args) {
		
//		Default methods can be overridden  through Anonymous inner classes without reducing their visibility
		
//		TestInterface6 t = new TestInterface6() {
//			
//			@Override
//			public void disp() {
//				System.out.println("Displayed");
//			}
//			
//			public void test() {
//				System.out.println("Overriden");
//			}
//		};
		
		TestInterface6 i=()->{ System.out.println("disp");};
		
		i.disp();
		i.test();
		
//		t.test();
//		t.disp();
		
	}

}