
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
public class OneItemBox extends Box {
    private ArrayList<Item> itemsList;

    public OneItemBox() {
        this.itemsList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.itemsList.isEmpty()){
            this.itemsList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
         return this.itemsList.contains(item);
    }
    
}
