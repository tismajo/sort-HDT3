public class Main {
    public static void main(String[] args) throws Exception{
        cargarCSV uvg = new cargarCSV();
        
        //Se crea el archivo CSV y se le agregan los datos
        
        uvg.cargaCSV("numbers.csv");    
    }
}