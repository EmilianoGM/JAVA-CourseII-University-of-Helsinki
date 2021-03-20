
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> inputs = new ArrayList<>();
        while(true){
            String ent = scanner.nextLine();
            if(ent.equals("end")){
                break;
            }
            inputs.add(ent);
            
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ent = scanner.nextLine();
        double average;
        if(ent.equals("n")){
            average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } 
        if(ent.equals("p")){
            average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number >= 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } 
    }
}
