package im.chap19.sec03.exam03_buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {
	public static void main(String[] args) {
		System.out.println("[7����Ʈ ũ��� ���� ����]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		printState(buffer);
		
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("[2����Ʈ ������]");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3����Ʈ ������]");
		printState(buffer);
		
		buffer.flip();
		System.out.println("[flip() ������]");
		printState(buffer);
		
		buffer.get(new byte[3]);
		System.out.println("[3����Ʈ ������]");
		printState(buffer);
		
		buffer.mark();
		System.out.println("--------[���� ��ġ�� ��ũ �س���]");
		
		buffer.get(new byte[2]);
		System.out.println("[2����Ʈ ������]");
		printState(buffer);
		
		buffer.reset();
		System.out.println("--------[position�� ��ũ ��ġ�� �ű�]");
		printState(buffer);
		
		buffer.rewind();
		System.out.println("[rewind() ������]");
		printState(buffer);
		
		buffer.clear();
		System.out.println("[clear() ������]");
		printState(buffer);
	}
	
	public static void printState(Buffer buffer) {
		System.out.print("\tposition:" + buffer.position() + ", ");
		System.out.print("\tlimit:" + buffer.limit() + ", ");
		System.out.println("\tcapacity:" + buffer.capacity());
	}
}
