package com.blz.interfacedemo.service;

public interface Idea {
	public void makeCall(String provider);

	public static void makeVideoCall() {
		System.out.println("Calling from Static: Idea");
	}

	default void sendMsg() {
		System.out.println("Calling from Default: Idea");
	}
}
