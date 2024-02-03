package POO_Abstraccion;

public class Coche3 {
    private String propietario;
    private String matricula;

    public Coche3(String propietario, String matricula) {
        this.propietario = propietario;
        this.matricula = matricula;
    }

    public void multar() {
        // Implementación del método multar
        System.out.println("Multando al coche con matrícula " + matricula);
    }

    public void anular() {
        // Implementación del método anular
        System.out.println("Anulando la multa del coche con matrícula " + matricula);
    }
}