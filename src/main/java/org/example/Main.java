package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //CREANDO UN OBJETO DE LA CLASE SCANNER
        Scanner entradaPorTeclado=new Scanner(System.in);

        Invitado objetoInvitado = new Invitado();
        //objetoInvitado.mostrarInvitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        // Definir costos de la fiesta

        System.out.println("***** GRAN FIESTA GRUPO URIBE *****");
        System.out.println("*************************************");

        System.out.println("1. digita el costo  de la comida: ");
        double costoAlimentos = entradaPorTeclado.nextDouble();
        if(costoAlimentos > 0){
            objetoFiesta.costosAlimentos = costoAlimentos;

        }else{
            System.out.println("Ingrese un vlaor valido, rata");

        }

        System.out.println("El costo de alimentos fue " + objetoFiesta.costosAlimentos);


        System.out.println("2. digita el costo  de las bebidas: ");
        double costoBebidas = entradaPorTeclado.nextDouble();
        if(costoBebidas > 0){
            objetoFiesta.costosBebidas = costoBebidas;

        }else{
            System.out.println("Ingrese un valor valido, rata");

        }

        System.out.println("El costo de alimentos fue " + objetoFiesta.costosBebidas);

        System.out.println("3. digita el costo  del lugar: ");
        double costoLugar = entradaPorTeclado.nextDouble();
        if(costoLugar > 0){
            objetoFiesta.costosLugar = costoLugar;

        }else{
            System.out.println("Ingrese un valor valido, rata");

        }

        System.out.println("El costo del lugar es: " + objetoFiesta.costosLugar);

        System.out.println("4. digita el costo  de los equipos: ");
        double costoEquipos = entradaPorTeclado.nextDouble();
        if(costoEquipos > 0){
            objetoFiesta.costosEquipos = costoEquipos;

        }else{
            System.out.println("Ingrese un valor valido, rata");

        }

        System.out.println("El costo delos equipos es: " + objetoFiesta.costosEquipos);




    }// fin método main
}