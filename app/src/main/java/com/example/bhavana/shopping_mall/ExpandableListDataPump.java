package com.example.bhavana.shopping_mall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> technology = new ArrayList<String>();
        technology.add("Clothing");
        technology.add("Ethnic Wear");
        technology.add("Footwear");
        technology.add("Innerwear & Nightwear");
        technology.add("Accessories");

        List<String> entertainment = new ArrayList<String>();
        entertainment.add("Clothing");
        entertainment.add("Ethnic Wear");
        entertainment.add("Footwear");
        entertainment.add("Lingerie");
        entertainment.add("Nightwear & LoungeWear");
        entertainment.add("Accessories");
        entertainment.add("Jewellery");

        List<String> science = new ArrayList<String>();
        science.add("Clothing");
        science.add("Ethnic Wear");
        science.add("Footwear");
        science.add("Kids Essentials");
        science.add("Accessories");
        science.add("Toys & Games");
        science.add("Innerwear & NightWear");
        science.add("Jewellery");

        List<String> girls = new ArrayList<String>();
        girls.add("Clothing");
        girls.add("Ethnic Wear");
        girls.add("Footwear");
        girls.add("Kids Essentials");
        girls.add("Accessories");
        girls.add("Toys & Games");
        girls.add("Innerwear & NightWear");
        girls.add("Jewellery");

        List<String> kids = new ArrayList<String>();
        kids.add("Baby care");
        kids.add("Soft Toys");
        kids.add("Kids Accessories");
        kids.add("Travel");
        kids.add("Dolls & Dollhouses");

        expandableListDetail.put("MEN", technology);
        expandableListDetail.put("WOMEN", entertainment);
        expandableListDetail.put("BOYS", science);
        expandableListDetail.put("GIRLS",girls);
        expandableListDetail.put("KIDS", kids);

        return expandableListDetail;
    }
}
