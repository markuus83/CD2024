package marcos;

public class Nivel {
    
    //Atributos
    private String nivel;

    /**
     * Constructor da clase Nivel onde recibe como parámetros todos os atributos da clase nivel
     * 
     * @param nivel -> Nivel
     */
    public Nivel(String nivel) {
        this.setNivel(nivel);
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Nivel {" +
                "nivel='" + this.getNivel() + '\'' +
                "}";
    }
}
