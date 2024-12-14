import java.util.Scanner;

public class Mates1 {
    public static void main(String[] args) {
        float x; 
        float y; 

        Scanner scanner = new Scanner(System.in); 

        x = scanner.nextFloat(); 

        y = scanner.nextFloat(); 

        System.out.println(x + y);
        scanner.close(); 
    }
}
