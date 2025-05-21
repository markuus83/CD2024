package javadoc2;

/**
 * Clase Estudiante
 */
public class Estudiante {

    //Atributos
    private String nombre;
    private int edad;
    private double calificacion;

    /**
     * Método constructor de la clase Estudiante
     * 
     * @param nombre -> Nombre del Estudiante
     * @param edad -> Edad del Estudiante
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Método encargado de asignar <strong>una calificación</strong> al estudiante
     * 
     * @param calificacion -> Calificación del estudiante a asignar
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Método encargado de devolver <strong>o nome</strong> do Estudiante
     * 
     * @return -> String co nome do Estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método encargado de asignar <strong>un nome</strong> ao Estudiante
     * 
     * @param nombre -> Nome do estudiante a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método encargado de devolver <strong>a idade</strong> do Estudiante
     * 
     * @return -> int canidade do estudante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método encargado de asignar a <strong>idade</strong> a un Estudiante
     * 
     * @param edad -> Idade do Estudiante a asignar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método encargado de devolver <strong>a calificación</strong> do Estudiante
     * 
     * @return -> double ca calificación do Estudiante
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Método encargado de devolver se un Estudiante <strong>aprobou</strong>
     * 
     * @return -> boolean de si aprobou ou non
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Método encargado de devolver <strong>a idade escolar</strong> dun Estudiante
     * 
     * @return -> int ca idade escolar 
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Método encargado de devolver se un Estudiante <strong>é e universitario</strong> ou non
     * 
     * @return -> boolean de si é universitario ou non
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Método encarfado de imprimir pola consola <strong>a información</strong> dun Estudiante
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}