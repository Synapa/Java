package com.project.blackjack;

import java.util.ArrayList;

public class Player {

	private Hand playerHand;
	private int playerStake =0;
	private double playerBalance = 0;
	

	public Player() {		
	}
	
	
	public int getPlayerStake() {
		return playerStake;
	}

	public void setPlayerStake(int playerStake) {
		this.playerStake = playerStake;
	}


	public Hand getPlayerHand() {
		return playerHand;
	}

	public double getPlayerBalance() {
		return playerBalance;
	}

	public void setPlayerBalance(double playerBalance) {
		this.playerBalance = playerBalance;
	}
	public void setPlayersHand(Hand playersHand) {
		this.playerHand = playersHand;
	}

	
	public String handToString() {
		String currentHand ="";
			for(int i=0; i<this.playerHand.getHand().size(); i++) {
				currentHand+=this.playerHand.getHand().get(i).cardToString();
				if(!(i==this.playerHand.getHand().size()-1)) {
					currentHand+= ", ";
				}
				
			}
		return currentHand;

	}
	
}
