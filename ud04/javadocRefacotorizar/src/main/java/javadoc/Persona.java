package javadoc;

/**.
 * Persona -> Clase encargada de xenerar novos obxectos Persona.
 */
public class Persona {

    private String nombre;
    private int edad;

    /**.
     * Método constructor da clase Persona, onde recibmos como parámetros todos os atributos da clase
     *
     * @param nombre -> Nome da persoa
     * @param edad -> Idade da persoa
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**.
     * Método encargado de devolver o nome da persoa
     *
     * @return -> String co nome da persoa
     */
    public String getNombre() {
        return nombre;
    }

    /**.
     * Método encargado de establecer o nome da persoa
     *
     * @param nombre -> Novo nome da persoa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**.
     * Método encargado de devovler a idade da persoa
     *
     * @return -> Int ca idade da persoa
     */
    public int getEdad() {
        return edad;
    }

    /**.
     * Método encargado de establecer a idade da persoa
     *
     * @param edad -> Nova idade da persoa
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**.
     * Método encargado de imprimir a información dunha Persoa, semellante ao toString.
     * Pero en vez de devolver unha variable, faino con prints.
     */
    public String imprimirDetalles() {
        return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad();
    }
}
