package javadoc;

/**.
 * Estudiante -> Clase encargada de xenerar novos obxectos Estudiante.
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private double calificacion;

    private final double calificacionMinima = 5.0;
    private final int edadEscolar = 12;
    private final int mayorEdad = 18;

    /**.
     * Constructor propio da clase Estuiante, onde recibe como parámetros todos os atributos da propia clase.
     *
     * @param nombre -> Nome do estudiante
     * @param edad -> Idade do estudiante
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**.
     * Método encargado de avaliar a nota dun estudante
     *
     * @param calificacion -> Establece a calificación do estudante
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**.
     * Método encargado de devolver o nome dun estudante
     *
     * @return -> String co nome do estudante
     */
    public String getNombre() {
        return nombre;
    }

    /**.
     * Método encargado de avaliar o nome dun estudante
     *
     * @param nombre -> Nome do estudante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**.
     * Método encargado de devolver a idade dun estudante
     *
     * @return -> Int ca idade do estudante
     */
    public int getEdad() {
        return edad;
    }

    /**.
     * Método encargado de avaliar a idade dun estudante
     *
     * @param edad -> Idade do estudante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**.
     * Método encargado de devolver a califiación dun estudante
     *
     * @return -> Double ca califiación dun estudante
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**.
     * Método encargado de devolver se un estudante está aprobado ou non
     *
     * @return -> Boolean dependendo de se a calificación é menor a 5 ou non
     */
    public boolean aprobo() {
        return calificacion >= calificacionMinima;
    }

    /**.
     * Método encargado de devolver a idade escolar dun estudante
     *
     * @return -> Int ca idade escolar
     */
    public int edadEscolar() {
        return edad / edadEscolar;
    }

    /**.
     * Método encargado de devolver se un estudante é universitario ou non
     *
     * @return -> Boolean dependendo de se a idade é menor a 18 ou non
     */
    public boolean esUniversitario() {
        return edad >= mayorEdad;
    }

    /**.
     * Método encargado de imprimir a información dun estudante,semellante ao toString.
     * Pero en vez de devolver unha variable, faino con prints.
     */
    public String imprimirInformacion() {
        return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nCalificación: "
                + this.getCalificacion();
    }
}
