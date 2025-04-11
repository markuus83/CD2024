package com.refactorizar2;

public class Fecha {

    // Constantes mágicas reemplazadas
    private static final int ABRIL = 4;
    private static final int JUNIO = 6;
    private static final int SEPTIEMBRE = 9;
    private static final int NOVIEMBRE = 11;

    // Variables static (orden correcto)
    public static final int DIAS_EN_SEMANA = 7;
    public static final int MESES_EN_ANO = 12;

    // Variables de instancia
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean esValida() {
        if (mes < 1 || mes > MESES_EN_ANO) {
            return false;
        }

        if (dia < 1 || dia > diasEnMes()) {
            return false;
        }

        return true;
    }

    private int diasEnMes() {
        switch (mes) {
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                return 30;
            case 2:
                return esBisiesto() ? 29 : 28;
            default:
                return 31;
        }
    }

    private boolean esBisiesto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
