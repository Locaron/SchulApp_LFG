package lfg.locaron.schulapp_lfg.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

import java.util.Date;
import java.util.List;

public class SQLNoten {

    SQLiteDatabase database;
    SQLHelperNoten dbHelper;


    /************ setup ***************/
    public SQLNoten(Context context){
        dbHelper = new SQLHelperNoten(context);
    }

    public void open(){
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
    }

    /*********** write ************/
    public void write(NotenData data){
        ContentValues values = new ContentValues();
        values.put(SQLHelperNoten.COLUMN_ID, data.id);

        values.put(SQLHelperNoten.COLUMN_MUENDLICH, data.listToString(data.muendlich));
        values.put(SQLHelperNoten.COLUMN_SCHRIFTLICH, data.listToString(data.schriftlich));

        database.insert(SQLHelperNoten.TABLE_NOTEN, null, values);
    }

    public void writeMuendlich(List<Integer> muendlich, int id){
        ContentValues values = new ContentValues();
        values.put(SQLHelperNoten.COLUMN_ID, id);
        NotenData data = new NotenData("blub");
        values.put(SQLHelperNoten.COLUMN_MUENDLICH, data.listToString(muendlich));
        values.put(SQLHelperNoten.COLUMN_SCHRIFTLICH, " ");
        database.insert(SQLHelperNoten.TABLE_NOTEN, null, values);
    }

    public void writeSchriftlich(List<Integer> schriftlich, int id){
        ContentValues values = new ContentValues();
        values.put(SQLHelperNoten.COLUMN_ID, id);
        NotenData data = new NotenData("blub");
        values.put(SQLHelperNoten.COLUMN_SCHRIFTLICH, data.listToString(schriftlich));
        values.put(SQLHelperNoten.COLUMN_MUENDLICH, " ");
        database.insert(SQLHelperNoten.TABLE_NOTEN, null, values);
    }
    /**************** read *******************/
    public NotenData read(int searchID){
        Cursor cursor = database.query(SQLHelperNoten.TABLE_NOTEN,null, SQLHelperNoten.COLUMN_ID + "=" + searchID, null, null, null, null);
        cursor.moveToFirst();

        int idIndex = cursor.getColumnIndex(SQLHelperNoten.COLUMN_ID);
        int idMuendlich = cursor.getColumnIndex(SQLHelperNoten.COLUMN_MUENDLICH);
        int idSchriftlich = cursor.getColumnIndex(SQLHelperNoten.COLUMN_SCHRIFTLICH);

        int id = cursor.getInt(idIndex);
        String muendlich = cursor.getString(idMuendlich);
        String schriftlich = cursor.getString(idSchriftlich);

        cursor.close();
        return new NotenData(schriftlich, muendlich, id);
    }

    /************ delete ************/
    public void delete(int id){
        database.delete(SQLHelperNoten.TABLE_NOTEN, SQLHelperNoten.COLUMN_ID + "=" + id, null);
    }

    /************* rewrite *****************/
    public void rewrite(NotenData data){
        ContentValues values = new ContentValues();
        values.put(SQLHelperNoten.COLUMN_ID, data.id);

        values.put(SQLHelperNoten.COLUMN_MUENDLICH, data.listToString(data.muendlich));
        values.put(SQLHelperNoten.COLUMN_SCHRIFTLICH, data.listToString(data.schriftlich));

        database.update(SQLHelperNoten.TABLE_NOTEN, values, SQLHelperNoten.COLUMN_ID + "=" + data.id, null);
    }



}
