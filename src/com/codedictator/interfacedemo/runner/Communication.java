package com.codedictator.interfacedemo.runner;

import com.codedictator.interfacedemo.service.Idea;
import com.codedictator.interfacedemo.service.JIO;
import com.codedictator.interfacedemo.service.provider.Calling;

public class Communication {
	public static final void main(String[] args) {
		System.out.println("I want to make a call");

		Idea IdeaCall = new Calling();
		IdeaCall.makeCall("Idea");

		JIO jioCall = new Calling();
		jioCall.makeCall("JIO");
	}
}
