package android.prueba.david.tesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UniActivity extends AppCompatActivity {

    private ListView listView;
    private ImageButton imgButton;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);

        imgButton = (ImageButton) findViewById(R.id.imageButtonMaps);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getApplication(), MapsUniActivity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        ListView lv = (ListView) findViewById(R.id.listViewCosto);

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


        // Adaptador de la forma visul en que mostraremos nuestro datos
        adapter = new ArrayAdapter<>(
                UniActivity.this,
                android.R.layout.simple_list_item_1,
                names);
        lv.setAdapter(adapter);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

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
}

