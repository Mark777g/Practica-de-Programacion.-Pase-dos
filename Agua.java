package Practica.Ejercicios;
import java.util.Scanner;

public class Agua { // Clase Agua

    // Datos de agua potable
    public static void agua() {

        Scanner scanner = new Scanner(System.in); // Abrir scanner para datos del empleado

        // Declarrar las diferentes variables
        double consumo;
        boolean edad;
        boolean discapacidad;
        double discapacidad_porcentaje = 0;
        double costo_final;
        double total;
        double alcantarillado_final;
        double basura = 0.75;
        double proceso_costo = 0.50;

        // Preguntas para el usuaario para cobrar el consumo de agua
        System.out.println("Preguntas para cobrar el consumo de agua potable:");

        // Funciones para tener los datos del usuario
        consumo = finalConsumo(scanner);
        edad = finalEdad(scanner);
        discapacidad = finalDiscapacidad(scanner);

        if (discapacidad) {
            discapacidad_porcentaje = finalPorcentajeDiscapacidad(scanner);
        }

        // Valor del costo del agua y los descuentos
        costo_final = mkCostoFinal(consumo);
        costo_final = mkDescuentos(costo_final, consumo, edad, discapacidad, discapacidad_porcentaje);

        // Valor de costos adicionales y el total
        alcantarillado_final = mkAlcantarillado(costo_final);
        total = mkTotal(costo_final, alcantarillado_final);

        // Final de las acciones
        finalTodo(costo_final, alcantarillado_final, total, basura, proceso_costo);

        scanner.close(); // Cerrar el scanner
    }

    // Funciones y preguntas para el consumo de agua 
    public static double finalConsumo(Scanner scanner) {
        System.out.println("Ingrese el valor del consumo de agua potable:");
        return scanner.nextDouble();
    }

    public static boolean finalEdad(Scanner scanner) {
        System.out.println("¿Pertenece a la tercera edad? (true/false):");
        return scanner.nextBoolean();
    }

    public static boolean finalDiscapacidad(Scanner scanner) {
        System.out.println("¿Tiene algún tipo de discapacidad? (true/false):");
        return scanner.nextBoolean();
    }

    public static double finalPorcentajeDiscapacidad(Scanner scanner) {
        System.out.println("Ingrese el porcentaje de discapacidad:");
        return scanner.nextDouble();
    }

    // Accion para tener el consumo 
    public static double mkCostoFinal(double consumo) {
        double costo_final = 0;
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
        return costo_final;
    }

    // cciones si la persona tiene discapaciadad o es de tercera edad
    public static double mkDescuentos(double costo_final, double consumo, boolean edad, boolean discapacidad, double discapacidad_porcentaje) {
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
        return costo_final;
    }

    // Accion para el alcatarillado
    public static double mkAlcantarillado(double costo_final) {
        double alcantarillado = 0.35;
        return costo_final * alcantarillado;
    }

    // Accion para el pago total
    public static double mkTotal(double costo_final, double alcantarillado_final) {
        double basura = 0.75;
        double proceso_costo = 0.50;
        return costo_final + alcantarillado_final + basura + proceso_costo;
    }

    // Datos de los valores del consumo de agua potable
    public static void finalTodo(double costo_final, double alcantarillado_final, double total, double basura, double proceso_costo) {
        System.out.println("Valores del consumo de agua potable:");
        System.out.println("1. Valor del servicio de agua potable: " + costo_final);
        System.out.println("2. Valor del impuesto de alcantarillado: " + alcantarillado_final);
        System.out.println("3. Valor de la recolección de basura: " + basura);
        System.out.println("4. Valor de procesamiento de datos: " + proceso_costo);
        System.out.println("5. Total a pagar: " + total);
    }
}
