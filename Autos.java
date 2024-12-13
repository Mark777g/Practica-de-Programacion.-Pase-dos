package Practica.Ejercicios;
import java.util.Scanner;

public class Autos { // Clase Autos
    public static void autos() {
        Scanner scanner = new Scanner(System.in); // Abrir scanner

        //Declaracion de las diferentes variables

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
            System.out.println("Ingresar el precio o valor de los autos que logro vender:(Presionar el valor 0 si ya desea salir con los datos que tiene)");
            precio_autos = scanner.nextDouble();

            if(precio_autos == 0){ // Accion para salir del bucle
                break;
            }

            cantidad_autos ++; // Seguir sumando o incrementando el contador de autos vendidos

            precio_autos_vendidos += precio_autos; // Accion para sumar los autos vendidos

            if(precio_autos >= 10000.00){
                comision_total += comision; //Accion si es que la condiccion se cumple de sumar la comision total de comisiones
            }
        }

        // Parametros o accion para sacar el dato final y el pago del usuario o individuo
        dato_final = utilidad * precio_autos_vendidos;

        pago_usuario = dato_final + sueldo_empleado + comision_total;

        //Mostar el informe de empleado con los valores calculados 

        System.out.println("Informe del empleado");
        System.out.println("1. El numero total de autos vendidos son:"+cantidad_autos);
        System.out.println("2. El valor total de los autos que vendio:"+precio_autos_vendidos);
        System.out.println("Monto total de pago:");
        System.out.println("a. El sueldo mensual es:"+ sueldo_empleado);
        System.out.println("b. La comision de cada automovil es:"+comision);
        System.out.println("c. Utilidad del valor total de la ventas:"+dato_final);
        System.out.println("d. La retribucion total es:"+pago_usuario);

        //Cerrar scanner
        
        scanner.close();

    }
}
