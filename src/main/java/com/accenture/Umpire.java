package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Umpire {
	
	private Player player1;
	private Player player2;
	private Player player3;
	private Guesser guesser;
	
	private int p1Input;
	private int p2Input;
	private int p3Input;
	private int gInput;
	
	
	public Umpire(Player player1, Player player2,Player player3, Guesser guesser) {
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.guesser = guesser;
	}
	
	
	
	public void guesserNum() {
		gInput=guesser.guessNum();
	}
	
	public void playersNum() {
		p1Input=player1.inputNum();
		p2Input=player2.inputNum();
		p3Input=player3.inputNum();
	}
	
	public void compareNum () {
		System.out.println("Number guessed by guesser: "+gInput);
		if(gInput==p1Input && gInput==p2Input 
				&& gInput==p3Input) {
			System.out.println(player1.name+","+player2.name+" and "+player3.name+" has won the game");
		}
		
		else if(gInput==p1Input && gInput==p2Input) {
			System.out.println(player1.name+" and "+player2.name+" has won the game");
		}
		
		else if(gInput==p1Input && gInput==p3Input) {
			System.out.println(player1.name+" and "+player3.name+" has won the game");
		}
		else if(gInput==p2Input && gInput==p3Input) {
			System.out.println(player2.name+" and "+player3.name+" has won the game");
		}
		else if(gInput==p1Input) {
			System.out.println(player1.name+" has won the game");
		}
		else if(gInput==p2Input) {
			System.out.println(player2.name+" has won the game");
		}
		else if(gInput==p3Input) {
			System.out.println(player3.name+" has won the game");
		}
		else {
			System.out.println("Game lost, try again");
		}
	}
	

}
