package ud03.Java;

import java.util.Date;

public class Persona{

    // ATRIBUTOS
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    String correo;
    Integer movil;
    Date fecNacemento;

    // MÉTODOS
    public Persona(String nom, String apel){
        nombre = nom;
        apellido1 = apel;
    }
}