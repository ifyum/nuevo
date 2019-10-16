package com.example.tutorial.spring.web.app.models.Services;

import org.springframework.stereotype.Service;
import sun.invoke.empty.Empty;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("fechasService")
public class FechasService {

//    public int diasHabiles(Calendar fechaInicial, Calendar fechaFinal, List<Date> listaFechasNoLaborables) {
//        int diffDays = 0;
//        boolean diaHabil = false;
//        //mientras la fecha inicial sea menor o igual que la fecha final se cuentan los dias
//        while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)) {
//
//            if (!listaFechasNoLaborables.isEmpty()) {
//                for (Date date : listaFechasNoLaborables) {
//                    Date fechaNoLaborablecalendar = fechaInicial.getTime();
//                    //si el dia de la semana de la fecha minima es diferente de sabado o domingo
//                    if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && !fechaNoLaborablecalendar.equals(date)) {
//                        //se aumentan los dias de diferencia entre min y max
//                        diaHabil = true;
//                    } else {
//                        diaHabil = false;
//                        break;
//                    }
//                }
//            } else {
//                if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
//                    //se aumentan los dias de diferencia entre min y max
//                    diffDays++;
//                }
//            }
//            if (diaHabil == true) {
//                diffDays++;
//            }
//            //se suma 1 dia para hacer la validacion del siguiente dia.
//            fechaInicial.add(Calendar.DATE, 1);
//        }
//        return diffDays;
//    }
//



    public Date  calcularFecha(Date fecha, int dias,List<Date> listaFechasNoLaborables){
        Calendar calendar = Calendar.getInstance();
        Calendar fechaInicial = Calendar.getInstance();
        Calendar fechaFinal = Calendar.getInstance();
//        calendar.setTime(fecha);
//        calendar.add(Calendar.DAY_OF_YEAR,dias);

        fechaInicial.setTime(fecha);


        boolean diaHabil = false;
        int diffDays = 0;
//
//        while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)) {
        while  (dias >= diffDays) {
            System.out.println("dias a sumar: "+dias);
            System.out.println("contador de dias: "+diffDays);
            System.out.println("entro al while ");
    if (listaFechasNoLaborables != null) {
        for (Date date : listaFechasNoLaborables) {
            Date fechaNoLaborablecalendar = fechaInicial.getTime();
            //si el dia de la semana de la fecha minima es diferente de sabado o domingo
            if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && !fechaNoLaborablecalendar.equals(date)) {
                //se aumentan los dias de diferencia entre min y max
                diaHabil = true;

            } else {
                        diaHabil = false;
                break;
            }
        }
    } else {
        if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
            //se aumentan los dias de diferencia entre min y max
            diffDays=diffDays+1;
            System.out.println("contador: "+diffDays);
            fechaInicial.add(Calendar.DAY_OF_YEAR,1);
            System.out.println("sumando dias: "+fechaInicial.getTime());
        }
    }
    if (diaHabil == true) {

        diffDays=diffDays+1;
        fechaInicial.add(Calendar.DAY_OF_YEAR,1);
    }
    //se suma 1 dia para hacer la validacion del siguiente dia.
    fechaInicial.add(Calendar.DATE, 1);
//        }
            }

    fechaFinal.setTime(fechaInicial.getTime());

        System.out.println("terminado el cliclo fecha final:"+fechaFinal.getTime());
        return  fechaFinal.getTime();
    }



    public Date  sumarRestarDias(Date fecha, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR,dias);



        return  calendar.getTime();
    }
}
