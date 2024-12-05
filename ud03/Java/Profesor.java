package ud03.Java;

import java.util.Date;

public class Profesor {
    
    String especialidad;
    String cuerpo;
    boolean sustituto;
    Date fecOposicion;
    
    public Profesor(){
    };

    public String getCuerpo() {
        return cuerpo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Date getFecOposicion() {
        return fecOposicion;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setFecOposicion(Date fecOposicion) {
        this.fecOposicion = fecOposicion;
    }
    
    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }
}
