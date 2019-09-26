package com.yedam.interfacePkg;

public interface RemoteControl {
	public static final int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	

}
