
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashMap; 
    public VehicleRegistry() {
        this.hashMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.hashMap.containsKey(licensePlate)){
            return false;
        }
        this.hashMap.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.hashMap.getOrDefault(licensePlate, null);
    }


    public boolean remove(LicensePlate licensePlate){
        if(!this.hashMap.containsKey(licensePlate)){
            return false;
        }
        this.hashMap.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate l: this.hashMap.keySet()){
            System.out.println(l.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> printedOwners = new ArrayList();
        for(LicensePlate l: this.hashMap.keySet()){
            String newOwner = this.hashMap.get(l);
            if(printedOwners.isEmpty() || !printedOwners.contains(newOwner)){
                System.out.println(newOwner);
                printedOwners.add(newOwner);
            }
        }
    }
}
