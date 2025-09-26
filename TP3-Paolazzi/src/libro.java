public final class libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
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
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2024) {
            this.añoPublicacion = añoPublicacion;
            System.out.println("Año de publicación actualizado correctamente: " + añoPublicacion);
        } else {
            System.out.println("Error: Año de publicación inválido (" + añoPublicacion + ")");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + añoPublicacion);
    }
    
    // Main 
    public static void main(String[] args) {
        libro miLibro = new libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        miLibro.mostrarInfo();
        
        miLibro.setAñoPublicacion(-100); // Inválido
        miLibro.setAñoPublicacion(2020); // Válido
        miLibro.mostrarInfo();
    }
}