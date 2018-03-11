package android.prueba.david.tesis.PjudicialActivity;

import android.database.Cursor;
import android.prueba.david.tesis.PjudicialActivity.PjudicialActivity;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerPjudicial;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class PjudicialActivity extends AppCompatActivity {

    private DataBaseManagerPjudicial managerPjudicial;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjudicial);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerPjudicial= new DataBaseManagerPjudicial(this);
        lista = (ListView) findViewById(R.id.listViewPjudicial);


        // Datos a ingresar en nuestra tabla de pjudicial
        managerPjudicial.insertar("Antecedentes Judiciales", "31.402");
        managerPjudicial.insertar ("Renovacion de matricula de auxiliares de justicia", "78.505");
        managerPjudicial.insertar("Rubricas de Formularios Continuos", "70.655");
        managerPjudicial.insertar("Rubricas de Libros", "70.655");
        managerPjudicial.insertar("Matriculacion de Motocicletas", "39.253");
        managerPjudicial.insertar("Matriculacion de Vehiculos", "78.505");
        managerPjudicial.insertar("Duplicacion de Marca y senal de ganado", "23.552");
        managerPjudicial.insertar("Informe-Marcas y Senales de Ganado", "23.552");
        managerPjudicial.insertar("Marcas y Senales-Inscripcion", "23.552");
        managerPjudicial.insertar("Reinscripcion de Marcas y Senales", "23.552");
        managerPjudicial.insertar("Legalizaciones", "31.402");
        managerPjudicial.insertar("Ventas de Libro-La Ciencia del Derecho Procesal Constitucional-Hector Fix", "30.000");
        //managerRec.eliminar("Matricula Lic. Administracion");


        String [] from = new String[] {managerPjudicial.CN_NAME,managerPjudicial.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerPjudicial.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(PjudicialActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);
    }
}
