package com.example.bhavana.shopping_mall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpHome {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> technology = new ArrayList<String>();
        technology.add("Photo Frames");
        technology.add("Vases");
        technology.add("Gifts");
        technology.add("Statues");

        List<String> entertainment = new ArrayList<String>();
        entertainment.add("Sofas");
        entertainment.add("Lighting");
        entertainment.add("Carpets");
        entertainment.add("T V Cabinets");
        entertainment.add("Tables");



        List<String> science = new ArrayList<String>();
        science.add("Furniture");
        science.add("Crockery");



        List<String> girls = new ArrayList<String>();
        girls.add("Appliances");
        girls.add("Utensils");




        expandableListDetail.put("Artifacts", technology);
        expandableListDetail.put("Living", entertainment);
        expandableListDetail.put("Dining", science);
        expandableListDetail.put("Kitchen",girls);


        return expandableListDetail;
    }
}
