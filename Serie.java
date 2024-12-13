package Practica.Ejercicios;
import java.util.Scanner;
import Procesos.Serie_dos;

public class Serie { // Clase de Serie
    public static void serie() {

        Scanner scanner = new Scanner(System.in); // Abrir scanner
        
        System.out.println("Ingrese el valor numerico que desea calcular:"); // Pedir el valor numerico
        int valor_numerico = scanner.nextInt(); // Declarar variable del valor numerico

        double Final = Serie_dos.procedimiento(valor_numerico); // Declarar variable valor final

        System.out.println("El resultado de la secuenia es:"+Final); // Presentar el valor de la secuencia

        scanner.close();

        //Cerrar scanner
    }
}
