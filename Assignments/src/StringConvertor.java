import java.util.Scanner;

public class StringConvertor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = convertToLowerCase(str);
		
		System.out.println("Reversed String is : " +res);
	}

	//Upper case - 65 to 90
	//Lower case -97 to 122
	//Numbers - 48 to 57
	private static String convertToLowerCase(String str) {
		int n = str.length();
		char[] arr = str.toCharArray();
		for(int i=0;i<n;i++) {
			int x = (int)arr[i];
			if(x>=65 && x<=90) {
				x = x+32;
			}
			arr[i] = (char) x;
		}
		
		String res = String.valueOf(arr);
		return res;
	}
}
