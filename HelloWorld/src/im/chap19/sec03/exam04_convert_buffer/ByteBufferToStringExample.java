package im.chap19.sec03.exam04_convert_buffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteBufferToStringExample {
	public static void main(String[] args) {
		Charset charset = Charset.forName("UTF-8");
		
		//���ڿ� -> ���ڵ� -> ByteBuffer
		String data = "�ȳ��ϼ���";
		ByteBuffer byteBuffer = charset.encode(data);
		
		//ByteBuffer -> ���ڵ� -> CharBuffer -> ���ڿ�
		data = charset.decode(byteBuffer).toString();
		System.out.println("���ڿ� ����: " + data);
	}
}
