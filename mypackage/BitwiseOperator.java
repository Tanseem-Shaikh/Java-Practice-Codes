package mypackage;

public class BitwiseOperator {
	public static void main(String args[]) {
		
		System.out.println(Integer.toBinaryString(2)); //Wrapper Class
		
		// Bitwise AND Operator ---> &
	     int a=7;
	     int b=10;
	     System.out.println(a & b); 
	     
	 	// Bitwise OR Operator ---> |
	     int x=7;
	     int z=1;
	     System.out.println(x | z); 
	     
	     // Bitwise XOR Operator ---> ^
	     int c=9;
	     int d=3;
	     System.out.println(c ^ d ); 
	     
	     //  Bitwise Compliment Operator ---> ~
	     int y=-2;
	     System.out.println(~y); 
		
	    //Bitwise LeftShift Operator ---> <<
	     int m=3;
	     int n=2;
	     System.out.println(m<<n); 
	     
	     //Bitwise RightShift Operator ---> >>
	     int o=5;
	     int p=2;
	     System.out.println(o>>p); 
	}
}
