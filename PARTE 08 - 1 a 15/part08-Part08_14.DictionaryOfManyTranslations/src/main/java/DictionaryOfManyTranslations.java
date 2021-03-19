
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashMap;

    public DictionaryOfManyTranslations() {
        this.hashMap = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if(this.hashMap.containsKey(word)){
            this.hashMap.get(word).add(translation);
        } else {
            ArrayList<String> newList = new ArrayList<String>();
            newList.add(translation);
            this.hashMap.put(word, newList);
        }
    }
    
    public ArrayList<String> translate(String word){
        if(this.hashMap.containsKey(word)){
            return this.hashMap.get(word);
        }
        ArrayList<String> newList = new ArrayList<String>();
        return newList; 
    }
    
    public void remove(String word){
        this.hashMap.remove(word);
    }
}
