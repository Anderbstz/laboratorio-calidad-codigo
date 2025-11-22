package org.example;

/**
 * Clase principal de inicio del programa.
 */
public final class Main {

    /**
     * Constructor privado para evitar instanciación.
     */
    private Main() {
    }

    /**
     * Método principal.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(final String[] args) {
        final int number = 5; // evitar número mágico
        System.out.println("Valor: " + number);
        System.out.println("Otra línea corta");
        System.out.println("Otra línea corta 2");
    }
}
