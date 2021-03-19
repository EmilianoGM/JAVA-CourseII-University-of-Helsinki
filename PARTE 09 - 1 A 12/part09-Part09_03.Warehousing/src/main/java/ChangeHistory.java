
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
public class ChangeHistory {
    private ArrayList<Double> changeList;

    public ChangeHistory() {
        this.changeList = new ArrayList<Double>();
    }
    
    public void add(double status){
        this.changeList.add(status);
    }
    
    public void clear(){
        this.changeList.clear();
    }

    @Override
    public String toString() {
        return this.changeList.toString();
    }
    
    public double maxValue(){
        if(this.changeList.isEmpty()){
            return 0.0;
        }
        double value = 0.0;
        for(Double d : this.changeList){
            if(d > value){
                value = d;
            }
        }
        return value;
    }
    
    public double minValue() {
        if(this.changeList.isEmpty()){
            return 0.0;
        }
        double value = this.changeList.get(0);
        for(Double d : this.changeList){
            if(d < value){
                value = d;
            }
        }
        return value;
    }
    
    public double average() {
        if(this.changeList.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        double count = this.changeList.size();
        for(Double d : this.changeList){
            sum += d;
        }
        return sum / count;
    }
}
