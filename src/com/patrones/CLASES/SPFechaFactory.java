package com.patrones.CLASES;

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
