package mypackage;

public class Buffer_Builder_code {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Tanseem");
		sb.append(" Shaikh");
		System.out.println(sb);
		sb.insert(7," Afsar");
		System.out.println(sb);
		sb.delete(0, 8);
		System.out.println(sb);
              
		//Conver immutable string to mutable
		String City = "Pune";
		StringBuilder s = new StringBuilder(City);
		s.append(" city");
		System.out.println(s);
		System.out.println(City.hashCode());
		System.out.println(s.hashCode());

	}
}
