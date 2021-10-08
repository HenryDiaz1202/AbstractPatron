package com.patrones.CLASES;

public abstract class FechaNum {

    private int dia;
    private int mes;
    private int anio;

    public abstract String presentaFN();

    public int getAnio() {
        return this.anio;
    }
    public void setAnio(int a) {
        this.anio = anio;
    }
    public int getDia() {
        return this.dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return this.mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }


}
