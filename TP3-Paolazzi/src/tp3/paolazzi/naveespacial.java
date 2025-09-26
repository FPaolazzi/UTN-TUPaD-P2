public class naveespacial {
    private String nombre;
    private double combustible;
    private final double COMBUSTIBLE_MAXIMO = 100.0;
    
    public naveespacial(String nombre, double combustible) {
        this.nombre = nombre;
        if (combustible >= 0 && combustible <= COMBUSTIBLE_MAXIMO) {
            this.combustible = combustible;
        } else {
            this.combustible = 0;
            System.out.println("Combustible inicial ajustado a 0 (valor inválido)");
        }
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("¡" + nombre + " despegó!");
            System.out.println("Combustible usado: 10 unidades");
        } else {
            System.out.println("Error: No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " avanzó " + distancia + " km");
            System.out.println("Combustible usado: " + combustibleNecesario + " unidades");
        } else {
            System.out.println("Error: Combustible insuficiente para avanzar " + distancia + " km");
            System.out.println("Se necesitan: " + combustibleNecesario + " unidades, hay: " + combustible);
        }
    }
    
    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
            System.out.println("Recargados " + cantidad + " unidades");
        } else {
            double exceso = (combustible + cantidad) - COMBUSTIBLE_MAXIMO;
            System.out.println("Error: No se puede superar el límite de " + COMBUSTIBLE_MAXIMO + " unidades");
            System.out.println("Exceso: " + exceso + " unidades");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("-- Estado de la Nave --");
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO + " unidades");
        System.out.println("----------------------------");
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getCombustible() {
        return combustible;
    }
    
    // Main
    public static void main(String[] args) {
        System.out.println("-- Simulacion de Nave Espacial --\n");
        
        naveespacial nave = new naveespacial("Enterprise", 50.0);
        
        System.out.println("-- Estado Inicial --");
        nave.mostrarEstado();
        
        System.out.println("-- Intentando Avanzar sin Combustible --");
        nave.avanzar(100);
        
        System.out.println("\n-- Recargando Combustible --");
        nave.recargarCombustible(30);
        
        // Avanzar correctamente
        System.out.println("\n-- Avanzando con Suficiente Combustible --");
        nave.despegar();
        nave.avanzar(50);
        
        // Mostrar el estado al final
        System.out.println("\n-- Estado Final --");
        nave.mostrarEstado();
    }
}