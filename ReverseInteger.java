
/*
 * 
 * For the given input integer, return its reverse value. e.g. -> i/p 123 , o/p = 321
 * if the result exceeds the integer range then return -1.
 * 
 */

public class ReverseInteger {

	public static void main(String[] args) {
		int num = Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE);
		int rev=0;
		while(num !=0) {
			int digit = num%10 ;
			if((rev > (Integer.MAX_VALUE/10)) || (rev < (Integer.MIN_VALUE/10))) { // actual logic if ans*10 is greater then MAX INT value or less then MIN INT Value
				System.out.println(-1);
				System.exit(1);
			}
			rev = rev*10 + digit;
			
			num  = num/10;
		}
		System.out.println("Reverse : "+rev);
		
	}

}
