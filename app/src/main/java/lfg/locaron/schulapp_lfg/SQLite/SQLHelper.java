package lfg.locaron.schulapp_lfg.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//Diese Klasse erstellt die Datenbank

public class SQLHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "newf";
    public static final String TABLE_NOTEN = "noten";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_MUENDLICH = "muendlich";
    public static final String COLUMN_SCHRIFTLICH = "schriftlich";

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_NOTEN +                            //table name
                    "(" + COLUMN_ID + " INTEGER PRIMARY KEY, " +       //column (school subject), primary key
                    COLUMN_MUENDLICH + " TEXT, " +                     //column
                    COLUMN_SCHRIFTLICH + " TEXT);";                    //column


    public SQLHelper(Context context) {
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
