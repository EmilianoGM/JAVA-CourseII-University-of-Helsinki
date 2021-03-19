
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
public class Abbreviations {
    private HashMap<String, String> hashmap;
    public Abbreviations(){
        this.hashmap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.hashmap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.hashmap.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        if(!this.hasAbbreviation(abbreviation)){
            return null;
        }
        return this.hashmap.get(abbreviation);
    }
}
