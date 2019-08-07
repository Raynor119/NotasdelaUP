package com.pixels.cc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class cantidm extends SQLiteOpenHelper {
	

	private static final String NOMBRE_BD="NdM";
    private static final int VERSION_BD=1;
    private static final String TABLA_MATERIA="CREATE TABLE CATIDAD(CANTIDAD TEXT PRIMARY KEY,CATI TEXT)";

    public cantidm(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);


    }
	
	@Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(TABLA_MATERIA);
    }
	
	@Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_MATERIA);
        sqLiteDatabase.execSQL(TABLA_MATERIA);
    }
	public void agregarM(String materias,String num){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null)
        {
            bd.execSQL("INSERT INTO CATIDAD VALUES('"+materias+"','"+num+"')");
            bd.close();
        }
    }
	
	public void buscadatos(capmm datos,String materia){
        SQLiteDatabase bd=getReadableDatabase();
        Cursor cursor=bd.rawQuery("SELECT * FROM CATIDAD WHERE CANTIDAD='"+materia+"'",null);

        if(cursor.moveToFirst()){
            do{
                datos.setNum(cursor.getString(1));
          



            }while(cursor.moveToNext());
        }


    }
	
	
	public void prot(String materias ,String Num){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null)
        {
            bd.execSQL("UPDATE CATIDAD SET CATI='"+Num+"' WHERE CANTIDAD='"+materias+"'");
            bd.close();
        } 
    }
}
