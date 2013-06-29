package com.example.iskipper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Christian on 18.06.13.
 * Klasse zur Verwaltung der Datenbank
 */
public class Dbworks extends SQLiteOpenHelper {

    private SQLiteDatabase db;
    String dbnam__e;

    //Kostruktur
    public Dbworks(Context activity, String dbName){
        super(activity, dbName, null, 1);
    db = getWritableDatabase();
    };

    public void onCreate(SQLiteDatabase db){
        try{
            String sql = "CREATE TABLE waypoints (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "datum DATE, 'uhrzeit' TIME, " +
                    "pointx INTEGER(10) NOT NULL, pointy INTEGER(10) NOT NULL, name VARCHAR(20))";
            db.execSQL(sql);
        }
        catch(Exception ex){
            Log.e("carpelibrum", ex.getMessage());

    };

    public void createTable(String tablename){

    };

}


public DBZugriff extends SQLiteOpenHelper {

private SQLiteDatabase db;


}
        catch(Exception ex) {
        Log.e("carpelibrum", ex.getMessage());
}
        }

public void onUpgrade(SQLiteDatabase db, int oldVersion,
        int newVersion) {
// auf Versionswechsel reagieren
        }
        }