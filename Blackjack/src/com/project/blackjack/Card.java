package com.project.blackjack;

public class Card {

	private Suit suit;
	private Value value;
	
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public Value getValue() {
		return value;
	}
	public String cardToString() {
		if(value.equals(Value.ACE) || value.equals(Value.KING) ||value.equals(Value.QUEEN) ||value.equals(Value.JACK)){
			return (value.toString().substring(0, 1) + suit.toString().charAt(0));
		}
		else {
			return (value.getMask() + suit.toString().substring(0,1));
		}
		
	}
}
