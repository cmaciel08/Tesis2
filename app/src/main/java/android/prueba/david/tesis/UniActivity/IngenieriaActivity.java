package android.prueba.david.tesis.UniActivity;

import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerInge;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class IngenieriaActivity extends AppCompatActivity {

    private DataBaseManagerInge managerInge;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingenieria);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerInge = new DataBaseManagerInge(this);
        lista= (ListView) findViewById(R.id.listViewIngenieria);

        // Datos a ingresar en nuestra tabla de ingenieria

       /*managerInge.insertar("Legalizacion de Certificado", "30.000");
        managerInge.insertar ("Registro de Titulo de Posgrado", "20.000");
        managerInge.insertar("Registro de Titulo de Grado", "15.000");
        managerInge.insertar("Expedicion de Titulo de Grado", "225.000");
        managerInge.insertar("Expedicion de Titulo de Posgrado", "300.000");*/
        //managerInge.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerInge.CN_NAME,managerInge.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerInge.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(IngenieriaActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);
    }
}
