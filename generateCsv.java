import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class generateCsv {
    public void creacionCSV() {
        String csvFile = "numbers.csv";
        try {
            FileWriter writer = new FileWriter(csvFile);
            Random random = new Random();
            for (int i = 0; i < 3000; i++) {
                int randomNumber = random.nextInt(1000); 
                writer.append(String.valueOf(randomNumber));
                writer.append("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("Archivo CSV creado exitosamente!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
