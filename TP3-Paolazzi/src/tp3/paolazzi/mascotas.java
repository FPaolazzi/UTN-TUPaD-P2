public class mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public mascotas(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años");
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    // Main 
    public static void main(String[] args) {
        mascotas miMascota = new mascotas("Pompona", "Gato", 2);
        miMascota.mostrarInfo();
        miMascota.cumplirAnios();
        miMascota.mostrarInfo();
    }
}