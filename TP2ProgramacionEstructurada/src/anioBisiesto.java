import java.util.Scanner;

public class anioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        
        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
        scanner.close();
    }
    
    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}