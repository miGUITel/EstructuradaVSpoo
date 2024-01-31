public class MainCalculadora_6estados {
    public static void main(String[] args) {
        Calculadora_4cambiaEstado_5calculaResultado miCalculadora = new Calculadora_4cambiaEstado_5calculaResultado();

    //6
        miCalculadora.verEstado();

        miCalculadora.encender();
        miCalculadora.sumar(5.0);
        miCalculadora.sumar(3.0);
        miCalculadora.verEstado();

        miCalculadora.apagar();
        miCalculadora.verEstado();
        miCalculadora.sumar(10.0); // No debería sumar, ya que la calculadora está apagada.
    }
}
