package com.example.bhavana.shopping_mall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpFood {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> technology = new ArrayList<String>();
        technology.add("North Indian");
        technology.add("South Indian");
        technology.add("Pizzeria");
        technology.add("Desserts");
//        technology.add("Accessories");

        List<String> entertainment = new ArrayList<String>();
        entertainment.add("North Indian");
        entertainment.add("South Indian");
        entertainment.add("Pizzeria");
        entertainment.add("Desserts");
//        entertainment.add("Nightwear & LoungeWear");
//        entertainment.add("Accessories");
//        entertainment.add("Jewellery");



        expandableListDetail.put("Veg", technology);
        expandableListDetail.put("Non_Veg", entertainment);
        //expandableListDetail.put("Desserts", science);
        //expandableListDetail.put("Snacks",girls);

        return expandableListDetail;
    }
}
