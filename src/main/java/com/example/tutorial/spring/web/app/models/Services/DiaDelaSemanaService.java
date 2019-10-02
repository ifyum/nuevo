package com.example.tutorial.spring.web.app.models.Services;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Service("diaDelaSemanaService")
public class DiaDelaSemanaService {

    private static Calendar calculaElDomingoDeResurreccion(final int anyo) {
        int c, g, h, i, j, l;

        g = anyo % 19;
        c = anyo/100;
        h = (c - c/4 - (8*c+13)/25 + 19*g + 15) % 30;
        i = h - (h/28)*(1 - (29/(h + 1))*((21 - g)/11));
        j = (anyo + anyo/4 + i + 2 - c + c/4) % 7;
        l = i - j;

        int mes = 3 + (l + 40)/44;
        int dia = l + 28 - 31*(mes/4);

        Calendar d=Calendar.getInstance();

        d.set( anyo, mes-1, dia);
        // OJO: en Java, los meses se cuentan desde 0 (enero) hasta 11
        // (diciembre). La sustracción en esta línea NO es parte de la
        // fórmula para computar la fecha de interés.

        return d;
    }

    private  Calendar calculaElDia( int anyo) {
        //si arriba agrego ademas del año el dia y el mes seria util
        int dia =25;
        int mes = 12;


        Calendar d=Calendar.getInstance();

        d.set( anyo, mes-1, dia);
        // OJO: en Java, los meses se cuentan desde 0 (enero) hasta 11
        // (diciembre). La sustracción en esta línea NO es parte de la
        // fórmula para computar la fecha de interés.

        return d;
    }


    private static String frase(final Calendar c) {
        if (c==null) {
            return "";
        }

        String dia, mes;

        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY   : dia="lunes";         break;
            case Calendar.TUESDAY  : dia="martes";        break;
            case Calendar.WEDNESDAY: dia="miércoles";     break;
            case Calendar.THURSDAY : dia="jueves";        break;
            case Calendar.FRIDAY   : dia="viernes";       break;
            case Calendar.SATURDAY : dia="sábado";        break;
            case Calendar.SUNDAY   : dia="domingo";       break;
            default:                 dia="errades";       break;
        }

        switch (c.get(Calendar.MONTH)) {
            case Calendar.JANUARY  : mes="enero";         break;
            case Calendar.FEBRUARY : mes="febrero";       break;
            case Calendar.MARCH    : mes="marzo";         break;
            case Calendar.APRIL    : mes="abril";         break;
            case Calendar.MAY      : mes="mayo";          break;
            case Calendar.JUNE     : mes="junio";         break;
            case Calendar.JULY     : mes="julio";         break;
            case Calendar.AUGUST   : mes="agosto";        break;
            case Calendar.SEPTEMBER: mes="septiembre";    break;
            case Calendar.OCTOBER  : mes="octubre";       break;
            case Calendar.NOVEMBER : mes="noviembre";     break;
            case Calendar.DECEMBER : mes="diciembre";     break;
            default:                 mes="inexistembre";  break;
        }

        return (dia+" "
                +String.valueOf(c.get(Calendar.DATE))
                +" de "+mes+" de "
                +String.valueOf(c.get(Calendar.YEAR))
        );
    }


    public List fecha (String[] anno) {
        if (anno.length==0) {
            System.err.println("Por favor indique el año cuyas fechas quiere calcular.");
            System.exit(3);
        }

        int a=0;
        try {
            a=new Integer(anno[0]).intValue();
        } catch (Exception e) {
            System.err.println("Por favor indique el año como una secuencia de dígitos.");
            System.exit(2);
        }

        if (a<=1582) {
            System.err.println("Esta clase solamente funciona con el calendario gregoriano.");
            System.exit(1);
        }

        Calendar domingoDeResurreccion=calculaElDomingoDeResurreccion(a);

        Calendar calculaElDia=calculaElDia(a);

        Calendar miercolesDeCeniza       =(Calendar)domingoDeResurreccion.clone();
        Calendar viernesSanto            =(Calendar)domingoDeResurreccion.clone();
        Calendar sabadoSanto             =(Calendar)domingoDeResurreccion.clone();
        Calendar diaSegundoDeResurreccion=(Calendar)domingoDeResurreccion.clone();
        Calendar ascensionDelSenyor      =(Calendar)domingoDeResurreccion.clone();
        Calendar pentecostes             =(Calendar)domingoDeResurreccion.clone();
        Calendar diaSegundoDePentecostes =(Calendar)domingoDeResurreccion.clone();
        Calendar santisimaTrinidad       =(Calendar)domingoDeResurreccion.clone();
        Calendar corpusChristi           =(Calendar)domingoDeResurreccion.clone();
        Calendar navidad                 =(Calendar)calculaElDia.clone();


        miercolesDeCeniza.add(       Calendar.DATE, -46);
        viernesSanto.add(            Calendar.DATE,  -2);
        sabadoSanto.add(             Calendar.DATE,  -1);
        diaSegundoDeResurreccion.add(Calendar.DATE,   1);
        ascensionDelSenyor.add(      Calendar.DATE,  39);
        pentecostes.add(             Calendar.DATE,  49);
        diaSegundoDePentecostes.add( Calendar.DATE,  50);
        santisimaTrinidad.add(       Calendar.DATE,  56);
        corpusChristi.add(           Calendar.DATE,  60);


        System.out.println("Miércoles de Ceniza:                   "+frase(miercolesDeCeniza        )+".");
        System.out.println("Viernes Santo:                         "+frase(viernesSanto             )+".");
        System.out.println("Sábado Santo:                          "+frase(sabadoSanto              )+".");
        System.out.println("Pascua de Resurrección:                "+frase(domingoDeResurreccion    )+".");
        System.out.println("Día Segundo de Pascua de Resurrección: "+frase(diaSegundoDeResurreccion )+".");
        System.out.println("Ascensión del Señor:                   "+frase(ascensionDelSenyor       )+".");
        System.out.println("Pentecostés:                           "+frase(pentecostes              )+".");
        System.out.println("Día Segundo de Pentecostés:            "+frase(diaSegundoDePentecostes  )+".");
        System.out.println("Santísima Trinidad:                    "+frase(santisimaTrinidad        )+".");
        System.out.println("Corpus Christi:                        "+frase(corpusChristi            )+".");
        System.out.println("navidad:                               "+frase(navidad                  )+".");

     List datos = Collections.singletonList(frase(navidad));

     return datos;
    }
}
