package hello;

public class MethodExample1 {
	public static void main(String[] args) {
		int[] intAry = {2, 3, 4, 5, 6};
		int sum = 0;
		sum = sum2(intAry);
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		System.out.println(sum);
		}
	}
	
	public static int sum2(int[] ary) {
		
		int sum = 0;
	for (int i = 0; i < ary.length; i++) {
		sum += ary[i];
		}
	return sum;
	}
}