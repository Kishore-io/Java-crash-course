package Java8Features;

@FunctionalInterface
interface TestInterface7
{

	void disp();
	
	static  void test()
	{
		
		System.out.println("static meth test in interface");
	}
	
}


public class StaticMethods {

	public static void main(String[] args) {
		
		TestInterface7 i=new TestInterface7() {
			
			@Override
			public void disp() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		
		TestInterface7.test();
		i.disp();
	}

}