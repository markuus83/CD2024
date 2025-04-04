package Circulo;

import java.text.DecimalFormat;

/**
 * Clase Main -> Clase principal do proxecto
 *
 * @author a23marcoscc
 * @version $Id: $Id
 */
public class Main {

    /**
     * Método main onde vai o corpo principal do proxecto
     *
     * @param args -> array de args
     */
    public static void main(String[] args) {

        Circulo circulo = new Circulo(37,43,2.5);

        String salida =
                "La coordenada X es "+circulo.obtenerX()+
                "\nLa coordenada Y es "+circulo.obtenerY()+
                "\nEl radio es "+circulo.obtenerRadio();

        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.2);

        salida+="\n\nLa nueva ubicación y el radio de círculo son\n"+circulo.toString();

        DecimalFormat dosDigitos = new DecimalFormat("0.00");

        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerArea());

        System.out.println(salida);
        System.exit(0);

    }
}
