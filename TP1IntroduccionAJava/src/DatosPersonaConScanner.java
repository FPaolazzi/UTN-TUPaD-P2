import java.util.Scanner;

public class DatosPersonaConScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        
        sc.close();
    }
}
