package im.chap03.sec04.exam01_arithmetic;
public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));	
		
		//�߸��� �ڵ�
		System.out.println(z + 2);	
		
		//�˸��� �ڵ�
		if(Double.isInfinite(z) || Double.isNaN(z)) { 
			System.out.println("�� ���� �Ұ�"); 
		} else { 
			System.out.println(z + 2); 
		}
		
		//---------------------------------------------------
		
		/*int x = 5;
		int y = 0;
		
		try {
			//int z = x / y;
			int z = x % y;
			System.out.println("z: " + z);
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}*/
	}
}

