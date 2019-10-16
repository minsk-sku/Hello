package im.chap06.verify.exam18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
		}
	}
}
