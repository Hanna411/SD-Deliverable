package project;
/**
 * SYST 17796 Project 
 * Go Fish card game
 * Group 2
 * @Author Zhaoxu Han 
 * 2020.03.16
 */
import java.util.ArrayList;
import java.util.Random;

public class GoFish {
static final Random random= new Random();
static private ArrayList<Card> cards;

    static int tableSize() {
        return cards.size();
        }
 //The remove()method to take cards from ArrayList cards.
    static Card take() {
        return cards.remove(random.nextInt(cards.size()));
        }

}
