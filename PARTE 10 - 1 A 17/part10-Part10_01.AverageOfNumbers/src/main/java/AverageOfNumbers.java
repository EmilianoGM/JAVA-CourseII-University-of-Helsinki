
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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
        double average = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();
        System.out.println("average of the numbers: " + average);
        // Write your program here

    }
}
