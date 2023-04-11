package com.example.bhavana.shopping_mall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpElec {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> technology = new ArrayList<String>();
        technology.add("Apple");
        technology.add("Samsung");
        technology.add("Motrolla");
        technology.add("OnePlus");
        technology.add("Redmi");

        List<String> entertainment = new ArrayList<String>();
        entertainment.add("Apple");
        entertainment.add("Asus");
        entertainment.add("Dell");
        entertainment.add("Lenevo");
        entertainment.add("Toshiba");
//        entertainment.add("Accessories");
//        entertainment.add("Jewellery");

        List<String> science = new ArrayList<String>();
        science.add("Sony");
        science.add("Nikon");
        science.add("Canon");
        science.add("Phillips");
//        science.add("Accessories");
//        science.add("Toys & Games");
//        science.add("Innerwear & NightWear");
//        science.add("Jewellery");

        List<String> girls = new ArrayList<String>();
        girls.add("Earphones");
        girls.add("Speakers");
        girls.add("KeyBoards");
        girls.add("Printers");
//        girls.add("Accessories");
//        girls.add("Toys & Games");
//        girls.add("Innerwear & NightWear");
//        girls.add("Jewellery");

//        List<String> kids = new ArrayList<String>();
//        kids.add("Baby care");
//        kids.add("Soft Toys");
//        kids.add("Kids Accessories");
//        kids.add("Travel");
//        kids.add("Dolls & Dollhouses");

        expandableListDetail.put("Mobiles", technology);
        expandableListDetail.put("Laptops", entertainment);
        expandableListDetail.put("Cameras", science);
        expandableListDetail.put("Accessories",girls);
       // expandableListDetail.put("KIDS", kids);

        return expandableListDetail;
    }
}
