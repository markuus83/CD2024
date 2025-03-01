package marcos;

import java.util.Date;

class Persona {
    
    //Atributos
    private String dni;
    private String nombre;
    private String ape1;
    private String ape2;
    private String correo;
    private Integer movil;
    private Date fecNacemento;


    /**
     * Constructor da clase persona, donde pasamos todos ls atributos de dicha clase como parámetros
     * 
     * @param dni -> DNI de la persona
     * @param nombre -> Nombre de la persona
     * @param ape1 -> Primer apellido de la persona
     * @param ape2 -> Segundo apellido de la persona
     * @param correo -> Correo de la persona
     * @param movil -> Movil de la persona
     * @param fecNacemento -> Fecha de nacimiento de la persona
     */
    public Persona(String dni, String nombre, String ape1, String ape2, String correo, Integer movil, Date fecNacemento) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApe1(ape1);
        this.setApe2(ape2);
        this.setCorreo(correo);
        this.setMovil(movil);
        this.setFecNacemento(fecNacemento);
    }

    //Getters&Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modificamos el getter de los apellidos para devolver el primero y el segundo de forma automática
     * 
     * @return -> String con los dos apellidos en conjunto
     */
    public String getApellidos() {
        return ape1 + " " + ape2;
    }

    public String getApe1(){
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2(){
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getMovil() {
        return movil;
    }

    public void setMovil(Integer movil) {
        this.movil = movil;
    }

    public Date getFecNacemento() {
        return fecNacemento;
    }

    public void setFecNacemento(Date fecNacemento) {
        this.fecNacemento = fecNacemento;
    }

    /**
     * Método especial toString  
     */
    @Override
    public String toString() {
        return "Persona {" +
               "dni='" + this.getDni() + '\'' +
               ", nombre='" + this.getNombre() + '\'' +
               ", apellidos='" + this.getApellidos() + '\'' +
               ", correo='" + this.getCorreo() + '\'' +
               ", móvil='" + this.getMovil() + '\'' +
               ", fechaNacimiento=" + this.getFecNacemento() +
               '}';
    }
    
}