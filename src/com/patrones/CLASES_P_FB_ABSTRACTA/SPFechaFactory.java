package com.patrones.CLASES_P_FB_ABSTRACTA;

public class SPFechaFactory implements FechaFactory {

    @Override
    public FechaTexto creaFechaTexto() {
        return new SPFechaTexto();
    }

    @Override
    public FechaNum creaFechaNum() {
        return new SPFechaNum();
    }


}
