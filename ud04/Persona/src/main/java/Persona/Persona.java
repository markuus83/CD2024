package Persona;

/**
 * Persona -> Clase para probar a documentación de javadoc
 */
public class Persona {

    private String nombre;
    private int edad;

    /**
     * Método constructor da clase Persona, onde recibmos como parámetros todos os atributos da clase
     * 
     * @param nombre -> Nome da persoa
     * @param edad -> Idade da persoa
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método encargado de devolver o nome da persoa
     * 
     * @return -> String co nome da persoa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método encargado de establecer o nome da persoa
     * 
     * @param nombre -> Novo nome da persoa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método encargado de devovler a idade da persoa
     * 
     * @return -> Int ca idade da persoa
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método encargado de establecer a idade da persoa
     * 
     * @param edad -> Nova idade da persoa
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método encargado de mostrar por consola detalles por persoa.
     * 
     * Adicional: Non devolve nada, no propio método se atopan os prints
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
