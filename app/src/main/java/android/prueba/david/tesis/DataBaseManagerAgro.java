package android.prueba.david.tesis;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by david on 28/10/2017.
 */

public class DataBaseManagerAgro {
    public static  final String TABLE_NAME = "agropecuaria";

    public static final String CN_ID = "_id";
    public static final String CN_NAME = "arancel";
    public static final String CN_MONTO = "monto";


    public static final String CREATE_TABLE = "create table " +TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_MONTO + " text not null);";

    private DbHelper helper;
    private SQLiteDatabase db;

    public DataBaseManagerAgro(Context context) {

        helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    private ContentValues generarContentValues(String arancel, String monto){
        ContentValues valores = new ContentValues();
        valores.put(CN_NAME, arancel);
        valores.put(CN_MONTO, monto);

        return valores;
    }
    public void insertar(String arancel, String monto){
        ContentValues valores = new ContentValues();
        valores.put(CN_NAME, arancel);
        valores.put(CN_MONTO, monto);

        db.insert(TABLE_NAME,null,generarContentValues(arancel, monto));
    }

    public void  eliminar (String monto) {
        db.delete(TABLE_NAME,CN_NAME+"=?",new String[]{monto});
    }

    public void modificarArancel(String arancel, String nuevoMonto) {
        db.update(TABLE_NAME, generarContentValues(arancel, nuevoMonto),CN_NAME+"=?",new String[]{arancel});
    }

    public Cursor cargarCursorArancel() {
        String[] columnas = new String[] {CN_ID, CN_NAME, CN_MONTO};
        return db.query(TABLE_NAME,columnas,null,null,null,null,null);
    }

    public Cursor buscarContacto(String arancel) {
        String[] columnas = new String[] {CN_ID, CN_NAME, CN_MONTO};
        return db.query(TABLE_NAME,columnas,CN_NAME + "=?",new String[]{arancel},null,null,null);
    }
}
