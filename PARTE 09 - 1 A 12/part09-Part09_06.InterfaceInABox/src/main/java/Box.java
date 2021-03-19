
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
public class Box implements Packable {
    private ArrayList<Packable> packsList;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.packsList = new ArrayList<>();
    }
    
    public void add(Packable packable){
        if(this.weight() + packable.weight() <= this.maxCapacity){
            this.packsList.add(packable);
        }
    }
    
    public double weight() {
        double weight = 0;
        for(Packable pack: this.packsList){
            weight += pack.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.packsList.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
}
