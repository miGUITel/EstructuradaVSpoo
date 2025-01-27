package POO_Herencia_y_visibilidad;

public class Estudiante extends Person{

    //Atributos
    private String expediente ="12234";

    //Métodos
    public String verNombre(){
        correr();

       // return nombre;
        return getNombre();
    }
}
