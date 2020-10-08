package com.blz.interfacedemo.service.provider;

import com.blz.interfacedemo.service.Idea;
import com.blz.interfacedemo.service.JIO;

public class Calling extends ClassA implements Idea, JIO {

	@Override
	public void makeCall(String provider) {
		System.out.println("Calling.... from: " + provider);
		Calling myVideoCall = new Calling();
		myVideoCall.makeVideoCall();
		myVideoCall.sendMsg();

	}

	public void makeVideoCall() {
		Idea.makeVideoCall();
		JIO.makeVideoCall();
	}

	@Override
	public void sendMsg() {
		JIO.super.sendMsg();
	}

}
