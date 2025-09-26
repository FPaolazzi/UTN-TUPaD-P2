import java.util.Scanner;

public class calculadoraDeEnvio {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona no válida. Se aplicará tarifa Nacional por defecto.");
            costoPorKg = 5.0;
        }
        
        return peso * costoPorKg;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);
        
        scanner.close();
    }
}