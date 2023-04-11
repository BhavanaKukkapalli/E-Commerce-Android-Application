package com.example.bhavana.shopping_mall;

import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatsIntent extends AppCompatActivity {
    int intentvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_intent);
        PieChart pieChart = findViewById(R.id.piechart);
        ArrayList NoOfEmp = new ArrayList();



            NoOfEmp.add(new PieEntry(545f, 0));
            NoOfEmp.add(new PieEntry(186f, 1));
            NoOfEmp.add(new PieEntry( 89f, 2));
            NoOfEmp.add(new PieEntry(1040f, 3));
            NoOfEmp.add(new PieEntry(1869f, 4));
            NoOfEmp.add(new PieEntry(987f, 5));
            NoOfEmp.add(new PieEntry(645f, 6));
            PieDataSet dataSet = new PieDataSet(NoOfEmp, "Number Of Employees");

            ArrayList year = new ArrayList();

            year.add("Cisco");
            year.add("Microsoft");
            year.add("Google");
            year.add("Musigma");
            year.add("Wipro");
            year.add("Oracle");
            year.add("TCS Digital");
            PieData data = new PieData(dataSet);
            pieChart.setData(data);
            dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
            pieChart.animateXY(5000, 5000);

        }

    }