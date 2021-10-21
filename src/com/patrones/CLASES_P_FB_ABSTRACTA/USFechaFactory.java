package com.patrones.CLASES_P_FB_ABSTRACTA;

public class USFechaFactory implements FechaFactory {

    public FechaTexto creaFechaTexto() {
        return new USFechaTexto();
    }
    public FechaNum creaFechaNum() {
        return new USFechaNum();
    }


}
