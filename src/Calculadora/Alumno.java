package Calculadora;

public class Alumno { //para ilustrar el paso de mensajes, el alumno tiene su propia calculadora

    //atributos
        private Calculadora suCalculadora = new Calculadora();

    //métodos
        public void hacerExamen(){
            suCalculadora.encender();
            suCalculadora.sumar(7);
            suCalculadora.sumar(10);
            suCalculadora.verEstado();
            suCalculadora.apagar();
        }
}
