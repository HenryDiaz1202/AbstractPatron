package com.patrones.CLASES_P_FACT;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class USFechaTexto extends FechaTexto {

    public String presentaFT() {
        Locale local = new Locale("en", "US");
        Date hoy = new Date();
        String hoystr = DateFormat.getDateInstance(DateFormat.LONG, local).format(hoy);
        return hoystr;
    }


}
