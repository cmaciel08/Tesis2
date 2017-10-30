package android.prueba.david.tesis.UniActivity;

import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerHuma;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class HumanidadesActivity extends AppCompatActivity {

    private DataBaseManagerHuma managerHuma;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanidades);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);


        managerHuma = new DataBaseManagerHuma(this);
        lista= (ListView) findViewById(R.id.listViewHumanidades);

        // Datos a ingresar en nuestra tabla de humanidades

        /*managerHuma.insertar("Legalizacion de Certificado", "30.000");
        managerHuma.insertar("Registro de Titulo de Posgrado", "20.000");
        managerHuma.insertar("Registro de Titulo de Grado", "15.000");
        managerHuma.insertar("Expedicion de Titulo de Grado", "225.000");
        managerHuma.insertar("Expedicion de Titulo de Posgrado", "300.000");*/
        //managerHuma.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerHuma.CN_NAME,managerHuma.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerHuma.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(HumanidadesActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);

    }
}
