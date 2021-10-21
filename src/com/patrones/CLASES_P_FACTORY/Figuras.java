package com.patrones.CLASES_P_FACTORY;

import java.awt.*;

public abstract class Figuras {

    int lado = 0;
    public Figuras(int lado) {
        this.lado = lado;
    }
    public abstract double getArea();
    public abstract void dibujar(Graphics g, int x, int y);

}
