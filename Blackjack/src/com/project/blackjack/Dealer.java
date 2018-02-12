package com.project.blackjack;

public class Dealer {
	
	private Hand dealersHand;

	public Dealer() {

	}
	
	public void setDealersHand(Hand dealersHand) {
		this.dealersHand = dealersHand;
	}

	public Hand getDealersHand() {
		return dealersHand;
	}
	public String handToString() {
		String output ="";
		for(Card card : this.dealersHand.getHand()) {
			output+=card.cardToString();
			if(card.equals(this.dealersHand.getHand().get(this.dealersHand.getHand().size()-1))) {
				
			}else {
				output+=", ";
			}
			
		}
		return output;
	}
}
