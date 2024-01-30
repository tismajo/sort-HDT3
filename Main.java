public class Main {
    public static void main(String[] args) throws Exception{
        cargarCSV uvg = new cargarCSV();

        uvg.cargaCSV("numbers.csv");   
        
        Bubblesort.ordenar(uvg.lista);
    }
}