
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        while(!"end".equals(line)){
            int number = Integer.parseInt(line);
            int cube = number * number * number;
            System.out.println(cube);
            line = scanner.next();
        }
    }
}
