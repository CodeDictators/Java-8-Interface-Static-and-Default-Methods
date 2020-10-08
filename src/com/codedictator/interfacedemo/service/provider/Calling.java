package com.codedictator.interfacedemo.service.provider;

import com.codedictator.interfacedemo.service.Idea;
import com.codedictator.interfacedemo.service.JIO;

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
