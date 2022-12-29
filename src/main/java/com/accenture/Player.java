package com.accenture;

import java.util.Scanner;

public class Player {
	int pnum;
	String name;
	
	public String inputName() {
		System.out.println("Player , kindly enter your name");
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		return name;
	}
	public int inputNum() {
		inputName();
		Scanner scan = new Scanner(System.in);
		System.out.println(name+", kindly guess a number between 1-10");
		pnum = scan.nextInt();
		return pnum;
	}
}
