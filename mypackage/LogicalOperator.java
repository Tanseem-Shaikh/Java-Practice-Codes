package mypackage;

public class LogicalOperator {
	public static void main(String args[]) {
		
            // && Operator		    
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("------------------------");
		
		 // || Operator
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("-------------------------");
		
		boolean check=true;
		System.out.println(10>8 && 2<9);
		System.out.println((20<5 && 27>=11)|| 22<=22);
		System.out.println((10>=18 || 20<9) && check);
		System.out.println((4<=5 && 45>20 || 2<3));
		System.out.println("-------------------------");
		
         // ! Operator		
		System.out.println(!true);
		System.out.println(!false);
		
         //	Practice	
		System.out.println(!(10>8 && 2<9));
		System.out.println((20<5 && 27>=11)|| !(22<=22));
		System.out.println(!(10>=18 || 20<9) && check);
		System.out.println((4<=5 && 45>20 || 2<3 && 9<=1 && check));
		
		System.out.println("-------------------------");
		boolean checks = true;
		
				System.out.println(10 > 45 && 20 < 9 || checks && true);
				System.out.println((true) || 0 < 9 || checks || 0 > 0);
				System.out.println(1 > 5 || 2 < 9 || false && 0 == 0);
				System.out.println(checks && (20 < 9) || 45 != 0 && true);

	}

}
