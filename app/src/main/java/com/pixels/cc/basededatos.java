package com.pixels.cc;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class basededatos extends SQLiteOpenHelper {
    private static final String NOMBRE_BD="basededatosM";
    private static final int VERSION_BD=1;
    private static final String TABLA_MATERIAS="CREATE TABLE MATERIAS(MATERIA TEXT PRIMARY KEY, CREDITO TEXT, PRIMERC TEXT, SEGUNDOC TEXT, TERCERC TEXT, PROMEDIO TEXT)";

    public basededatos(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(TABLA_MATERIAS);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_MATERIAS);
        sqLiteDatabase.execSQL(TABLA_MATERIAS);
    }
    public void agregarM(String materias ,String credito,String primerc,String segundoc,String tercerc,String promedio){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null)
        {
            bd.execSQL("INSERT INTO MATERIAS VALUES('"+materias+"','"+credito+"','"+primerc+"','"+segundoc+"','"+tercerc+"','"+promedio+"')");
            bd.close();
        }
    }

    public List<promm> obtenermete(){
        SQLiteDatabase bd=getReadableDatabase();
        Cursor cursor=bd.rawQuery("SELECT * FROM MATERIAS",null);
        List<promm> materr=new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                materr.add(new promm(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5)));


            }while(cursor.moveToNext());
        }
        return materr;

    }
public void buscardatos(promm datos,String materia){
        SQLiteDatabase bd=getReadableDatabase();
        Cursor cursor=bd.rawQuery("SELECT * FROM MATERIAS WHERE MATERIA='"+materia+"'",null);
       
        if(cursor.moveToFirst()){
            do{
                datos.setPromedio(cursor.getString(1));
                datos.setPrimer(cursor.getString(2));
                datos.setSegundo(cursor.getString(3));
                datos.setTercer(cursor.getString(4));
                datos.setPromet(cursor.getString(5));
                


            }while(cursor.moveToNext());
        }
       

    }
    
public void primerNot(String materias ,String credito,String primerc,String segundoc,String tercerc,String promedio){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null)
        {
            bd.execSQL("UPDATE MATERIAS SET CREDITO='"+credito+"',PRIMERC='"+primerc+"',SEGUNDOC='"+segundoc+"',TERCERC='"+tercerc+"',PROMEDIO='"+promedio+"' WHERE MATERIA='"+materias+"'");
            bd.close();
        } 
    }
public void elimiN(String materias){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null)
        {
            bd.execSQL("DELETE FROM MATERIAS WHERE MATERIA='"+materias+"'");
            bd.close();
        } 
    }


}
