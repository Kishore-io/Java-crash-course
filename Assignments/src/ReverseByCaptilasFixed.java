import java.util.Scanner;

public class ReverseByCaptilasFixed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = reverseByCaptialsFixed(str);
		
		System.out.println("Reversed String is : " +res);

	}

	private static String reverseByCaptialsFixed(String str) {
		int n = str.length();
		char[] arr = str.toCharArray();
		char[] temp = str.toCharArray();
		char[] rev = reverse(temp);
		
		
		System.out.println(arr[0]);
		for(int i=0;i<n;i++) {
			int x = (int)arr[i];
			int y = (int)rev[i];
			if(x>=65 && x<=90) {
				
				if(y>=97 && y<=122)
					rev[i] = (char)(y-32);
			}
			else {
				if(y>=65 && y<=90) {
					rev[i] = (char)(y+32);
				}
			}
		}
		String res = String.valueOf(rev);
 		return res;
	}
	
	
	private static char[] reverse(char[] arr) {
		int n = arr.length;
		int start = 0,end=n-1;
		while(start<end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;	end--;
		}

		return arr;
	}
}
