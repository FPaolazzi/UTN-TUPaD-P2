import java.util.Scanner;

public class calculadoraDeDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();

        double descuentoPorcentaje = 0;
        double precioFinal = precio;

        switch (categoria) {
            case "A":
                descuentoPorcentaje = 10;
                break;
            case "B":
                descuentoPorcentaje = 15;
                break;
            case "C":
                descuentoPorcentaje = 20;
                break;
            default:
                System.out.println("Categoría no válida. No se aplicará descuento.");
                descuentoPorcentaje = 0;
        }

        if (descuentoPorcentaje > 0) {
            double descuentoMonto = precio * (descuentoPorcentaje / 100);
            precioFinal = precio - descuentoMonto;
        }

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
        System.out.println("Precio final: " + precioFinal);
        
        scanner.close();
    }
}