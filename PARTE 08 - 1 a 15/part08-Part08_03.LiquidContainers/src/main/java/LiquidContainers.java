
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts;
        String command;
        int amount;
        int firstContainer = 0;
        int secondContainer = 0;
        
        while (true) {
            System.out.printf("First: %d/100", firstContainer);
            System.out.print(System.lineSeparator());
            System.out.printf("Second: %d/100", secondContainer);
            System.out.print(System.lineSeparator());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                parts = input.split(" ");
                command = parts[0];
                amount = Integer.valueOf(parts[1]);
                if(command.equals("add")){
                    int suma = firstContainer + amount;
                    if(amount > 0){
                        if(suma < 100){
                            firstContainer = suma;
                        } else {
                            firstContainer = 100;
                        }
                    }
                }
                if(command.equals("move")){
                    if(amount > 0 && firstContainer != 0){
                        int resta = firstContainer - amount;
                        if(resta >= 0){
                            firstContainer -= amount;
                            if(secondContainer + amount > 100){
                                secondContainer = 100;
                            } else {
                                secondContainer += amount;
                            }
                        } else {
                            if(secondContainer + firstContainer > 100){
                                secondContainer = 100;
                            } else {
                                secondContainer += firstContainer;
                            }
                            firstContainer = 0;
                        }
                    }
                }
                if(command.equals("remove")){
                    if(amount > 0 && secondContainer > 0){
                        int restaDos = secondContainer - amount;
                        if(restaDos >= 0){
                            secondContainer -= amount;
                        } else {
                            secondContainer = 0;
                        }
                    }
                }
            }
        }
    }

}
