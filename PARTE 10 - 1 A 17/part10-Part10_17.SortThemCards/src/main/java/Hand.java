
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    private int sumOfValues() {
        int sum = 0;
 
        for (Card card : cards) {
            sum += card.getValue();
        }
 
        return sum;
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        this.cards.forEach(card -> System.out.println(card.toString()));
    }
    
    public void sort(){
         Collections.sort(this.cards);
    }
    
    public void sortBySuit(){
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
   
    @Override
    public int compareTo(Hand h) {
         return this.sumOfValues() - h.sumOfValues();
    }
}
