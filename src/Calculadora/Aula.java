package Calculadora;

public class Aula {

    public static void main(String[] args) {

        //En el aula hay un alumno que puede hacer un Examen. Para ello, hace uso de su calculadora.

        Alumno bernardo = new Alumno();
        bernardo.hacerExamen();

        CalculadoraEstatica.encender();
        CalculadoraEstatica.apagar();
        int resultado = CalculadoraEstatica.sumar(5,11);
        resultado = 0;
    }

}
