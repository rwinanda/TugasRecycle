package com.example.recyclenanda;

import java.util.ArrayList;

public class DataKlub {
    private static String[] namaklub = {
            "Arsenal",
            "Chelsea",
            "Everton",
            "Leicester",
            "Liverpool",
            "Manchester City",
            "Manchester United",
            "Southampton",
            "Tottenham",
            "Wolverhampton"
    };

    private static String [] desklub = {
            "Klub yang cupu",
            "Klub yang lemah",
            "Klub sangat cupu",
            "Klub agak cupu",
            "Klub paling cupu",
            "Klub tangguh, kuat didunia",
            "Klub paling, sangat, ter, very cupu, lemah",
            "Klub lumayan",
            "Klub sok jago",
            "Klub Overrated"
    };

    private static int [] logoklub = {
            R.drawable.arsenal,
            R.drawable.chelsea,
            R.drawable.everton,
            R.drawable.leicester,
            R.drawable.liverpool,
            R.drawable.city,
            R.drawable.manu,
            R.drawable.southampton,
            R.drawable.spurs,
            R.drawable.wolves
    };

    static ArrayList<Klub> getListData(){
        ArrayList<Klub> list = new ArrayList<>();
        for (int position = 0; position <namaklub.length; position++){
            Klub klub = new Klub();
            klub.setNamaklub(namaklub[position]);
            klub.setDesklub(desklub[position]);
            klub.setLogo(logoklub[position]);
            list.add(klub);
        }
        return list;
    }
}