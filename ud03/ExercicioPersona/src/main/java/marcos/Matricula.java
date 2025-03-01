package marcos;

public class Matricula {
    
    //Atributos
    private Alumno alumno;
    private Modulo modulo;
    private Integer nota;
    private String curso;

    /**
     * Constructor da clase Matricula onde recibe como parámetros todos os atributos da clase Matricula
     * 
     * @param alumno -> Obxecto alumno ao cal pertence a Matricula
     * @param modulo -> Obxecto Modulo ao cal pertence a Matricula
     * @param nota -> Nota da Matricula
     * @param curso -> Curso ao que fai referencia a Matricula
     */
    public Matricula(Alumno alumno, Modulo modulo, Integer nota, String curso) {
        this.setAlumno(alumno);
        this.setModulo(modulo);
        this.setNota(nota);
        this.setCurso(curso);
    }

    //Getters&Setters
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Matricula {" +
                "alumno='" + this.getAlumno() + '\'' +
                ", modulo='" + this.getModulo() + '\'' +
                ", nota='" + this.getNota() + '\'' +
                ", curso='" + this.getCurso() + '\'' +
                "}";
    }

    
}
