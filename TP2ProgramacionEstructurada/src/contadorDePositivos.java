import java.util.Scanner;

public class contadorDePositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        
        System.out.println("Ingrese 10 números enteros");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos);
        System.out.println("Ceros: " + contadorCeros);
        
        scanner.close();
    }
}