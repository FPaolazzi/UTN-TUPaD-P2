public class modificacionDePrecios {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
   
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios);
    }
    
    public static void mostrarPrecios(double[] preciosArray) {
        for (double precio : preciosArray) {
            System.out.println("Precio: $" + precio);
        }
    }
}