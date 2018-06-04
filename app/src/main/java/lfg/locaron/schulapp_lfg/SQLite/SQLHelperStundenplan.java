package lfg.locaron.schulapp_lfg.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLHelperStundenplan extends SQLiteOpenHelper {

    public static final String DB_NAME = "db_stundenplan";
    public static final String TABLE_STUNDENPLAN = "stundenplan";

    public static final String COLUMN_STUNDE = "stunde";
    public static final String COLUMN_TAG = "tag";
    public static final String COLUMN_FACH = "fach";
    public static final String COLUMN_RAUM = "raum";

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_STUNDENPLAN +
                    "(" + COLUMN_STUNDE + " INTEGER, " +
                    COLUMN_TAG + " INTEGER, " +
                    COLUMN_FACH + "INTEGER, " +
                    COLUMN_RAUM + " INTEGER);";


    public SQLHelperStundenplan(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        try {
            db.execSQL(SQL_CREATE);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV){

    }

}
