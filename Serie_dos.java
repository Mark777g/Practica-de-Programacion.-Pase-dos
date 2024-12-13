package Procesos;

public class Serie_dos { // Clase de Series dos

    public static double serieDos(int valor_numerico) { // Metodo principal de la serie

        // Diferentes variables
        double x = 1, y = 1;
        double suma = 0;
        String serie = "";

        // Bucle que ayuda a sacar los valores de la serie
        for (int i = 0; i < valor_numerico; i++) {
            double numerador = numeradorDos(i, x, y);
            double[] xy = mkValores(i, x, y, numerador);
            x = xy[0];
            y = xy[1];

            double denominador = denominadorDos(i);
            double exponente = exponenteDos(i);
            double valor = valorDos(numerador, denominador, exponente);

            // Accion para saber si es positivo o negativo
            if (i % 4 < 2) {
                suma += valor; // Positivo
            } else {
                suma -= valor; // negativo
            }

            serie += signoDos(i, numerador, denominador, exponente, valor);
        }
        System.out.println("La serie es: " + serie);

        return suma;
    }

    // Tener el numerador
    public static double numeradorDos(int i, double x, double y) {
        if (i == 0) {
            return x;
        } else if (i == 1) {
            return y;
        } else {
            return x + y;
        }
    }

    // Modificar los valores  y acciones de x e y
    public static double[] mkValores(int i, double x, double y, double numerador) {
        if (i > 1) {
            x = y;
            y = numerador;
        }
        return new double[] {x, y};
    }

    // Sacar denominador
    public static double denominadorDos(int i) {
        return 2 * i + 1;
    }

    // Sacar exponente
    public static double exponenteDos(int i) {
        return 2 * (1 + i);
    }

    // Scar la serie junto a una biblioteca
    public static double valorDos(double numerador, double denominador, double exponente) {
        return Math.pow(numerador / denominador, exponente);
    }

    // Estructura de los signos
    public static String signoDos(int i, double numerador, double denominador, double exponente, double valor) {
        if ((i % 4) < 2) {
            return "+ (" + numerador + " / " + denominador + ")^" + exponente + " ";
        } else {
            return "- (" + numerador + " / " + denominador + ")^" + exponente + " ";
        }
    }
}

