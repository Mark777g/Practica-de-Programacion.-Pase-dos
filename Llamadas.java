package Practica.Ejercicios;
import java.util.Scanner;
import Procesos.Numeracion;

public class Llamadas { // Clase Llamadas

    public static void zonaDos() {   // Datos de las zonas
        System.out.println("Ingrese el valor de la zona:");
        System.out.println("12. America del norte");
        System.out.println("15. America central");
        System.out.println("18. America del sur");
        System.out.println("19. Europa");
        System.out.println("23. Asia");
        System.out.println("25. Africa");
        System.out.println("29. Oceania");
        System.out.println("31. Resto del mundo");
    }

     // Funcion y pregunta de la zona
    public static int zonaPosible(Scanner scanner) {
        System.out.println("Seleccione una zona:");
        return scanner.nextInt();
    }

    public static float minutosDos(Scanner scanner) {
        System.out.println("Ingrese la cantidad de minutos que utilizó:");
        return scanner.nextFloat();
    }

    public static float precioPosible(int zona, float minutos) {
        float precio = 0;
        switch (zona) {
            case 12:
                precio = minutos * Numeracion.AMERICA_DEL_NORTE.getPrecio_llamadas();
                break;
            case 15:
                precio = minutos * Numeracion.AMERICA_CENTRAL.getPrecio_llamadas();
                break;
            case 18:
                precio = minutos * Numeracion.AMERICA_DEL_SUR.getPrecio_llamadas();
                break;
            case 19:
                precio = minutos * Numeracion.EUROPA.getPrecio_llamadas();
                break;
            case 23:
                precio = minutos * Numeracion.ASIA.getPrecio_llamadas();
                break;
            case 25:
                precio = minutos * Numeracion.AFRICA.getPrecio_llamadas();
                break;
            case 29:
                precio = minutos * Numeracion.OCEANIA.getPrecio_llamadas();
                break;
            case 31:
                precio = minutos * Numeracion.RESTO_DEL_MUNDO.getPrecio_llamadas();
                break;
        }
        return precio;
    }

    // Método principal para realizar todo el proceso
    public static void llamadas() {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar las zonas
        zonaDos();
        
        // Leer la zona seleccionada
        int zona = zonaPosible(scanner);
        
        // Leer los minutos utilizados
        float minutos = minutosDos(scanner);

        // Calcular el precio
        float precio = precioPosible(zona, minutos);

        // Mostrar el resultado
        posibleFinal(precio);
        
    }

    public static void posibleFinal(float precio) {
        System.out.println("La cantidad a pagar es: " + precio);
    }
}


