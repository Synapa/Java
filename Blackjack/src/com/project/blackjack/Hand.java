package com.project.blackjack;

import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> hand;

	public Hand(Card c1) {
		this.hand = new ArrayList<Card>();
		this.hand.add(c1);

	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void addCardToHand(Card card) {
		this.hand.add(card);
	}

	public void removeCardFromHand(Card cardToRemove) {
		int index = 0;
		boolean foundCard = false;
		while (!foundCard) {
			Card card = this.hand.get(index);
			if (card.equals(cardToRemove)) {
				this.hand.remove(index);
				foundCard = true;
			}
			index++;
		}
	}

	public int getHandValue() {
		int handValue = 0;
		int aceCount = 0;
		for (Card card : this.hand) {
			handValue += card.getValue().getMask();
			if (card.getValue().equals(Value.ACE)) {
				aceCount += 1;
			}
		}
		if (aceCount >= 1 && handValue < 12) {
			handValue += 10;
		}
		return handValue;
	}

	public int getFirstCardValue() {
		int handValue = 0;
		int aceCount = 0;
		Card card = this.hand.get(0);
		handValue += card.getValue().getMask();
		if (card.getValue().equals(Value.ACE)) {
			aceCount += 1;
		}

		if (aceCount >= 1 && handValue < 12) {
			handValue += 10;
		}
		return handValue;
	}
}
