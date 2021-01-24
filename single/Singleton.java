package com.xworkz.single;

public class Singleton {
	 private static Singleton singletonInstance = new Singleton();

	    private Singleton() {
	    	
	    }
	    public static Singleton getSingletonInstance() {
	        return singletonInstance;
	    }
	}


