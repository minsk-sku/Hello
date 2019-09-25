package com.yedam;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone("S10", "white", 10);
		System.out.println("model" + dmbCell.model);
		System.out.println("color" + dmbCell.color);
		System.out.println("channel" + dmbCell.channel);

		dmbCell.powerOn();
		dmbCell.powerOff();
		dmbCell.bell();
		dmbCell.hangup();
	}

}
