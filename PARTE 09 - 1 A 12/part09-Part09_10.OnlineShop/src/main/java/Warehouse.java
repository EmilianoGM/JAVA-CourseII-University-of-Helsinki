
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class Warehouse {
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }
    
    public int price(String product){
        if(!this.productsPrice.containsKey(product)){
            return -99;
        }
        return this.productsPrice.get(product);
    }
    
    public int stock(String product){
        if(!this.productsPrice.containsKey(product)){
            return 0;
        }
        return this.productsStock.get(product);
    }
    
    public boolean take(String product){
        if(!this.productsStock.containsKey(product) || this.productsStock.get(product) == 0){
            return false;
        }
        int stock = this.productsStock.get(product);
        this.productsStock.replace(product, stock - 1);
        return true;
    }
    
    public Set<String> products(){
        return this.productsPrice.keySet();
    }
    
}
