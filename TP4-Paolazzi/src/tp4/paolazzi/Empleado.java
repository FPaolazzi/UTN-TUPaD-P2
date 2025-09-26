package tp4.paolazzi;

public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constantes
    private static final double SALARIO_POR_DEFECTO = 3200.0;
    private static int proximoId = 1;
    
    // Constructores
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= proximoId) {
            proximoId = id + 1;
        }
    }
    
    public Empleado(String nombre, String puesto) {
        this(proximoId, nombre, puesto, SALARIO_POR_DEFECTO);
        proximoId++;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    
    // Método sobrecargado para aumento porcentual
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            this.salario += this.salario * (porcentajeAumento / 100);
        }
    }
    
    // Método sobrecargado para aumento fijo
    public void actualizarSalario(int bono) {
        if (bono > 0) {
            this.salario += bono;
        }
    }
    
    // Método toString()
    @Override
    public String toString() {
        return String.format("ID: %d | %s | %s | $%.2f", id, nombre, puesto, salario);
    }
    
    // Método estático para mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Método Main
    public static void main(String[] args) {
        System.out.println("--- Sistema de Empleados ---\n");
        
        Empleado empleado1 = new Empleado(101, "Andrea Molina", "Consultor Farmaceutico", 4800.0);
        Empleado empleado2 = new Empleado("Diego Herrera", "Analista de Datos Medicos");
        Empleado empleado3 = new Empleado("Sofia Ramirez", "Especialista en Regulacion");
        Empleado empleado4 = new Empleado(200, "Javier Torres", "Director de Estudios Clinicos", 7200.0);
        Empleado empleado5 = new Empleado("Lucia Fernandez", "Coordinador de Proyectos");
        Empleado empleado6 = new Empleado("Miguel Santos", "Monitor Clinico");
        
        System.out.println("--- Plantilla de Empleados ---");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        System.out.println(empleado5);
        System.out.println(empleado6);
        
        System.out.println("\n--- Revisión de Compensaciones ---");
        
        System.out.println("Evaluacion anual - " + empleado1.getNombre());
        System.out.println("Salario anterior: $" + empleado1.getSalario());
        empleado1.actualizarSalario(6.0);
        System.out.println("Salario actualizado en un 6%: $" + empleado1.getSalario());
        
        System.out.println("\nBono por proyecto - " + empleado2.getNombre());
        System.out.println("Salario anterior: $" + empleado2.getSalario());
        empleado2.actualizarSalario(1800);
        System.out.println("Salario actualizado en $1800: $" + empleado2.getSalario());
        
        System.out.println("\nPromocion - " + empleado3.getNombre());
        System.out.println("Salario anterior: $" + empleado3.getSalario());
        empleado3.actualizarSalario(15.0);
        System.out.println("Salario actualizado en un 15%: $" + empleado3.getSalario());
        
        System.out.println("\n--- Reporte ---");
        System.out.println("Total de colaboradores: " + Empleado.mostrarTotalEmpleados());
        
        System.out.println("\n--- Actualización de Cargo ---");
        System.out.println("Situacion actual: " + empleado5);
        empleado5.setPuesto("Gerente de Operaciones Clinicas");
        empleado5.actualizarSalario(20.0);
        System.out.println("Nueva situacion con un 20% de aumento: " + empleado5);
        
        System.out.println("\n--- Sistema Actualizado ---");
    }
}