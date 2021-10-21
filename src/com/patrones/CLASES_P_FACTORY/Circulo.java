package com.patrones.CLASES_P_FACTORY;

import java.awt.*;

public class Circulo extends Figuras {

    public Circulo(int lado){
        super(lado);
    }

    public double getArea(){
        return (Math.PI * lado * lado);
    }

    public void dibujar(Graphics g,int x, int y){
        g.setColor(Color.BLACK);
        g.drawArc(x, y, lado, lado, 0, 360);
    }
}
