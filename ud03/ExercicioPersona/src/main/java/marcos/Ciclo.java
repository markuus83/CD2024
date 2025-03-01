package marcos;

public class Ciclo {
    
    //Atributos
    private String codigo;
    private String nombre;
    private Nivel nivel;
    private Centro centro;

    /**
     * Constructor da clase Ciclo que recibe como parámetros todos os atributos da clase Ciclo
     * 
     * @param codigo -> Código do Ciclo
     * @param nombre -> Nome do Ciclo
     * @param nivel -> Obxecto Nivel ao que fai referencia o Ciclo
     * @param centro -> Obxecto Centro ao que fai referencia o Ciclo
     */
    public Ciclo(String codigo, String nombre, Nivel nivel, Centro centro) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setNivel(nivel);
        this.setCentro(centro);
    }


    //Getters&Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Ciclo {" +
                "codigo='" + this.getCodigo() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", nivel='" + this.getNivel() + '\'' +
                ", centro='" + this.getCentro() + '\'' +
                "}";
    }
    
}
