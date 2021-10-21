package com.patrones.CLASES_P_FACTORY;

public class FactoriaDeFiguras {

    public static final int CUADRADO = 0;
    public static final int CIRCULO = 1;

    public Figuras getFigura(int tipo, int lado) {
        if (tipo == CUADRADO){
            return (new Cuadrado(lado));
        }
        else{
            return (new Circulo(lado));
        }
    }
}
