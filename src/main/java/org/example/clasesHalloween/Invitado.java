package org.example.clasesHalloween;

public class Invitado {
    //ATRIBUTOS

    public String nombre;
    public String apellido;
    public int edad;
    public String id;
    public boolean aplicaCover;
    public float valorCover;
    public char disfraz;


    //CONSTRUCTOR

    public Invitado() {

    }

    public Invitado(String nombre, String apellido, int edad, String id, boolean aplicaCover, float valorCover, char disfraz) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.aplicaCover = aplicaCover;
        this.valorCover = valorCover;
        this.disfraz = disfraz;
    }

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    //METODOS
    public void mostrarInvitado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
        System.out.println("Identificación: "+this.id);
        System.out.println("Paga Cover: "+this.aplicaCover);
        System.out.println("Valor del Cover: "+this.valorCover);
        System.out.println("Tipo Disfraz: "+this.disfraz);
    }

}
