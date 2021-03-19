/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class Container {
    int liquid;
    public Container(){
        this.liquid = 0;
    }
    
    public int contains(){
        return this.liquid;
    }
    
    public void add(int amount){
        int suma = this.liquid + amount;
        if(amount > 0){
            if(suma < 100){
                this.liquid  = suma;
            } else {
                this.liquid  = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if(amount > 0 && this.liquid > 0){
            int restaDos = this.liquid - amount;
            if(restaDos >= 0){
                this.liquid -= amount;
            } else {
                this.liquid = 0;
            }
        }
    }
    
    public String toString(){
        return String.valueOf(this.liquid) + "/100";
    }
}
