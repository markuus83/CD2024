package marcos;

public class Modulo {
    
    //Atributos
    private String codigo;
    private String nombre;
    private String  descripcion;
    private Integer horas;
    private Integer sesiones;

    /**
     * Constructor de la clase Modulo, donde pasamos com parámetros todos los atributos de la propia clase
     * 
     * @param codigo -> Código del Modulo
     * @param nombre -> Nombre del Modulo
     * @param descripcion -> Descripcion del Modulo
     * @param horas -> Numero de horas del Modulo
     * @param sesiones -> Sesiones del Modulo
     */
    public Modulo(String codigo, String nombre, String descripcion, Integer horas, Integer sesiones) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setHoras(horas);
        this.setSesiones(sesiones);
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getSesiones() {
        return sesiones;
    }

    public void setSesiones(Integer sesiones) {
        this.sesiones = sesiones;
    }

    
    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Modulo {" +
                "codigo='" + this.getCodigo() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", descripcion='" + this.getDescripcion() + '\'' +
                ", horas='" + this.getHoras() + '\'' +
                ", sesiones='" + this.getSesiones() + '\'' +
                "}";
    }

    public void sesionesAp(int n) {
        if (n > 0) {
            this.sesiones += n;
        }
    }

    public void sesionesPD(int n) {
        if (n > 0 && this.sesiones >= n) {
            this.sesiones -= n;
        }
    }

}

