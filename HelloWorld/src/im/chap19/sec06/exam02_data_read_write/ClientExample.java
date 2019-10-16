package im.chap19.sec06.exam02_data_read_write;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class ClientExample {
	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println( "[���� ��û]");
			socketChannel.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[���� ����]");
			
			ByteBuffer byteBuffer = null;
			Charset charset = Charset.forName("UTF-8");
			
			byteBuffer = charset.encode("Hello Server");
			socketChannel.write(byteBuffer);
			System.out.println( "[������ ������ ����]");
			
			byteBuffer = ByteBuffer.allocate(100);
			int byteCount = socketChannel.read(byteBuffer);
			byteBuffer.flip();
			String message = charset.decode(byteBuffer).toString();
			System.out.println("[������ �ޱ� ����]: " + message);
		} catch(Exception e) {}
		
		if(socketChannel.isOpen()) {
			try {
				socketChannel.close();
			} catch (IOException e1) {}
		}	
	}
}