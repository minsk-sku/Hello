package hello;

public class MathExample {
	
public static void main(String[] args) {
	int a = 75;
    a = (int) (Math.random()*100);
    a = a / 10;
	switch(a) {
	case 9: 
		System.out.println(a + "A등급"); break;
	case 8:
		System.out.println(a + "B등급"); break; 
	case 7:
		System.out.println(a + "C등급"); break;
	case 6: 
		System.out.println(a + "D등급"); break;
	default:
		System.out.println(a + "F등급"); break;
		}
	
//System.out.println(math.random());
//if (a>=90) {
//		System.out.println("A");
//	}else if (a>=80) {
//	System.out.println("B");
//	}else if (a>=70) {
//	System.out.println("C");
//	}else if (a>=60) {
//			System.out.println("D");
//	}else {
//	System.out.println("F");
// }
	}

private static int random() {
	// TODO Auto-generated method stub
	return 0;
}
}
