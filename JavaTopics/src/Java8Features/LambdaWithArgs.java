package Java8Features;

@FunctionalInterface // ensures below interface is functional
interface TestInterface3{
	float converter(float dollar);

}


public class LambdaWithArgs {
	public static void main(String[] args) {
		
		
	TestInterface3 i= (dollar)->{
			float res=(dollar*80);
			//System.out.println(" Rupees "+res);
			return res;
		};
	
		float x= i.converter(10);
		System.out.println(x +"Rupees"); 
	
		
		
		
	}

}