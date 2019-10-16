package im.chap11.verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		//���1(splict() �޼ҵ� �̿�)
		String[] tokens = str.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		
		//���2(StringTokenizer �̿�)
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
