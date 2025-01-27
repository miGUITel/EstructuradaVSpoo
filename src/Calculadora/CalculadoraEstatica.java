package Calculadora;

public class CalculadoraEstatica {

    private static boolean estadoEncendido = false;

    public static void encender(){
        estadoEncendido = true;
    }

    public static void apagar(){
        estadoEncendido = false;
    }

    public static boolean isEstadoEncendido() {
        return estadoEncendido;
    }

    public static int sumar(int sumando1, int sumando2){
        return sumando1 + sumando2;
    }
}
