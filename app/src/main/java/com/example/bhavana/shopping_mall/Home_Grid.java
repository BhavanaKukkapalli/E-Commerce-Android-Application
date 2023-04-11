package com.example.bhavana.shopping_mall;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home_Grid extends AppCompatActivity{

    private String[] names={"FoodCourt","Lifestyle","Electronics","Sales","FunZone","BoxOffice","Mall Layout","Home"};
    private Integer[] mThumbIds = {R.drawable.food,R.drawable.lifestyle,R.drawable.electronics,R.drawable.sales,R.drawable.fun,
            R.drawable.box,R.drawable.layout,R.drawable.homecentre};
    ImageButton funzone,boxoffice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__grid);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new MyAdapter(this));
        gridview.setNumColumns(2);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i =new Intent(getApplicationContext(),funzone.class);
                i.putExtra("name",names[position]);
                i.putExtra("image",mThumbIds[position]);
                startActivity(i);

            }
        });
//        stats.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =new Intent(Home_Grid.this,StatsIntent.class);
//                startActivity(i);
//            }
//        });
        //funzone=(ImageButton)findViewById(R.drawable.dice5);
    }

    public class MyAdapter extends BaseAdapter {

        private Context mContext;

        public MyAdapter(Context c) {
            mContext = c;
        }

        @Override
        public int getCount() {
            return mThumbIds.length;
        }


        @Override
        public Object getItem(int arg0) {
            return mThumbIds[arg0];
        }

        @Override
        public long getItemId(int arg0) {
            return arg0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view1=getLayoutInflater().inflate(R.layout.activity_funzone,null);

            TextView name=view1.findViewById(R.id.griddata);
            ImageView image=view1.findViewById(R.id.imageview);

            name.setText(names[position]);
            image.setImageResource(mThumbIds[position]);



            /*if(convertView==null){
                grid = new View(mContext);
                LayoutInflater inflater=getLayoutInflater();
                grid=inflater.inflate(R.layout.my_grid, parent, false);
            }else{
                grid = (View)convertView;
            }

            ImageView imageView = (ImageView)grid.findViewById(R.id.image);
            imageView.setImageResource(mThumbIds[position]);

            return grid;*/
            return view1;
        }

    }

}
