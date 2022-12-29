package com.accenture;

import java.util.Random;

public class Guesser {
	int gnum;
	public int guessNum() {
		
	    Random rand = new Random(); //instance of random class
		gnum = rand.nextInt(1,11); 
		return gnum;

	}

}
