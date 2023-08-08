package telran.string;

public class StringAppl {

	public static void main(String[] args) {
		String str = "Hello";
		char[] chars = { ' ', 'w', 'o', 'r', 'l', 'd' };
		String str1 = new String(chars);
		System.out.println(str);
		System.out.println(str1);
		str = str + str1;
		System.out.println(str);
		System.out.println(str.length()); // skolko simvolov v stroke

		char c = str.charAt(2); // l

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		String str2 = " WORLD";
		System.out.println(str1.equalsIgnoreCase(str2));

		int index = str.indexOf('l');
		System.out.println(index);
		index = str.lastIndexOf('l');
		System.out.println(index);
	}

}
