package Calculadora;

public class Alumno { //para ilustrar el paso de mensajes, el alumno tiene su propia calculadora

    /*public Alumno(int anios){
        edad = anios;
    }*/

    //atributos
        private Calculadora suCalculadora = new Calculadora();
        private int edad;

    //métodos
        public void hacerExamen(){
            suCalculadora.encender();
            suCalculadora.sumar(7);
            suCalculadora.sumar(10);
            suCalculadora.verEstado();
            suCalculadora.apagar();
        }
}
