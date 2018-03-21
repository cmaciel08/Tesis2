package android.prueba.david.tesis.UniActivity;

import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerTecno;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class TecnologiaActivity extends AppCompatActivity {

    private DataBaseManagerTecno managerTecno;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnologia);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);


        managerTecno = new DataBaseManagerTecno(this);
        lista= (ListView) findViewById(R.id.listViewTecnologia);

        //Insertar datos en la Tabla de tecnologia
/*        managerTecno.insertar("Matricula de Ing. en Alimentos", "300.000");
        managerTecno.insertar ("Matricula de Lic. en Informatica Empresarial", "300.000");
        managerTecno.insertar("Cuota Ing. en Alimentos", "100.000");
        managerTecno.insertar("Cuota Informatica Empresarial", "100.000");
        managerTecno.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerTecno.insertar("Derecho Examen P. Oportunidad", "35.000");
        managerTecno.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerTecno.insertar("Derecho Examen T. Oportunidad", "45.000");
        managerTecno.insertar("Matricula de Ing. en Alimentos", "300.000");
        managerTecno.insertar ("Matricula de Lic. en Informatica Empresarial", "300.000");
        managerTecno.insertar("Cuota Ing. en Alimentos", "100.000");
        managerTecno.insertar("Cuota Informatica Empresarial", "100.000");
        managerTecno.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerTecno.insertar("Derecho Examen P. Oportunidad", "35.000");
        managerTecno.insertar("Derecho Examen S. Oportunidad", "40.000");
        managerTecno.insertar("Derecho Examen T. Oportunidad", "45.000");*/
        //managerTecno.eliminar("Matricula Lic. Administracion");




        String [] from = new String[] {managerTecno.CN_NAME,managerTecno.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerTecno.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(TecnologiaActivity.this,android.R.layout.simple_expandable_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);
    }
}
