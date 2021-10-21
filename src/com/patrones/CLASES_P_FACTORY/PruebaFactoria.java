package com.patrones.CLASES_P_FACTORY;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PruebaFactoria extends JFrame implements ActionListener {

    private JLabel etiqueta1 = new JLabel("Introduce tipo figura:");
    private JTextField texto1 = new JTextField("0");
    private JLabel etiqueta2 = new JLabel("Introduce lado figura:");
    private JTextField texto2 = new JTextField("50");
    private JButton dibujar = new JButton("Dibujar");
    private JButton borrar = new JButton("Borrar");
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private FactoriaDeFiguras factoria = new FactoriaDeFiguras();

    public static void main(String args[]) {
        PruebaFactoria pf = new PruebaFactoria();
    }

    public PruebaFactoria() {
        super("Prueba Factoria");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setup();
    }

    private void setup() {
        getContentPane().setLayout(new BorderLayout());
        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(etiqueta1);
        panel1.add(texto1);
        panel1.add(etiqueta2);
        panel1.add(texto2);
        panel1.add(dibujar);
        panel1.add(borrar);
        dibujar.addActionListener(this);
        borrar.addActionListener(this);
        getContentPane().add("North", panel1);
        getContentPane().add("Center", panel2);
        this.setSize(450, 400);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dibujar) {
            Graphics g = panel2.getGraphics();
            int t = Integer.parseInt(texto1.getText());
            int l = Integer.parseInt(texto2.getText());
            Figuras figura = factoria.getFigura(t, l);
            figura.dibujar(g, 175, 20);
        }
        if (e.getSource() == borrar) {
            repaint();
        }
    }
}
