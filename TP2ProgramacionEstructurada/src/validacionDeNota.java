import java.util.Scanner;

public class validacionDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        
        System.out.println("Validación de nota (0-10)");

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
        System.out.println("La nota ingresada es: " + nota);
        
        scanner.close();
    }
}