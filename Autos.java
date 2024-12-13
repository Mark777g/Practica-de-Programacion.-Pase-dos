package Practica.Ejercicios;
import java.util.Scanner;

public class Autos { // Clase Autos

    // Preguntas del empleado
    public static double autosPrecios(Scanner scanner) {
        System.out.println("Ingrese el precio o valor de los autos que logró vender: (Presionar el valor 0 si ya desea salir con los datos que tiene)");
        return scanner.nextDouble();
    }

    public static void autos() { 
        
        Scanner scanner = new Scanner(System.in); // Abrir scanner para leer la entrada del usuario

        // Diferentes variables
        double sueldo_empleado = 2500.00;
        double comision = 250.00;
        double utilidad = 0.05;
        double precio_autos;
        double cantidad_autos = 0;
        double precio_autos_vendidos = 0;
        double comision_total = 0;
        double dato_final;
        double pago_usuario;

        // Bucle que se va a repetir hasta que se cumplan las acciones o condiciones
        while (true) {
            precio_autos = autosPrecios(scanner);
            
            if (precio_autos == 0) { // Acción para salir del bucle
                break;
            }

            cantidad_autos++; // Seguir sumando o incrementando el contador de autos vendidos
            precio_autos_vendidos += precio_autos; // Acción para sumar los autos vendidos

            if (precio_autos >= 10000.00) {
                comision_total += comision; // Sumar la comisión total de comisiones
            }
        }

        // Parametros o accion para sacar el dato final y el pago del usuario o individuo
        dato_final = utilidadDos(precio_autos_vendidos, utilidad);
        pago_usuario = empleadoDos(dato_final, sueldo_empleado, comision_total);

        // Datos del informe de empleado
        mkInforme(cantidad_autos, precio_autos_vendidos, sueldo_empleado, comision, dato_final, pago_usuario);

        scanner.close(); // Cerrar scanner
    }

    // Accion para poder tener la utilidad
    public static double utilidadDos(double precio_autos_vendidos, double utilidad) {
        return utilidad * precio_autos_vendidos;
    }

    // Accion del pago total del empleado
    public static double empleadoDos(double dato_final, double sueldo_empleado, double comision_total) {
        return dato_final + sueldo_empleado + comision_total;
    }

    // Datos del informe del empleado
    public static void mkInforme(double cantidad_autos, double precio_autos_vendidos, double sueldo_empleado, double comision, double dato_final, double pago_usuario) {
        System.out.println("Informe del empleado");
        System.out.println("1. El numero total de autos vendidos son: " + cantidad_autos);
        System.out.println("2. El valor total de los autos que vendio: " + precio_autos_vendidos);
        System.out.println("Monto total de pago:");
        System.out.println("a. El sueldo mensual es: " + sueldo_empleado);
        System.out.println("b. La comision de cada automóvil es: " + comision);
        System.out.println("c. Utilidad del valor total de las ventas: " + dato_final);
        System.out.println("d. El pago total es: " + pago_usuario);
    }
}
