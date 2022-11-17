package Java8Features;

interface TestInterface{
	void disp();
}

class TestClass implements TestInterface{
	@Override
	public void disp() {
		System.out.println("disp meth");
	}
}

public class Interface {
	public static void main(String[] args) {
		
		TestInterface i=new TestClass();
		i.disp();
		
	}

}