package com.patrones.CLASES_P_FACTORY;

import java.awt.*;

public class Cuadrado extends Figuras {

    public Cuadrado(int lado){
        super(lado);
    }

    public double getArea(){
        return (lado * lado);
    }

    public void dibujar(Graphics g, int x, int y){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, lado, lado);
    }
}
