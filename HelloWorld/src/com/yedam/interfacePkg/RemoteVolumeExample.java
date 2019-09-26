package com.yedam.interfacePkg;

public class RemoteVolumeExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(12);
		System.out.println("------------");
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(12);
		RemoteControl rc1 = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("On");
				
			}		
			@Override
			public void turnOff() {
				System.out.println("off");
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume=volume;
			}
		}
		}
}
}
