
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> itemsList;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.capacity - item.getWeight() >= 0){
            this.capacity = this.capacity - item.getWeight();
            this.itemsList.add(item);
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemsList.contains(item);
    }
    
}
