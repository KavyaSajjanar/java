package com.xworkz.methods;

import com.xworkz.methods.electronic.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		Speaker speaker=new Speaker("Red",6);
		System.out.println(speaker.getcompanyName());
		System.out.println(speaker.isConnected());
		speaker.increaseVolume();
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
	}

}
