package com.example.bhavana.shopping_mall;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;

import java.util.jar.Attributes;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String db_name="StudentDB" ;
    private static final String table_name="student" ;
    private static final String id="ID" ;
    private static final String mv_name="Movie_name" ;
    private static final String show_times="Show_times" ;
    private static final String availability="Available_tickets" ;
    private static final String create_table="CREATE TABLE IF NOT EXISTS student("+mv_name+" VARCHAR, "+show_times+" VARCHAR, "+availability+" VARCHAR)" ;




    public DatabaseHelper(Context context){
        super(context,db_name,null,1);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+db_name);
        onCreate(db);

    }

    public boolean insertData(String name){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(mv_name,name);
        //contentValues.put(show_times,showtimes);
        //contentValues.put(availability,availability);


        long result=db.insert(table_name,null,contentValues);
        return result!=-1;
    }

    public Cursor viewData(){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="SELECT * FROM "+table_name;
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }
    public Cursor addDetails(){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="SELECT * FROM "+table_name;
        Cursor cursor=db.rawQuery(query,null);
        return cursor;


    }
}

