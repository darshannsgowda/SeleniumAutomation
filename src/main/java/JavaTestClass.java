import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class JavaTestClass {

	public static void main(String[] args) {
		//how to reverse a number using tostring
		int i = 828292;
		Integer.toString(i);
		i = Integer.parseInt(new StringBuffer(Integer.toString(i)).reverse().toString());
		System.out.println(i);
		// how to reverse a string
		String s1 = "Hello";
		StringBuffer sb1 = new StringBuffer(s1);
		String s2 = sb1.toString();
		s1 = new StringBuffer(s1).reverse().toString();
		System.out.println(s1);
	}
}
