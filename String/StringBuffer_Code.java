package mypackage;

public class StringBuffer_Code {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Shaikh");
		sb.append(" Tanseem");
		System.out.println(sb);

		String str = "I Love";
		StringBuffer sb1 = new StringBuffer(str);
		sb1.insert(6, " Programming");
		System.out.println(sb1);
		sb1.delete(15, 18);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);

		StringBuffer s = new StringBuffer("India");
		s.replace(0, 5, "Bharat");
		System.out.println(s);
		String str1 = s.toString(); // convert stringbuffer to string
		System.out.println("converted string:" + str1);

		System.out.println(s.length());
		System.out.println(s.capacity());

	}
}
