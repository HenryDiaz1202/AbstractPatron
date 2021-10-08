package com.patrones;

import com.patrones.CLASES.*;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader entrada = new BufferedReader(new
                InputStreamReader(System.in));
        FechaFactory factory;
        FechaTexto ft;
        FechaNum fn;
        String formato, pais;
        int opc;

        do {


            System.out.println("\nSelecciona formato fecha (T = texto / N = número / A = Ambos): ");
            formato = entrada.readLine().toUpperCase();
            System.out.println("Selecciona pais (M = México/U = United State): ");
            pais = entrada.readLine().toUpperCase();

            if (pais.equals("M")) {
                factory = new SPFechaFactory();
                if (formato.equals("T")) {
                    ft = factory.creaFechaTexto();
                    System.out.println(ft.presentaFT());
                } else if (formato.equals("N")) {
                    fn = factory.creaFechaNum();
                    System.out.println(fn.presentaFN());
                } else if (formato.equals("A")) {
                    ft = factory.creaFechaTexto();
                    System.out.println("Formato en texto: " + ft.presentaFT());
                    fn = factory.creaFechaNum();
                    System.out.println("Formato en número: " + fn.presentaFN());
                } else {
                    System.out.println("Formato incorrecto.");
                    System.exit(0);
                }
            } else if (pais.equals("U")) {
                factory = new USFechaFactory();
                if (formato.equals("T")) {
                    ft = factory.creaFechaTexto();
                    System.out.println(ft.presentaFT());
                } else if (formato.equals("N")) {
                    fn = factory.creaFechaNum();
                    System.out.println(fn.presentaFN());
                } else if (formato.equals("A")) {
                    ft = factory.creaFechaTexto();
                    System.out.println("Formato en texto: " + ft.presentaFT());
                    fn = factory.creaFechaNum();
                    System.out.println("Formato en número: " + fn.presentaFN());
                } else {
                    System.out.println("Formato incorrecto.");
                    System.exit(0);
                }
            } else {
                System.out.println("Pais incorrecto.");
                System.exit(0);
            }
        }
        while (true);
    }


}
