
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList();
        while(true){
            int input = scanner.nextInt();
            if(input < 0){  
                inputs.stream().filter(value -> value > 0 && value < 6)
                .forEach(i ->  System.out.println(i));
                break;
            }
            inputs.add(input);
        }
    }
}
