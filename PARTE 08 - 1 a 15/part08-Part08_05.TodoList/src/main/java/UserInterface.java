
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emigm
 */
public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.todolist = list;
    }
    
    public void start(){
        String command;
        String task;
        int index;
        while(true){
            System.out.print("Command:");
            command = this.scanner.next();
            if(command.equals("stop")){
                break;
            }
            switch(command){
                case "add":
                    System.out.print("To add:");
                    this.scanner.nextLine();
                    task = this.scanner.nextLine();
                    this.todolist.add(task);
                    break;
                case "remove":
                    System.out.print("Wich one is removed?");
                    index = this.scanner.nextInt();
                    this.todolist.remove(index);
                    break;
                case "list":
                    this.todolist.print();
                    break;
            }
        }
    }
}
