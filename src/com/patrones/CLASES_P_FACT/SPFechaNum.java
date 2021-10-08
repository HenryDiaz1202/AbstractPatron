package com.patrones.CLASES_P_FACT;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class SPFechaNum extends FechaNum {

    public String presentaFN() {
        Locale local = new Locale("es", "MX");
        Date hoy = new Date();
        String hoystr = DateFormat.getDateInstance(DateFormat.SHORT, local).format(hoy);
        return hoystr;
    }

}
