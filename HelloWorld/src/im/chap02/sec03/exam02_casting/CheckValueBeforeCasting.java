package im.chap02.sec03.exam02_casting;
public class CheckValueBeforeCasting {
  public static void main(String[] args) {
	  int i = 128;
	  
	  if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {
		  System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
		  System.out.println("���� �ٽ� Ȯ���� �ּ���");
	  } else {
		  byte b = (byte) i;
		  System.out.println(b);
	  }
  }
}

