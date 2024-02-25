package POO_HerenciaSINConstructores;

public class Flota {

    public Barco miYate = new Barco();

    void probar(){
        miYate.navegar();
        miYate.encenderMotor();
        miYate.transportar();
    }
}
