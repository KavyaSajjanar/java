package com.xworkz.methods.electronic;

public class Speaker {
	private int batteryBackUpInHours;
	private String companyName="JBL";
	private String color;
	private boolean connected;
	private int maxVolumeLevel=4;
	private int minVolumeLevel=0;
	private int currentVolume=0;
public Speaker(String color,int batteryBackUpInHours) {
	this.color=color;
	this.batteryBackUpInHours=batteryBackUpInHours;
	System.out.println("created speaker");
	System.out.println("arg1:" +color);
	System.out.println("arg2:" +batteryBackUpInHours);
}
public void onOrOff(){
	System.out.println("speaker is:");
if(this.connected==false) {
	this.connected=true;
	System.out.println("speaker is on");
}
else if(this.connected==true) {
	this.connected=false;
	System.out.println("speaker is off");
}
	
	
}
public void increaseVolume(){
	
if(this.connected==true) {	
	if(this.currentVolume<this.maxVolumeLevel) {
		this.currentVolume=this.currentVolume+1;
		System.out.println("current volume is:" +this.currentVolume);
	}else {
		System.out.println("max volume reached");
	}
		
	}
else {
	System.out.println("gube speaker is off");
}
	}
public void decreaseVolume() {
	if(this.connected==true) {
		if(this.currentVolume>this.minVolumeLevel) {
			this.currentVolume=this.currentVolume-1;
			System.out.println("current volume is:" +this.currentVolume);
		}else {
			System.out.println("min volume reached");
		}
			
		}
	else {
		System.out.println("gube speaker is off");
	}
		}
		public int getbatteryBackUpInHours(){
			return batteryBackUpInHours;
		}
		public String color() {
			return color;
		}
		public String getcompanyName() {
			return companyName;
		}
		public boolean isConnected() {
			return connected;
		}
		public int getCurrentVolume() {
			return currentVolume;
			
			
}
}
