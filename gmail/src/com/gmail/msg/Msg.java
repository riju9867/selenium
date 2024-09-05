package com.gmail.msg;

import com.gmail.inbox.Spam;
//import com.gmail.inbox.inbox;



public class Msg {
	public void textmsg() {
		System.out.println("type your msg");
	}

	public void voicemsg() {
		System.out.println("record your msg");
	}

	public static void main(String[] args) {
		// access msg class properties
		Msg m1 = new Msg();
		m1.textmsg();
		m1.voicemsg();
		// access inbox class properties of pkg(using full qualified class name)
		com.gmail.inbox.Inbox i1 = new com.gmail.inbox.Inbox();
		i1.compose();
		i1.delete();
		// access spam class properties of diff pkg(by using import)
		Spam s1 = new Spam();
		s1.read();
		s1.delete();
	}

}
