package Procesos;

public enum Numeracion { // Declarar enumeracion de numeracion con las siguientes variables

    AMERICA_DEL_NORTE(2.75f),
    AMERICA_CENTRAL(1.89f),
    AMERICA_DEL_SUR(1.60f),
    EUROPA(3.5f),
    ASIA(4.5f),
    AFRICA(3.1f),
    OCEANIA(3f),
    RESTO_DEL_MUNDO(6f);

    // Variable para guardar los datos de los precios de llamadas

    private final float precio_llamadas;

    // Constructor
    Numeracion(float precio_llamadas) {
        this.precio_llamadas = precio_llamadas;
    }

    // Mostrar u obtener el precio de las llamadas
    public float getPrecio_llamadas() { // Devolver el precio de las llamadas
        return precio_llamadas;
    }
}
