package android.prueba.david.tesis.UniActivity;

import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerDer;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class DerechoActivity extends AppCompatActivity {

    private DataBaseManagerDer managerDer;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerDer = new DataBaseManagerDer(this);
        lista= (ListView) findViewById(R.id.listViewDerecho);


        /*managerDer.insertar("Matricula Derecho", "300.000");
        managerDer.insertar ("Matricula Escribania", "300.000");
        managerDer.insertar("Cuota Derecho", "100.000");
        managerDer.insertar("Cuota Escribania", "100.000");
        managerDer.insertar("Derecho Examen P. Oportunidad", "35.000");
        managerDer.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerDer.insertar("Derecho Examen T. Oportunidad", "45.000");
        managerDer.insertar("Derecho Examen S. Oportunidad", "40.000");*/
        //managerDer.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerDer.CN_NAME,managerDer.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerDer.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(DerechoActivity.this,android.R.layout.simple_expandable_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);

    }

}
