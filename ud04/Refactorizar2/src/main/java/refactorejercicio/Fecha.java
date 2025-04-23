package refactorejercicio;

/**
 * Clase que representa una fecha con día, mes y año.
 * Proporciona métodos para validar fechas y comprobar si es bisiesto.
 */
public class Fecha {

    // Constantes públicas (primero según Checkstyle).
    /**
     * Constante que representa el valor del año bisiesto.
     */
    public static final int BISIESTO = 4;

    /**
     * Constante que representa el valor 100, usado en el cálculo de bisiesto.
     */
    public static final int CIEN = 100;

    /**
     * Constante que representa el valor 0.
     */
    public static final int CERO = 0;

    /**
     * Constante que representa los días en una semana.
     */
    public static final int DIAS_EN_SEMANA = 7;

    /**
     * Constante que representa los días de febrero en un año bisiesto.
     */
    public static final int DIAS_FEBRERO_BISIESTO = 29;

    /**
     * Constante que representa los días de febrero en un año no bisiesto.
     */
    public static final int DIAS_FEBRERO_NORMAL = 28;

    /**
     * Constante que representa los días en un mes normal de 30 días.
     */
    public static final int DIAS_MES_NORMAL = 30;

    /**
     * Constante que representa los días en un mes normal de 31 días.
     */
    public static final int DIAS_MES_NORMAL_DOS = 31;

    /**
     * Constante que representa los meses en un año.
     */
    public static final int MESES_EN_ANO = 12;

    /**
     * Constante que representa el valor 400 en el cálculo de bisiesto.
     */
    public static final int RESTO = 400;

    /**
     * Constante que representa el valor 1.
     */
    public static final int UN = 1;

    // Constantes privadas después
    /**
     * Constante que representa el mes de abril.
     */
    private static final int ABRIL = 4;

    /**
     * Constante que representa el mes de junio.
     */
    private static final int JUNIO = 6;

    /**
     * Constante que representa el mes de noviembre.
     */
    private static final int NOVIEMBRE = 11;

    /**
     * Constante que representa el mes de otros (para febrero).
     */
    private static final int OUTROS_MESES = 2;

    /**
     * Constante que representa el mes de septiembre.
     */
    private static final int SEPTIEMBRE = 9;

    // Variables de instancia
    /**
     * Día de la fecha.
     */
    private int dia;

    /**
     * Mes de la fecha.
     */
    private int mes;

    /**
     * Año de la fecha.
     */
    private int ano;

    /**
     * Constructor de la clase Fecha.
     * @param dia Día de la fecha.
     * @param mes Mes de la fecha.
     * @param ano Año de la fecha.
     */
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Verifica si la fecha es válida según las reglas del calendario.
     * @return true si la fecha es válida, false en caso contrario.
     */
    public boolean esValida() {
        if (mes < UN || mes > MESES_EN_ANO) {
            return false;
        }

        if (dia < UN || dia > diasEnMes()) {
            return false;
        }

        return true;
    }

    /**
     * Devuelve los días que tiene el mes correspondiente.
     * @return El número de días del mes.
     */
    private int diasEnMes() {
        switch (mes) {
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                return DIAS_MES_NORMAL;
            case OUTROS_MESES:
                return esBisiesto() ? DIAS_FEBRERO_BISIESTO : DIAS_FEBRERO_NORMAL;
            default:
                return DIAS_MES_NORMAL_DOS;
        }
    }

    /**
     * Verifica si el año es bisiesto.
     * @return true si el año es bisiesto, false en caso contrario.
     */
    private boolean esBisiesto() {
        return ano % BISIESTO == CERO && ano % CIEN != CERO || ano % RESTO == CERO;
    }

    // Getters
    /**
     * Obtiene el día de la fecha.
     * @return Día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Obtiene el mes de la fecha.
     * @return Mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Obtiene el año de la fecha.
     * @return Año de la fecha.
     */
    public int getAno() {
        return ano;
    }
}
