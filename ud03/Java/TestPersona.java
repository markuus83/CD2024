package ud03.Java;

public class TestPersona {
    
    public static void main(String[] args) {
        Persona markos;
        Persona outro;

        markos = new Persona();
        outro = markos;

        markos.nombre = "Flako";
        markos.correo = "a23marcoscc@iessanclemente.net";
        markos.toString();
    }
}
