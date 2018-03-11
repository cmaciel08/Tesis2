package android.prueba.david.tesis.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.prueba.david.tesis.BaseDatos.DataBaseManager;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerAgro;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerDer;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerHuma;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerInge;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerMed;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerRec;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerTecno;

/**
 * Created by david on 11/10/2017.
 */

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "universidad_IV.sqlite";
    private static final int DB_SCHEME_VERSION = 4;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DataBaseManagerDer.CREATE_TABLE);
        db.execSQL(DataBaseManager.CREATE_TABLE);
        db.execSQL(DataBaseManagerRec.CREATE_TABLE);
        db.execSQL(DataBaseManagerAgro.CREATE_TABLE);
        db.execSQL(DataBaseManagerInge.CREATE_TABLE);
        db.execSQL(DataBaseManagerHuma.CREATE_TABLE);
        db.execSQL(DataBaseManagerMed.CREATE_TABLE);
        db.execSQL(DataBaseManagerTecno.CREATE_TABLE);
        db.execSQL(DataBaseManagerPjudicial.CREATE_TABLE);


        //db.execSQL("create table derecho(_id integer primary key autoincrement,arancel text,monto text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
