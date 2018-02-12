package com.project.blackjack.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.project.blackjack.Deck;

public class DeckTests {
	Deck testDeck = new Deck(1);
	Deck testDeck2 = new Deck(5);
    @Test
    public void createDeck() {

    	//check deck is 52 cards after creation
        assertEquals(52, testDeck.getCards().size());
      //check deck is 52*5 (260) cards after creation
        assertEquals(260, testDeck2.getCards().size());
        
    }
    @Test
    public void shuffleDeck() {
        //check deck is 52 cards after being shuffled
        testDeck.shuffle();
        assertEquals(52, testDeck.getCards().size());
      
        
    }
    @Test
    public void drawFromDeck() {
        //check deck is correct number of cards after random number of cards been been drawn
        Random rand = new Random();
        int  i = rand.nextInt((testDeck.getCards().size()-1 -0) + 1) + 0;
        for(int j=0; j<i; j++) {
        	testDeck.draw();
        }
        assertEquals((52-i), testDeck.getCards().size());
        
    }

}
