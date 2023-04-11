package com.example.bhavana.shopping_mall;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by csa on 3/7/2017.
 */

public class ViewHolderfun extends RecyclerView.Adapter<ViewHolderfun.MyHoder>{

    List<Model> list;
    Context context;

    public ViewHolderfun(List<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        MyHoder myHoder = new MyHoder(view);


        return myHoder;
    }

    @Override
    public void onBindViewHolder(final MyHoder holder, int position) {
        final Model mylist = list.get(position);
         holder.description.setText(mylist.getDescription());
        //holder.image.setText(mylist.getImage());
//        Glide.with(context).load(mylist.getImage()).into(holder.imageload);
//        holder.title.setText(mylist.getTitle());
//
//        holder.cardview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("sdfghj","Intent");
//                Intent i=new Intent(context,redirect.class);
//                i.putExtra("Name",holder.title.toString());
//                i.putExtra("image",mylist.getImage());
//                context.startActivity(i);
//            }
//        });



    }

    @Override
    public int getItemCount() {

        int arr = 0;

        try{
            if(list.size()==0){

                arr = 0;

            }
            else{

                arr=list.size();
            }



        }catch (Exception e){



        }

        return arr;

    }

    class MyHoder extends RecyclerView.ViewHolder{
        TextView description,image,title;

        ImageView imageload;
        CardView cardview;
        public MyHoder(View itemView) {
            super(itemView);
            //cardview=itemView.findViewById(R.id.cardview);
            //description = (TextView) itemView.findViewById(R.id.vname);
            //image= (TextView) itemView.findViewById(R.id.vemail);
            //title= (TextView) itemView.findViewById(R.id.vaddress);
           // title.setText();
            //imageload=itemView.findViewById(R.id.imageload);
        }
    }

}
