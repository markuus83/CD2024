package sonar;

public class EmailValidator {
    
    public boolean isValid(String email) {

        //Si el email es nulo o está vacío, no es válido
        if (email == null || email.isEmpty()) {
            return false;
        }

        //Si el email no contiene un solo @ o si el @ está al principio o al final, no es válido
        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
            return false;
        }
        
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);
        String ending = "";
        
        //Si el dominio no termina en .com o .co.uk, no es válido
        if (domainPart.endsWith(".com")) {
            ending = ".com";
        } else if (domainPart.endsWith(".co.uk")) {
            ending = ".co.uk";
        }
        
        String middlePart = domainPart.substring(0, domainPart.length() - ending.length());
        
        //Si alguna de las partes del email está vacía, no es válido
        if (localPart.isEmpty() || domainPart.isEmpty() || ending.isEmpty() || middlePart.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
