public class preciosRecursivo {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
    
    public static void mostrarPreciosRecursivo(double[] preciosArray, int indice) {
        if (indice >= preciosArray.length) {
            return;
        }
        
        System.out.println("Precio: $" + preciosArray[indice]);
        
        mostrarPreciosRecursivo(preciosArray, indice + 1);
    }
}