package simple;

public class QCountTheWords {
	public static void main(String[] args) {
		String s = "Java is java again java again";
		char c = 'a';
		int count = s.length() - s.replace("a", "").length();
		System.out.println("Number of occurrences of 'a' in " + s + " = " + count);
	}
}
