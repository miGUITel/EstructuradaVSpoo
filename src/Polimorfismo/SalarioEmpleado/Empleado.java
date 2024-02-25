package Polimorfismo.SalarioEmpleado;

class Empleado {
    private String nombre;    private double salarioBase;

    // Método para calcular el salario (puede ser sobreescrito por clases derivadas)
    public double calcularSalario() {
        return salarioBase;
    }
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


}