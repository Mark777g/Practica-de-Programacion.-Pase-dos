package Procesos;

public class Serie_dos { // Clase de Series dos

    public static double procedimiento(int valor_numerico) {

        // Declarar las diferentes variables
        double x = 1, y = 1;
        double numerador;
        double denominador;
        double exponente;
        double valor;
        double suma = 0;
        String serie = "";

        // Bucle que ayuda a sacar los valores de la serie
        for(int i = 0; i < valor_numerico; i++){ // Condiciones
             if( i == 0){ //Accion si i es 0
                
                numerador = x;
            
            }else if ( i == 1){ // Accion si i es comparado a 1

                numerador = y;

            }else{  // Accion si ninguna de las anteriores funciona

               numerador = ( x + y );
               x = y;
               y = numerador;
            }

            // Acciones que nos ayudan a determinar el denominador, exponente y el valor de la serie
            denominador = 2 * i + 1;
            exponente = 2 * (1 + i);
            valor = Math.pow(numerador / denominador, exponente);

            if ((i ) % 4 < 2) { // Accion para determinar si va con signo positivo o negativo
                serie += "+ (" + numerador + " / " + denominador + ")^" + exponente + " ";
                suma += valor;
            } else {
                serie += "- (" + numerador + " / " + denominador + ")^" + exponente + " ";
                suma -= valor;
            }
        }
        return suma; // Retornar o devolver la suma
       
    }

    // Agregar las líneas solicitadas al final del código
    static {
        double resultado = procedimiento(10); // Puedes cambiar el valor aquí si es necesario
        System.out.println("La serie es: " + serie); // Presentar la serie
        System.out.println("El resultado de la serie es: " + resultado);
    }
}
