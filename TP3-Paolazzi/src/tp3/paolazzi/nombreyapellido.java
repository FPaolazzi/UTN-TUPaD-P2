public class nombreyapellido {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public nombreyapellido(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    // Main
    public static void main(String[] args) {
        nombreyapellido estudiante = new nombreyapellido("Florencia", "Paolazzi", "Programación II", 7.5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.0);
        estudiante.mostrarInfo();
    }
}