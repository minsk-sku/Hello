package im.chap10.sec05_try_with_resources;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
