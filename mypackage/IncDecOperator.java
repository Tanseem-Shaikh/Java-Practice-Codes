package mypackage;

public class IncDecOperator {
	public static void main(String args[]) {
		 
		int a=10;
		System.out.println(a++);
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a--);
		System.out.println(a);
		System.out.println(a+5);
		
		a=7;
		System.out.println(a++);
		System.out.println(a);
		a--;
		System.out.println(--a);
		
		System.out.println("------------------------");

	    int i =90;
		i++; //91
		int j =i+9;  //100
		System.out.println(i); //91
		System.out.println(i++); //92
		--j; //99
		System.out.println(j*i);
		i++;  //93
		System.out.println(i);
		--i;  //92
		System.out.println(--i); //91
		++i; //92
		System.out.println(j+3);//102

		j--;//98
		++j;//99
		System.out.println(j+7);//109
		System.out.println(j);//99
		j--;//98
		i++; //93
		--i;  //92
        
		System.out.println(i+j);
		System.out.println(i); //92
		System.out.println(j); //98
		
		System.out.println("---------------------------------");
		int x=20;
		int y=5;
		--x; //19
		y++; //6
		++x; //20
		System.out.println(x--);//20
		System.out.println(x+y);  //25
		
		System.out.println(x-2); //17
		System.out.println(x); //19
		x--; //18
		--x; //17
		System.out.println(x);//17
		++y; //7
		System.out.println(x--); //17   //16
		int z=x-y;  //9
		System.out.println(z); //9
		System.out.println(x);  //16
		System.out.println(z++);  //9   //10
		--z;  //9
		y++;  //8
		System.out.println(x);  //16
		System.out.println(y);   //8
		System.out.println(z);   //9
		
		
		
		
		
		

	}
}
