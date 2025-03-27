package Circulo;

/**
 * Clase Circulo -> Clase encargada de xenerar novos obxectos Circulo
 *
 * @author a23marcoscc
 * @version $Id: $Id
 */
public class Circulo {

    //Atributos
    private int x;
    private int y;
    private double radio;

    
    /**
     * <p>Constructor for Circulo.</p>
     *
     * @param valorX a int
     * @param valorY a int
     * @param valorRadio a double
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    
    /**
     * <p>establecerX.</p>
     *
     * @param valorX a int
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    
    /**
     * <p>obtenerX.</p>
     *
     * @return a int
     */
    public int obtenerX() {
        return x;
    }

    
    /**
     * <p>establecerY.</p>
     *
     * @param valorY a int
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    
    /**
     * <p>obtenerY.</p>
     *
     * @return a int
     */
    public int obtenerY() {
        return y;
    }

    
    /**
     * <p>establecerRadio.</p>
     *
     * @param valorRadio a double
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    
    /**
     * <p>obtenerRadio.</p>
     *
     * @return a double
     */
    public double obtenerRadio() {
        return radio;
    }

    
    /**
     * <p>obtenerDiametro.</p>
     *
     * @return a double
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    
    /**
     * <p>obtenerCircunferencia.</p>
     *
     * @return a double
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    
    /**
     * <p>obtenerArea.</p>
     *
     * @return a double
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
