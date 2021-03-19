

import java.util.Scanner;
public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts;
        String command;
        int amount;
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.printf("First: " + firstContainer.toString());
            System.out.print(System.lineSeparator());
            System.out.printf("Second: " + secondContainer.toString());
            System.out.print(System.lineSeparator());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                parts = input.split(" ");
                command = parts[0];
                amount = Integer.valueOf(parts[1]);
                if(command.equals("add")){
                    firstContainer.add(amount);
                }
                if(command.equals("move")){
                    if(amount > 0 && firstContainer.contains() != 0){
                        int resta = firstContainer.contains() - amount;
                        if(resta >= 0){
                            secondContainer.add(amount);
                        } else {
                            secondContainer.add(firstContainer.contains());
                        }
                        firstContainer.remove(amount);
                    }
                }
                if(command.equals("remove")){
                    secondContainer.remove(amount);
                }
            }
        }
    }

}
