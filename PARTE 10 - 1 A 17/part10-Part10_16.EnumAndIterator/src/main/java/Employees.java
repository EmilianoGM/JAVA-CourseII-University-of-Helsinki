
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class Employees {
    ArrayList<Person> persons;

    public Employees() {
        this.persons  = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        this.persons.addAll(peopleToAdd);
    }
    
    public void print() {
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education){
                 System.out.println(nextPerson.toString());
            }
        }
    }
    
    public void fire(Education education){
        this.persons.removeIf(person -> person.getEducation() == education);
    }
}
