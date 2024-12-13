package Main;
import java.util.Scanner;
import Practica.Ejercicios.Autos;
import Practica.Ejercicios.Llamadas;
import Practica.Ejercicios.Serie;
import Practica.Ejercicios.Agua;;

public class Main { // Clase Main
    public static void main(String[] args) {

        // Datos de los ejercicios realizados
        System.out.println("Datos de inicio de ejercicios de la practica:");
        System.out.println("1. Ejercicio sobre la empresa de autos");
        System.out.println("2. Ejercicio sobre el costo de llamadas telefonicas internacionales");
        System.out.println("3. Ejercicio sobre la empresa Municipal de agua");
        System.out.println("4. Ejercicio sobre series de numeros");

        // Llamar al scanner
        Scanner scanner = new Scanner(System.in);
        int opcion; // Declarar la variable
        opcion = scanner.nextInt();

        switch (opcion) { // Switch de los ejercicios
            case 1:

                System.out.println(" Negocio de autos usados");
                Autos.autos(); // Caso para llamar al ejercicico de Autos
                break;
            case 2:
                System.out.println("Servicio o analisis de cobro de llamadas internacionales");
                Llamadas.llamadas(); // Caso para llamar al ejercicio de Llamadas
                break;
            case 3:
            System.out.println(" Servicio o analisis de cobro de la empresa municipal de agua potable de Loja");
                Agua.agua(); // Caso para llamar al ejercicio de Agua
                break;
            case 4:
                System.out.println("Generador y resultado de numeros de serie");
                Serie.serie(); // Caso para llamar al ejercicio de Serie
                break;
        
            default:
                break;
        }

    scanner.close();

    // Cerrar el scanner

    }
}