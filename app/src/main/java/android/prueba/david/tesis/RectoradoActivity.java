package android.prueba.david.tesis;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class RectoradoActivity extends AppCompatActivity {

    private DataBaseManagerRec managerRec;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectorado);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerRec = new DataBaseManagerRec(this);
        lista= (ListView) findViewById(R.id.listViewRectorado);

        // Datos a ingresar en nuestra tabla de rectorado

       /* managerRec.insertar("Legalizacion de Certificado", "30.000");
        managerRec.insertar ("Registro de Titulo de Posgrado", "20.000");
        managerRec.insertar("Registro de Titulo de Grado", "15.000");
        managerRec.insertar("Expedicion de Titulo de Grado", "225.000");
        managerRec.insertar("Expedicion de Titulo de Posgrado", "300.000");*/
        //managerRec.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerRec.CN_NAME,managerRec.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerRec.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(RectoradoActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);
    }
}
