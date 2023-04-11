package com.example.bhavana.shopping_mall;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String> {

    private String[] fruitname;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public CustomListView(Activity context,String[] fruitname,Integer[] imgid) {
        super(context,R.layout.listview_layout,fruitname);

        this.context=context;
        this.fruitname=fruitname;
        //this.desc=desc;
        this.imgid=imgid;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null){
            LayoutInflater inflater=context.getLayoutInflater();
            r=inflater.inflate(R.layout.listview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);


        }
        else{

            viewHolder=(ViewHolder)r.getTag();



        }
        viewHolder.ivw.setImageResource(imgid[position]);

        viewHolder.tvw1.setText(fruitname[position]);

        //viewHolder.tvw2.setText(desc[position]);



        return r;
    }

    class ViewHolder{
        TextView tvw1,tvw2;
        ImageView ivw;

        ViewHolder(View v){
            tvw1=(TextView)v.findViewById(R.id.tvfruitname);
            //tvw2=(TextView)v.findViewById(R.id.tvdescription);
            ivw=(ImageView)v.findViewById(R.id.imageView);

        }
    }

}
