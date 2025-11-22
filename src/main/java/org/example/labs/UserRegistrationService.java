package org.example.labs;

/**
 * Servicio encargado de registrar usuarios.
 */
public class UserRegistrationService {

    /**
     * Último mensaje de error registrado.
     */
    private String lastErrorMessage;

    /**
     * Registra un nuevo usuario.
     *
     * @param username usuario
     * @param password contraseña
     * @param email correo electrónico
     * @return true si el usuario se registró correctamente
     */
    public boolean register(
            final String username,
            final String password,
            final String email) {

        if (username == null || password == null || email == null) {
            lastErrorMessage = "Datos inválidos";
            return false;
        }

        return true;
    }

    /**
     * Método auxiliar demostrativo.
     *
     * @param s cadena de entrada
     */
    public void x(final String s) {
        System.out.println("Método x: " + s);
    }
}
