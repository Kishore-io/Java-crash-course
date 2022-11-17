import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = reverse(str);
		
		System.out.println("Reversed String is : " +res);
	}

	private static String reverse(String str) {
		int n = str.length();
		char[] arr = str.toCharArray();
		int start = 0,end=n-1;
		while(start<end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;	end--;
		}
		String res = String.valueOf(arr);
//		String res = arr.toString();

		return res;
	}
}
