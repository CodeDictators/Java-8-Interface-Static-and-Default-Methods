package com.blz.interfacedemo.runner;

import com.blz.interfacedemo.service.Idea;
import com.blz.interfacedemo.service.JIO;
import com.blz.interfacedemo.service.provider.Calling;

public class Communication {
	public static final void main(String[] args) {
		System.out.println("I want to make a call");

		Idea IdeaCall = new Calling();
		IdeaCall.makeCall("Idea");

		JIO jioCall = new Calling();
		jioCall.makeCall("JIO");
	}
}
