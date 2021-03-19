
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        float count = 0;
        float sum = 0;
        while(number != 0){
            if(number > 0){
                count++;
                sum = sum + number;
            }
            number = scanner.nextInt();
        }
        if(count == 0 || sum <= 0){
            System.out.println("Cannot calculate the average");
        } else {
            float resultado = sum / count;
            System.out.println(resultado);
        }
    }
}
