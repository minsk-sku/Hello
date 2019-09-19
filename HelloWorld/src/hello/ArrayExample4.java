package hello;

public class ArrayExample4 {
	public static void main(String[] args) {
		String[] strary = { "hello", "world", "Good", "Morning" };
		String[] copyary = new String[strary.length];
		for (int i = 0; i < strary.length; i++) {
			copyary[i] = strary[i];

		}
		for (String str : copyary) {
			System.out.println(str);
		}
		System.arraycopy(strary, 0, copyary, 0, 1);
		for (String str : copyary) {
			System.out.println(str);
		}
	}

}