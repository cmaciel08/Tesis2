package android.prueba.david.tesis.PjudicialActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerPjudicial;
import android.prueba.david.tesis.UniActivity.MapsUniActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.prueba.david.tesis.R;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;

public class Pjudicial2Activity extends AppCompatActivity {

    private DataBaseManagerPjudicial managerPjudicial;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;
    private ImageButton imageButtonPj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjudicial2);



        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerPjudicial= new DataBaseManagerPjudicial(this);
            lista = (ListView) findViewById(R.id.listViewPjudicial2);


        // Datos a ingresar en nuestra tabla de pjudicial
       /* managerPjudicial.insertar("Antecedentes Judiciales", "31.402");
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
        managerPjudicial.insertar("Ventas de Libro-La Ciencia del Derecho Procesal Constitucional-Hector Fix", "30.000");*/
        //managerRec.eliminar("Matricula Lic. Administracion");


        String [] from = new String[] {managerPjudicial.CN_NAME,managerPjudicial.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};
        //simple_list_item_2
        cursor = managerPjudicial.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(Pjudicial2Activity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);


        imageButtonPj = (ImageButton) findViewById(R.id.imageButtonMaps2);
        imageButtonPj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MapsPjuActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_search, menu);
        //MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.menuSearch));


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
