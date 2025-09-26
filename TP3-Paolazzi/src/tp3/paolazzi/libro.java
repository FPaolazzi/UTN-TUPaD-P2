public class libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    // Setters
    public void setAñoPublicacion(int añoPublicacion) {
        // Validación: año debe ser positivo y razonable (hasta 2025)
        if (añoPublicacion > 0 && añoPublicacion <= 2025) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Error: Año de publicación inválido (" + añoPublicacion + ")");
        }
    }
    
    // Main
    public static void main(String[] args) {
        libro miLibro = new libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        
        System.out.println("Información del Libro:");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año: " + miLibro.getAñoPublicacion());
        
        System.out.println("\nCon año inválido:");
        miLibro.setAñoPublicacion(-100);
        
        System.out.println("\nCon año válido, ej. 2020:");
        miLibro.setAñoPublicacion(2020);
        
        System.out.println("\nInformación Final:");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año: " + miLibro.getAñoPublicacion());
    }
}