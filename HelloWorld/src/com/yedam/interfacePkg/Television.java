package com.yedam.interfacePkg;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV on");
	}

	@Override
	public void turnOff() {
		System.out.println("TV off");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
