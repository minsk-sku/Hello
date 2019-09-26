package com.yedam.interfacePkg;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio on");
	}

	@Override
	public void turnOff() {
		System.out.println("Audiooff");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
