
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        try{
            Path path = Paths.get("literacy.csv");
            Files.lines(path).map(row -> row.split(","))
            .sorted((part1,part2) -> {
                if(Double.valueOf(part1[5]) - Double.valueOf(part2[5]) < 0.0){
                    return -1;
                } else if(Double.valueOf(part1[5]) - Double.valueOf(part2[5]) == 0.0){
                    return 0;
                }
                return 1;
            }).forEach(line -> {
                String genderLine = line[2].trim();
                String[] gender = genderLine.split(" ");
                System.out.println(
                            line[3] + " (" + line[4] + "), " + gender[0] + ", " + line[5]
                );
            });
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /*
        try{
            Path path = Paths.get(file);
            Files.lines(path).map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book (parts[0], Integer.valueOf(parts[1]),
                            Integer.valueOf(parts[2]), parts[3]))
                    .forEach(book -> lista.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        */
    }
}
