package marcos;

import java.util.Date;

public class Profesor extends Persona {
    private String especialidad;
    private String cuerpo;
    private boolean sustituto;
    private Date fecOposicion;

    /**
     * 
     * Constructor da clase Profesor, onde pasamos como parámetros todos os atributos da clase Persoa e Profesor
     * 
     * @param dni -> DNI de la persona
     * @param nombre -> Nombre de la persona
     * @param ape1 -> Primer apellido de la persona
     * @param ape2 -> Segundo apellido de la persona
     * @param correo -> Correo de la persona
     * @param movil -> Movil de la persona
     * @param fecNacemento -> Fecha de nacimiento de la persona
     * @param especialidad -> Especialidad do Profesor
     * @param cuerpo -> Cuerpo do Profesor
     * @param sustituto -> Indica se o profe é sustituo ou non
     * @param fecOposicion -> Indica a data no que io Profesor aprobou a oposición
     */
    public Profesor(String dni, String nombre, String ape1, String ape2, String correo, Integer movil, Date fecNacemento, String especialidad, String cuerpo, boolean sustituto, Date fecOposicion) {
        super(dni,nombre, ape1, ape2, correo,movil,fecNacemento);
        this.setEspecialidad(especialidad);
        this.setCuerpo(cuerpo);
        this.setSustituto(sustituto);
        this.setFecOposicion(fecOposicion);
    }

    //Getters&Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean getSustituto() {
        return sustituto;
    }

    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }

    public Date getFecOposicion() {
        return fecOposicion;
    }

    public void setFecOposicion(Date fecOposicion) {
        this.fecOposicion = fecOposicion;
    }

    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Persona -> Profesor {" +
                "dni='" + this.getDni() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", correo='" + this.getCorreo() + '\'' +
                ", móvil='" + this.getMovil() + '\'' +
                ", fechaNacimiento=" + this.getFecNacemento() + '\'' +
                ", especialidad='" + this.getEspecialidad() + '\'' +
                ", cuerpo='" + this.getCuerpo() + '\'' +
                ", sustituo='" + this.getSustituto() + '\'' +
                ", fecOposicion='" + this.getFecOposicion() + '\'' +
                "}";
    }
}