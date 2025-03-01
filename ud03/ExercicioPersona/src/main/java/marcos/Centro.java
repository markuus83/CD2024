package marcos;

public class Centro {
    
    //Atributos
    private Integer codigo;
    private String nombre;
    private String localidad;
    private String calle;
    private String numero;
    private Integer codigoPostal;

    /**
     * Constructor da clase Centro no que recibe como parámetros todos os atributos da clase Centro
     * 
     * @param codigo -> Código do Centro
     * @param nombre -> Nombre do Centro
     * @param localidad -> Localidade do Centro
     * @param calle -> Rúa do Centro
     * @param numero -> Número do Centro
     * @param codigoPostal -> Código postal do Centro
     */
    public Centro(Integer codigo, String nombre, String localidad, String calle, String numero, Integer codigoPostal) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setLocalidad(localidad);
        this.setCalle(calle);
        this.setNumero(numero);
        this.setCodigoPostal(codigoPostal);
    }


    //Getters&Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Método encargado de devolver a dirección completa do centro
     * 
     * @return Devolve unha cadea de texto ca dirección do centro
     */
    public String getDireccion(){
        return this.localidad + ": " + this.calle + " - " + this.numero + " || " + this.codigoPostal;
    }

    /**
     * Método especial toString
     */
    @Override
    public String toString() {
        return "Centro {" +
                "codigo='" + this.getCodigo() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", direccion='" + this.getDireccion() + '\'' +
                "}";
    }

}