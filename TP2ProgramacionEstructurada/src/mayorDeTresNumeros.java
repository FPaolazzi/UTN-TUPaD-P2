import java.util.Scanner;

public class mayorDeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int mayor = numero1;
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        
        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El mayor es: " + mayor);
        
        scanner.close();
    }
}