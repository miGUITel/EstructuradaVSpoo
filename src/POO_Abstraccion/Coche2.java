package POO_Abstraccion;

public class Coche2 {
    private String marcha;
    private String modelo;
    private int edad;

    public Coche2(String marcha, String modelo, int edad) {
        this.marcha = marcha;
        this.modelo = modelo;
        this.edad = edad;
    }

    public void comprar() {
        // Implementación del método comprar
        System.out.println("Comprando el coche modelo " + modelo);
    }

    public void vender() {
        // Implementación del método vender
        System.out.println("Vendiendo el coche modelo " + modelo);
    }
}