package Practica.Ejercicios;
import java.util.Scanner;
import Procesos.Serie_dos;

public class Serie { // Clase de Serie
    public static void serie() {

        Scanner scanner = new Scanner(System.in); // Abrir scanner
        
        System.out.println("Ingrese el valor numerico que desea calcular:"); // Pedir el valor numerico
        int valor_numerico = scanner.nextInt(); 

        double resultadoFinal = Serie_dos.serieDos(valor_numerico); // Declarar variable valor final

        System.out.println("El resultado de la secuencia es: " + resultadoFinal); // Presentar el valor de la secuencia

        scanner.close(); // Cerrar scanner
    }
}
