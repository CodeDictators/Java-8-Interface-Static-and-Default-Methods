package com.blz.interfacedemo.service;

public interface JIO {
	public abstract void makeCall(String provider);

	public static void makeVideoCall() {
		System.out.println("Calling from Static: JIO");
	}

	default void sendMsg() {
		System.out.println("Calling from Default: JIO");
	}
}
