package ValidadorContrasena;

//Debe tener al menos 8 caracteres.
//Debe contener al menos una letra mayúscula.
//Debe contener al menos una letra minúscula.
//Debe contener al menos un número.
//Debe contener al menos un carácter especial (!@#$%^&*).

public class Validador {

    public boolean esValida(String password) {
        
        // Mínimo 8 caracteres
        if (password.length() < 8) {
            return false;
        }

        // Variables para validar los requisitos
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        // Caracteres especiales permitidos
        String caracteresEspeciales = "!@#$%^&*";

        // Recorrer la contraseña y verificar cada requisito
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (caracteresEspeciales.indexOf(c) != -1) {
                tieneEspecial = true;
            }
        }

        // Retornar verdadero solo si cumple todos los requisitos
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial;
    }
}
