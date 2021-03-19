
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class ShoppingCart {
    private  Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<String, Item>();
    }
    
    public void add(String product, int price){
        if(this.items.containsKey(product)){
            Item item = this.items.get(product);
            item.increaseQuantity();
        } else {
            Item newItem = new Item(product, 1, price);
            items.put(product, newItem); 
        }

    }
    
    public int price(){
        int totalPrice = 0;
        if(this.items.size() > 0){
            for(Item i: this.items.values()){
                totalPrice += i.price();
            }
        }
        return totalPrice;
    }
    
    public void print() {
        for(Item i: this.items.values()){
            System.out.println(i.toString());
        }
    }
}
