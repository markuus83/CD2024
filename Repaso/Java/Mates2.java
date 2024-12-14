import java.util.Scanner;

public class Mates2 {
    public static void main(String[] args) {
        float x; 
        float y; 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Introduce el primer número: ");
        x = scanner.nextFloat(); 

        System.out.print("Introduce el segundo número: ");
        y = scanner.nextFloat(); 

        System.out.println("La suma de " + x + " y " + y + " es: " + (x + y));
        scanner.close(); 
    }
}
