package android.prueba.david.tesis.UniActivity;

import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerAgro;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class AgronomiaActivity extends AppCompatActivity {
    private DataBaseManagerAgro managerAgro;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agronomia);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);


        managerAgro = new DataBaseManagerAgro(this);
        lista= (ListView) findViewById(R.id.listViewAgronomia);

        // Datos a ingresar en nuestra tabla de agropecuaria
       /* managerAgro.insertar("Legalizacion de Certificado", "30.000");
        managerAgro.insertar ("Registro de Titulo de Posgrado", "20.000");
        managerAgro.insertar("Registro de Titulo de Grado", "15.000");
        managerAgro.insertar("Expedicion de Titulo de Grado", "225.000");
        managerAgro.insertar("Expedicion de Titulo de Posgrado", "300.000");*/
        //managerRec.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerAgro.CN_NAME,managerAgro.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerAgro.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(AgronomiaActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);
    }
}
