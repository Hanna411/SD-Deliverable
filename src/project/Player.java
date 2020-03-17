/**
 * SYST 17796 Project
 * Go Fish card game
 * Group 2
 *
 * @Author Zhaoxu Han 2020.03.16
 */
package project;

import java.util.ArrayList;

/**
 * Player class
 */
public abstract class Player {

    private String playerID; //the unique ID for this player
    //build ArrayList to store cards in hand
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int numCards;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
        for (int i = 0; i <= 7; i++) {
            fish();
        }
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }
    
    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    /**
     * @return the numCards
     */
    public int getNumCards() {
        return numCards;
    }

    /**
     * The method to be instantiated when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

    private void fish() {
        if (GoFish.tableSize() > 0) {
            hand.add(GoFish.take());
        } else {
            System.out.println("no more cards");
        }
    }
    //The contains()method to check whether ArrayList hand has given card.

    public boolean isGiven(Card card) {
        return hand.contains(card);
    }
}

