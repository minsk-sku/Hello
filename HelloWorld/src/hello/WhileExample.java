package hello;

public class WhileExample {
	public static void main(String[] args) {
		// 4단 출력
		int  i = 1;
		while (true) {
			if (++i<5)
				continue;
			System.out.println(4 + " * " +i+ " = " + (4*i));
			if (i==100)
				break;
//			i++;
		}
	}
}
