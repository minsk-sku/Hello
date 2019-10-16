package im.chap11.sec15.exam01_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println( sdf.format(now) );		
	}
}
