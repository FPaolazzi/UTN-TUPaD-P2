import java.util.Scanner;

public class ConversionesDeTipoYDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 / numero2;
        System.out.println("Resultado de la división (int): " + resultado);
    }
}