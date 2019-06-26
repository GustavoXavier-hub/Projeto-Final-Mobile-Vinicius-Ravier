package br.com.etechoracio.solicitacaoferiasvx.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
    public static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");


    public static String formatDate(Date data) {
        return DATE_FORMAT.format(data);
    }


    public static String formatDate(int dia, int mes, int ano) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(ano, mes, dia);
            return DATE_FORMAT.format(calendar.getTime());
        } catch (Exception e) {
            return null;

        }
    }

    public static Date toDate(String date) {
        try {
            return DATE_FORMAT.parse(date);
        } catch (ParseException e) {

            return null;
        }
    }

    public static boolean isMonday(Date data) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        return day == 2;
    }

    public static Date addDias(Date data, int dias){
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH,  dias);
        return cal.getTime();
    }
}
