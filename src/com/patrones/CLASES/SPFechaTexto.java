package com.patrones.CLASES;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class SPFechaTexto extends FechaTexto {

    public String presentaFT() {
        Locale local = new Locale("es", "MX");
        Date hoy = new Date();
        String hoystr = DateFormat.getDateInstance(DateFormat.LONG, local).format(hoy);
        return hoystr;
    }


}
