package Practica.Ejercicios;
import java.util.Scanner;

public class Agua { // Clase Agua
    public static void agua() { // Metodo de Agua principal
        Scanner scanner = new Scanner(System.in); // Abrir scanner
        // Declaracion de las diferentes variables
        double consumo;
        boolean edad;
        boolean discapacidad;
        double discapacidad_porcentaje = 0;
        double costo_final = 0;
        double total;
        double alcantarillado = 0.35;
        double alcantarillado_final;
        double basura = 0.75;
        double proceso_costo = 0.50;
        
        // Preguntas para el usuario para cobrar el consumo de agua

        System.out.println("Preguntas para cobrar el consumo de agua potable:");

        System.out.println("Ingrese el valor del consumo de agua potable:");
        consumo = scanner.nextDouble();

        System.out.println("Pertenece a la tercera edad? (true/false):");
        edad = scanner.nextBoolean();

        System.out.println("Tiene algun tipo de discapacidad? (true/false):");
        discapacidad = scanner.nextBoolean();

        // Accion si es que el usuario tiene algun tipo de discapacidad

        if (discapacidad) {
            System.out.println("Ingrese el porcentaje de discapacidad:");
            discapacidad_porcentaje = scanner.nextDouble();
        }

        // Parametros para medir el costo de consumo de agua potable

        if (consumo <= 15) {
            costo_final = 3.00;
        } else if (consumo <= 25) {
            costo_final = 3.00 + (consumo - 15) * 0.10;
        } else if (consumo <= 40) {
            costo_final = 3.00 + (10 * 0.10) + (consumo - 25) * 0.20;
        } else if (consumo <= 60) {
            costo_final = 3.00 + (10 * 0.10) + (15 * 0.20) + (consumo - 40) * 0.30;
        } else {
            costo_final = 3.00 + (10 * 0.10) + (15 * 0.20) + (20 * 0.30) + (consumo - 60) * 0.35;
        }

        // Accion si el individuo es de tercera edad

        if (edad) {
            if (consumo <= 15) {
                costo_final = costo_final * 0.50;
            } else {
                costo_final -= 3.00 * 0.30;
            }
        } else if (discapacidad) {
            if (consumo <= 15) {
                costo_final -= 3.00 * (discapacidad_porcentaje / 100);
            }
        }

        // Calculos para sacar los valores propuestos o adicionales

        alcantarillado_final = costo_final * alcantarillado;
        total = costo_final + alcantarillado_final + basura + proceso_costo;

        // Mostrar los valores realizados o calculados

        System.out.println("Valores del consumo de agua potable:");
        System.out.println("1. Valor del servicio de agua potable:" + costo_final);
        System.out.println("2. Valor del impuesto de alcantarillado:" + alcantarillado_final);
        System.out.println("3. Valor de la recolección de basura:" + basura);
        System.out.println("4. Valor de procesamiento de datos:" + proceso_costo);
        System.out.println("5. Total a pagar:" + total);

        // Cerrar scanner

        scanner.close();
    }
}
