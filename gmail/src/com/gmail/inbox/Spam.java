package com.gmail.inbox;

public class Spam {
	public void read() {
		System.out.println("read msg");
	}

	public void delete() {
		System.out.println("delete spam ");
	}

	public static void main(String[] args) {
		Spam s1 = new Spam();
		s1.read();
		s1.delete();
		// access inbox class properts
		Inbox i1 = new Inbox();
		i1.compose();
		i1.delete();
	}
}
