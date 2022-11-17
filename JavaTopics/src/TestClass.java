import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class TestClass {
//
//	public static void main(String args[]) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
//		String name = br.readLine();
//		System.out.println(num*2);
//		System.out.println(name);
//		
//	}

	 static int minCoins(int amount, int n, int arr[])
	    {
	        
	        int table[] = new int[amount + 1];
	        
	        table[0] = 0;
	 
	        for (int i = 1; i <= amount; i++)
	        table[i] = Integer.MAX_VALUE;
	 
	        for (int i = 1; i <= amount; i++)
	        {
	            for (int j = 0; j < n; j++)
	            if (arr[j] <= i)
	            {
	                int sub_res = table[i - arr[j]];
	                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
	                       table[i] = sub_res + 1;
	                         
	            }
	             
	        }
	       
	          if(table[amount]==Integer.MAX_VALUE)
	            return -1;
	       
	        return table[amount];
	         
	    }
}