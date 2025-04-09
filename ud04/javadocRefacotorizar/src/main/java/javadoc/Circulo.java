package javadoc;

/**.
 * Clase Circulo -> Clase encargada de xenerar novos obxectos Circulo.
 */
public final class Circulo {

    private int x;
    private int y;
    private double radio;

    private final int diametro = 2;
    private final double valorMinimoRadio = 0.0;

    /**.
     * Constructor de la clase Círculo donde recibe como parámetros todos los atributos de la clase.
     *
     * @param valorX -> Valor de la coordenada X.
     * @param valorY -> Valor de la coordenada Y.
     * @param valorRadio -> Longitud del radio del Círculo.
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**.
     * Método encargado de establecer el valor de X.
     *.
     * @param valorX -> Valor de X.
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**.
     * Método encargado de devolver el valor de X.
     *.
     * @return -> Int con el valor de X.
     */
    public int obtenerX() {
        return x;
    }

    /**.
     * Método encargado de establecer el valor de Y.
     *.
     * @param valorY -> Valor de Y.
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**.
     * Método encargado de devolver el valor de Y.
     *.
     * @return -> Int con el valor de Y.
     */
    public int obtenerY() {
        return y;
    }

    /**.
     * Método encargado de establecer el radio del círculo.
     *.
     * @param valorRadio -> Valor del radio.
     */
    public void establecerRadio(double valorRadio) {
        radio = valorRadio < valorMinimoRadio ? valorMinimoRadio : valorRadio;
    }

    /**.
     * Método encargado de devolver el valor del radio
     *
     * @return -> Double con la longitud del radio
     */
    public double obtenerRadio() {
        return radio;
    }

    /**.
     * Método encargado de devolver el valor del diámetro.
     *.
     * @return -> Double con la longitud del radio.
     */
    public double obtenerDiametro() {
        return radio * diametro;
    }

    /**.
     * Método encargado de devolver la longitud del diámetro del círculo.
     *.
     * @return -> Double con la longitud del diámetro.
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**.
     * Método encargado de obtener el área del círculo.
     *.
     * @return -> Double con el área del círculo.
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**.
     * Método encargado de devolver una cadena de texto con los atributos propios de la clase.
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
