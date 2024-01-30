import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class cargarCSV {
    ArrayList<datos> lista;

    
    public cargarCSV() {
        lista = new ArrayList<>();
    }

    public void cargaCSV(String archivoCSV) {
        try {
            Scanner scanner = new Scanner(new File(archivoCSV));

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                if (datos.length >= 1) {
                    int numero = Integer.parseInt(datos[0]);
                    datos datos1 = new datos(numero);
                    lista.add(datos1);
                } else {
                    System.out.println("Error al leer la línea del archivo CSV: " + linea);
                }
            }

            System.out.println("Datos cargados correctamente desde el archivo CSV.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo CSV no encontrado.");
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el tipo de usuario a entero.");
            e.printStackTrace();
        }
    }
}
