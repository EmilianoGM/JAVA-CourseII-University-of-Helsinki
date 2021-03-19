
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
public class Herd implements Movable{
    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable m: this.list){
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        for(Movable m: this.list){
            retorno = retorno + m.toString() + "\n";
        }
        return retorno;
    }
    
    
}
