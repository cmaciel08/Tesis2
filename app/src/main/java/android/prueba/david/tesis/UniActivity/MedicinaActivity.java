package android.prueba.david.tesis.UniActivity;

import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerMed;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MedicinaActivity extends AppCompatActivity {

    private DataBaseManagerMed managerMed;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerMed = new DataBaseManagerMed(this);
        lista= (ListView) findViewById(R.id.listViewMedicina);


        managerMed.insertar("Matricula Derecho", "300.000");
        managerMed.insertar ("Matricula Escribania", "300.000");
        managerMed.insertar("Cuota Derecho", "100.000");
        managerMed.insertar("Cuota Escribania", "100.000");
        managerMed.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerMed.insertar("Derecho Examen P. Oportunidad", "35.000");
        managerMed.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerMed.insertar("Derecho Examen T. Oportunidad", "45.000");
        managerMed.insertar("Matricula Derecho", "300.000");
        managerMed.insertar ("Matricula Escribania", "300.000");
        managerMed.insertar("Cuota Derecho", "100.000");
        managerMed.insertar("Cuota Escribania", "100.000");
        managerMed.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerMed.insertar("Derecho Examen P. Oportunidad", "35.000");
        managerMed.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerMed.insertar("Derecho Examen T. Oportunidad", "45.000");
        //managerMed.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerMed.CN_NAME,managerMed.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerMed.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(MedicinaActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);

    }
}
