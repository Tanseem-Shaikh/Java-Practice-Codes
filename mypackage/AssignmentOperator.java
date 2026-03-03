package mypackage;

public class AssignmentOperator {
			public static void main(String args[]) {
			int a=10;
			a=+2;
			System.out.println(a);  //2
			a+=2;
			System.out.println(a);  //4
			a%=2;
			System.out.println(a); //0
			System.out.println(a-=7);  //-7
			System.out.println(a);  //-7
			a/=2;
			System.out.println(a);//-3
			a*=5;
			System.out.println(a);
			
			System.out.println("---------------------------------");
			
			// Practice
			
			int i=4;
			i++; //5
			System.out.println(i); //5
		    i+=4; //9
		    --i; //8
			System.out.println(i++); //8  //9
			System.out.println(i-2); //7
			++i;  //10
			int b=i+8;  //18
			System.out.println(i++);  //10  //11
			i%=2;  //1
			System.out.println(--i);  //0
			i--; //-1
			System.out.println(i); //-1
			b++; //19
			i*=b; //-19
			System.out.println(i); //-19
			System.out.println(b); // 19
			
		}
	}


