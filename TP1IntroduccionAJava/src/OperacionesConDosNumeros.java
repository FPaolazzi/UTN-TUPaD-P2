import java.util.Scanner;

public class OperacionesConDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número entero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingresa el segundo número entero: ");
        int num2 = sc.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2;
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}
