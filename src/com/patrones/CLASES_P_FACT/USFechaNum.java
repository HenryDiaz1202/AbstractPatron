package com.patrones.CLASES_P_FACT;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class USFechaNum extends FechaNum {

    public String presentaFN() {
        Locale local = new Locale("en", "US");
        Date hoy = new Date();
        String hoystr = DateFormat.getDateInstance(DateFormat.SHORT, local).format(hoy);
        return hoystr;
    }

}
