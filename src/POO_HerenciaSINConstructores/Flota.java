package POO_HerenciaSINConstructores;

public class Flota {
//Cambiando la clase del siguiente atributo se puede ver cómo
//    tiene acceso o no a los métodos de la jerarquía de herencia
//    cuanto más abajo esté en la jerarquía más métodos (publicos)
//    puede utilizar
//    probar a cambiar por public Acuatico y public Vehiculo
    public Barco miYate = new Barco();
//    public Vehiculo miYate = new Vehiculo();
//    public Acuatico miYate = new Acuatico();
    void probar(){
        miYate.navegar();
        miYate.encenderMotor();
        miYate.transportar();
    }
}
