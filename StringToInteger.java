public class StringToInteger {
	static int toInteger(final String str) {
		int num = 0, factor = 1;
		for(int i=str.length()-1; i>=0; --i) {
			num += (str.charAt(i) - '0') * factor;
			factor *=10;
		}
		System.out.println(num);
		return num;
	}
}
