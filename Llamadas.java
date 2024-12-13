package Practica.Ejercicios;
import java.util.Scanner;
import Procesos.Numeracion;

public class Llamadas { // Clase Llamadas
    public static void llamadas() {
        
        // Datos para saber las zonas a la cual realizaste la llamada
        System.out.println("Ingrese el valor de la zona:");
        System.out.println("12. America del norte");
        System.out.println("15. America central");
        System.out.println("18. America del sur");
        System.out.println("19. Europa");
        System.out.println("23. Asia");
        System.out.println("25. Africa");
        System.out.println("29 Oceania");
        System.out.println("31 Resto del mundo");

        Scanner scanner = new Scanner(System.in); // Abrir scanner
        int numero; // Variable para el switch
        numero = scanner.nextInt();
        float precio = 0; // Variable del precio
        
        //  Estructura del switch y las acciones para determinar el precio de la llamadas
        switch (numero) {
            case 12:

            System.out.println("Ingrese la cantidad de minutos que utilizo:"); // Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto = scanner.nextFloat();
            precio = Numeracion.AMERICA_DEL_NORTE.getPrecio_llamadas() * minuto;
            System.out.println("La cantidad a pagar es:" + precio);
                
                break;
        
            case 15:
            System.out.println("Ingrese la cantidad de minutos que utilizo:"); // Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_2 = scanner.nextFloat();
            precio = Numeracion.AMERICA_CENTRAL.getPrecio_llamadas() * minuto_2;
            System.out.println("La cantidad a pagar es:"+precio);
                
                break;
    
            case 18:
            System.out.println("Ingrese la cantidad de minutos que utilizo:");// Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_3 = scanner.nextFloat();
            precio = Numeracion.AMERICA_DEL_SUR.getPrecio_llamadas() * minuto_3;
            System.out.println("La cantidad a pagar es:"+precio);
                break;
        
            case 19:
            System.out.println("Ingrese la cantidad de minutos que utilizo:");// Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_4 = scanner.nextFloat();
            precio = Numeracion.EUROPA.getPrecio_llamadas() * minuto_4;
            System.out.println("La cantidad a pagar es:"+ precio);
                break;
        
            case 23:
            System.out.println("Ingrese la cantidad de minutos que utilizo:");// Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_5 = scanner.nextFloat();
            precio = Numeracion.ASIA.getPrecio_llamadas() * minuto_5;
            System.out.println("La cantidad a pagar es:"+ precio);
                
                break;

            case 25:
            System.out.println("Ingrese la cantidad de minutos que utilizo:"); // Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_6 = scanner.nextFloat();
            precio = Numeracion.AFRICA.getPrecio_llamadas() * minuto_6;
            System.out.println("La cantidad a pagar es:"+ precio);
                
                break;
        
            case 29:
            System.out.println("Ingrese la cantidad de minutos que utilizo:");// Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_7 = scanner.nextFloat();
            precio = Numeracion.OCEANIA.getPrecio_llamadas() * minuto_7;
            System.out.println("La cantidad a pagar es:"+ precio);
                
                break;
            case 31:
            System.out.println("Ingrese la cantidad de minutos que utilizo:");// Pedir minutos, leer minutos dados y calcular el precio mediante el lugar con los valores ya dados
            float minuto_8 = scanner.nextFloat();
            precio = Numeracion.RESTO_DEL_MUNDO.getPrecio_llamadas() * minuto_8;
            System.out.println("La cantidad a pagar es:"+ precio);
                
                break;
        
            default:
            
                break;

        }

        //Cerrar el scanner

        scanner.close();
    }
}
