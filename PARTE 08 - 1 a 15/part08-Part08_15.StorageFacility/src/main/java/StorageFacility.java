
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> hashMap;

    public StorageFacility() {
        this.hashMap = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if(this.hashMap.containsKey(unit)){
            this.hashMap.get(unit).add(item);
        } else {
            ArrayList<String> newList = new ArrayList<String>();
            newList.add(item);
            this.hashMap.put(unit, newList);
        }
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.hashMap.containsKey(storageUnit)){
            return this.hashMap.get(storageUnit);
        }
        ArrayList<String> newList = new ArrayList<String>();
        return newList; 
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> list = this.hashMap.get(storageUnit);
        list.remove(item);
        if(list.isEmpty()){
            this.hashMap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> newList = new ArrayList<String>();
        for(String k:  this.hashMap.keySet()){
            newList.add(k);
        }
        return newList;
    }
}
