package org.example.clasesHalloween;

public class Fiesta {
    //ATRIBUTOS
    public String fecha;
    public double costosTotal;

    public double costosAlimentos;

    public double costosBebidas;

    public double costosLugar;

    public double costosEquipos;
    public double gastosTotal ;
    public float ganancias;
    public int numeroEntradas;
    public double valorEntrada;

    // CONSTRUCTOR

    public Fiesta() {

    }

    public Fiesta(String fecha, double costosTotal, double gastosTotal, float ganancias, int numeroEntradas, double valorEntrada) {
        this.fecha = fecha;
        this.costosTotal = costosTotal;
        this.gastosTotal = gastosTotal;
        this.ganancias = ganancias;
        this.numeroEntradas = numeroEntradas;
        this.valorEntrada = valorEntrada;
    }

    //METODOS
}
