package android.prueba.david.tesis.UniActivity;

import android.content.Intent;
import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManager;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class FaceaActivity extends AppCompatActivity {

    //private ListView listView;
    private ImageButton imgButton;
    //private ArrayAdapter<String> adapter;
    private DataBaseManager manager;
    private Cursor cursor;
    private ListView lista;
    private SimpleCursorAdapter adapter;
    //private TextView tv;
    //private ImageButton bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facea);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);


        manager = new DataBaseManager(this);
        lista = (ListView) findViewById(R.id.listViewUniversidad);
       /* tv = (TextView) findViewById(R.id.editTextBuscarUNI);
        bt = (ImageButton) findViewById(R.id.imageButtonBuscarUni);

        bt.setOnClickListener(this);*/

       manager.insertar("Matricula Ingenieria Comercial", "250000 ");
        manager.insertar ("Matricula Contaduria Publica", "250000 ");
        manager.insertar("Matricula Lic. Administracion", "250.000");
        manager.insertar("Cuota Lic. Administracion", "60.000");
        manager.insertar("Cuota Lic. Ingenieria COmercial", "60.000");
        manager.insertar("Cuota Contaduria Publica", "60.000");
        manager.insertar("Derecho Examen P. Oportunidad", "35.000");
        manager.insertar("Derecho Examen S. Oportunidad", "40.000");
        manager.insertar("Derecho Examen T. Oportunidad", "45.000");
        manager.insertar("Derecho Examen S. Oportunidad", "40.000");
        manager.insertar("Conval. por Materia p/ Univ. Privada", "100.000");
        manager.insertar("Conval. por Materia p/ Univ. Publica", "50.000");
        //manager.eliminar("Matricula Lic. Administracion");


        String [] from = new String[] {manager.CN_NAME,manager.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = manager.cargarCursorArancel();
        adapter = new SimpleCursorAdapter (FaceaActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);



        imgButton = (ImageButton) findViewById(R.id.imageButtonMaps);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getApplication(), MapsUniActivity.class);
                startActivity(intent);
            }
        });


       /* ListView lv = (ListView) findViewById(R.id.listViewCosto);

        //Datos a mostrar
        List<String> names = new ArrayList<String>();
        names.add("Cuota Administracion 60.000");
        names.add("Cuota Ing. Comercial 60.000");
        names.add("Cuota Contaduria 60.000");
        names.add("Matricula Administracion 250.000");
        names.add("Matriula Contaduria 250.000");
        names.add("Matriula Ing. Comercial 300.000");
        names.add("Derecho de Ex. Administracion P.O. 35.000");
        names.add("Derecho de Ex. Contaduria P.O. 35.000");
        names.add("Derecho de Ex. Ing. Comercial P.O. 35.000");
        names.add("Derecho de Ex. Administracion S.O. 35.000");
        names.add("Derecho de Ex. Contaduria S.O. 35.000");
        names.add("Derecho de Ex. Ing. Comercial S.O. 35.000");
        names.add("Derecho de Ex. Administracion T.O. 35.000");
        names.add("Derecho de Ex. Contaduria T.O. 35.000");
        names.add("Derecho de Ex. Ing. Comercial T.O. 35.000");


        // Adaptador de la forma visual en que mostraremos nuestro datos
        adapter = new ArrayAdapter<>(
                FaceaActivity.this,
                android.R.layout.simple_list_item_1,
                names);
        lv.setAdapter(adapter);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);*/

        // Enlasamos el adaptador con nuestro listView
        //listView.setAdapter(adapter);

    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.menu_search, menu);
       MenuItem item = menu.findItem(R.id.menuSearch);
       SearchView searchView = (SearchView) item.getActionView();

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

  /*  @Override
    public void onClick(View v) {
        if (v.getId()== R.id.imageButtonBuscarUni) {

            Cursor c =manager.buscarContacto(tv.getText().toString());
            adapter.changeCursor(c);

        }


    }*/
}

