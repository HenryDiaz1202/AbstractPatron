package com.patrones.CLASES_P_FACT;

public class USFechaFactory implements FechaFactory {

    public FechaTexto creaFechaTexto() {
        return new USFechaTexto();
    }
    public FechaNum creaFechaNum() {
        return new USFechaNum();
    }


}
