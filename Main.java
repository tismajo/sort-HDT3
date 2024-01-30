/**
 * Nombre del programa: Hoja de Trabajo 3 - Sorts
 * Autores: Leonardo Dufrey Mejía Mejía, Maria José Girón Isidro
 * Fecha de creación:  28de enero de 2024
 * Fecha de última modificación: 30 de enero de 2024
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 * https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
 * https://www.geeksforgeeks.org/radix-sort/?ref=shm
 * https://www.geeksforgeeks.org/insertion-sort/?ref=shm 
 */


public class Main {
    public static void main(String[] args) throws Exception{
        cargarCSV uvg = new cargarCSV();

        uvg.cargaCSV("numbers.csv");   
        
        Bubblesort.ordenar(uvg.lista);
        MergeSort.ordenar(uvg.lista);
        GnomeSort.ordenar(uvg.lista);
        QuickSort.ordenar(uvg.lista);
        RadixSort.ordenar(uvg.lista);
    }
}