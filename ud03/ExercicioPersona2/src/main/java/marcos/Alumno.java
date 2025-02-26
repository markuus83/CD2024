package marcos;

import java.util.Date;

public class Alumno extends Persona{

    //Atributos
    private String codigoXade;
    private boolean autorizaTutores;

    /**
     * Constructor da clase Alumno onde pasamos como parámetros todos os atributos da clase Persoa e Alumno
     * 
     * @param dni -> DNI de la persona
     * @param nombre -> Nombre de la persona
     * @param ape1 -> Primer apellido de la persona
     * @param ape2 -> Segundo apellido de la persona
     * @param correo -> Correo de la persona
     * @param movil -> Movil de la persona
     * @param fecNacemento -> Fecha de nacimiento de la persona
     * @param codigoXade -> CodigoXade do ALumno
     * @param autorizaTutores -> Indica se o Alumno está autorizado polos seus tutores
     */
    public Alumno(String dni, String nombre, String ape1, String ape2, String correo, Integer movil, Date fecNacemento, String codigoXade, boolean autorizaTutores){
        super(dni,nombre, ape1, ape2, correo,movil,fecNacemento);
        this.setCodigoXade(codigoXade);
        this.setAutorizaTutores(autorizaTutores);
    }

    //Setters&Getters
    public String getCodigoXade() {
        return codigoXade;
    }

    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }

    public boolean getAutorizaTutores() {
        return autorizaTutores;
    }

    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }

    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Persona -> Alumno {" +
                "dni='" + this.getDni() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", correo='" + this.getCorreo() + '\'' +
                ", móvil='" + this.getMovil() + '\'' +
                ", fechaNacimiento=" + this.getFecNacemento() + '\'' +
                ", codigoXade='" + this.getCodigoXade() + '\'' +
                ", autorizaTutores='" + this.getAutorizaTutores() + '\'' +
                "}";
    }
}
