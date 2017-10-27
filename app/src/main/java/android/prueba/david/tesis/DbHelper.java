package android.prueba.david.tesis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by david on 11/10/2017.
 */

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "universidad_II.sqlite";
    private static final int DB_SCHEME_VERSION = 3;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DataBaseManagerDer.CREATE_TABLE);
        db.execSQL(DataBaseManager.CREATE_TABLE);
        db.execSQL(DataBaseManagerRec.CREATE_TABLE);

        //db.execSQL("create table derecho(_id integer primary key autoincrement,arancel text,monto text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
