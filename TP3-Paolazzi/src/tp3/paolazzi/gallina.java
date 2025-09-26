public class gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println(idGallina + " puso un huevo. Total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad++;
        System.out.println(idGallina + " envejeció. Ahora tiene " + edad + " meses");
    }
    
    public void mostrarEstado() {
        System.out.println("-- Estado de la Gallina --");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------------");
    }
    
    // Getters
    public String getIdGallina() {
        return idGallina;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    // Main
    public static void main(String[] args) {
        System.out.println("-- Gestión de Gallinas en Granja Digital --\n");
        
        gallina gallina1 = new gallina("G-001", 6);
        gallina gallina2 = new gallina("G-002", 12);
        
        System.out.println("-- Estado Inicial --");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("-- Simulando Acciones --");
        
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        
        System.out.println("\n-- Estado Final --");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}