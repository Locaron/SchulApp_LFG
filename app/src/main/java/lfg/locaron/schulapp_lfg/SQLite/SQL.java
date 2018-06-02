package lfg.locaron.schulapp_lfg.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class SQL {

    SQLiteDatabase database;
    SQLHelper dbHelper;


    /************ setup ***************/
    public SQL(Context context){
        dbHelper = new SQLHelper(context);
    }

    public void open(){
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
    }

    /*********** write ************/
    public void write(SQLData data){
        ContentValues values = new ContentValues();
        values.put(SQLHelper.COLUMN_ID, data.id);

        values.put(SQLHelper.COLUMN_MUENDLICH, data.listToString(data.muendlich));
        values.put(SQLHelper.COLUMN_SCHRIFTLICH, data.listToString(data.schriftlich));

        database.insert(SQLHelper.TABLE_NOTEN, null, values);
    }

    /**************** read *******************/
    public SQLData read(int searchID){
        Cursor cursor = database.query(SQLHelper.TABLE_NOTEN,null, SQLHelper.COLUMN_ID + "=" + searchID, null, null, null, null);
        cursor.moveToFirst();

        int idIndex = cursor.getColumnIndex(SQLHelper.COLUMN_ID);
        int idMuendlich = cursor.getColumnIndex(SQLHelper.COLUMN_MUENDLICH);
        int idSchriftlich = cursor.getColumnIndex(SQLHelper.COLUMN_SCHRIFTLICH);

        int id = cursor.getInt(idIndex);
        String muendlich = cursor.getString(idMuendlich);
        String schriftlich = cursor.getString(idSchriftlich);


        cursor.close();
        return new SQLData(schriftlich, muendlich, id);
    }




}
