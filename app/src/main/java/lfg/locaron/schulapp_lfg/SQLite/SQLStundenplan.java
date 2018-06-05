package lfg.locaron.schulapp_lfg.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class SQLStundenplan {

    SQLiteDatabase database;
    SQLHelperStundenplan dbHelper;


    /************ setup ***************/
    public SQLStundenplan(Context context){
        dbHelper = new SQLHelperStundenplan(context);
    }

    public void open(){
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
    }

    /*********** write ************/
    public void write(StundenplanData data){
        ContentValues values = new ContentValues();
        values.put(SQLHelperStundenplan.COLUMN_STUNDE, data.stunde);
        values.put(SQLHelperStundenplan.COLUMN_TAG, data.tag);
        values.put(SQLHelperStundenplan.COLUMN_FACH, data.fach);
        values.put(SQLHelperStundenplan.COLUMN_RAUM, data.raum);

        database.insert(SQLHelperStundenplan.TABLE_STUNDENPLAN, null, values);
    }

    /**************** read *******************/
    public StundenplanData read(int searchStunde, int searchTag){
        Cursor cursor = database.query(SQLHelperStundenplan.TABLE_STUNDENPLAN,null, SQLHelperStundenplan.COLUMN_STUNDE + "=" + searchStunde + "&&" + SQLHelperStundenplan.COLUMN_TAG + "=" + searchTag, null, null, null, null);
        cursor.moveToFirst();

        int idStunde = cursor.getColumnIndex(SQLHelperStundenplan.COLUMN_STUNDE);
        int idTag = cursor.getColumnIndex(SQLHelperStundenplan.COLUMN_TAG);
        int idRaum = cursor.getColumnIndex(SQLHelperStundenplan.COLUMN_RAUM);
        int idFach = cursor.getColumnIndex(SQLHelperStundenplan.COLUMN_FACH);

        //int id = cursor.getInt(idIndex);
        int stunde = cursor.getInt(idStunde);
        int tag = cursor.getInt(idTag);
        String raum = cursor.getString(idRaum);
        int fach = cursor.getInt(idFach);

        cursor.close();
        return new StundenplanData(stunde, tag, raum, fach);
    }

    /************ delete ************/
    public void delete(String table, int searchStunde, int searchTag){
        database.delete(table, SQLHelperStundenplan.COLUMN_STUNDE + "=" + searchStunde + "&&" + SQLHelperStundenplan.COLUMN_TAG + "=" + searchTag, null);
    }

    /************* rewrite *****************/
    public void rewrite(StundenplanData data){
        ContentValues values = new ContentValues();
        values.put(SQLHelperStundenplan.COLUMN_STUNDE, data.stunde);
        values.put(SQLHelperStundenplan.COLUMN_TAG, data.tag);
        values.put(SQLHelperStundenplan.COLUMN_FACH, data.fach);
        values.put(SQLHelperStundenplan.COLUMN_RAUM, data.raum);

        database.update(SQLHelperStundenplan.TABLE_STUNDENPLAN, values,SQLHelperStundenplan.COLUMN_STUNDE + "=" + data.stunde + "&&" + SQLHelperStundenplan.COLUMN_TAG + "=" + data.tag, null);
    }



}
