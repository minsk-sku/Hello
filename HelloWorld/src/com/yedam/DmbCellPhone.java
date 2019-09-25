package com.yedam;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(int channel) {
		super();
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
		// TODO Auto-generated constructor stub
	}

	void turnOnDmb() {
		System.out.println("채널" + channel + "번으로 DMB 수신 시작");
	}
	
	void changeChannelDmb() {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("종료");
	}
}
