package android.prueba.david.tesis.UniActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.prueba.david.tesis.R;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactoUniActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_uni);

//        ListView lv = (ListView) findViewById(R.id.listViewCosto);
//
//        //Datos a mostrar
//        List<String> names = new ArrayList<String>();
//        names.add("Cuota Administracion 60.000");
//        names.add("Cuota Ing. Comercial 60.000");
//        names.add("Cuota Contaduria 60.000");
//        names.add("Matricula Administracion 250.000");
//        names.add("Matriula Contaduria 250.000");
//        names.add("Matriula Ing. Comercial 300.000");
//        names.add("Derecho de Ex. Administracion P.O. 35.000");
//        names.add("Derecho de Ex. Contaduria P.O. 35.000");
//        names.add("Derecho de Ex. Ing. Comercial P.O. 35.000");
//        names.add("Derecho de Ex. Administracion S.O. 35.000");
//        names.add("Derecho de Ex. Contaduria S.O. 35.000");
//        names.add("Derecho de Ex. Ing. Comercial S.O. 35.000");
//        names.add("Derecho de Ex. Administracion T.O. 35.000");
//        names.add("Derecho de Ex. Contaduria T.O. 35.000");
//        names.add("Derecho de Ex. Ing. Comercial T.O. 35.000");
//
//
//        //Adaptador de la forma visual en que mostraremos nuestro datos
//        adapter = new ArrayAdapter<>(
//                ContactoUniActivity.this,
//                android.R.layout.simple_list_item_1,
//                names);
//        lv.setAdapter(adapter);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
//
//        // Enlasamos el adaptador con nuestro listView
//        listView.setAdapter(adapter);

        //////////////////////////////////////////////////////////////////////
       int permissionCheck = ContextCompat.checkSelfPermission(
                this, Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            Log.i("Mensaje", "No se tiene permiso para realizar llamadas telefónicas.");
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 225);
        } else {
            Log.i("Mensaje", "Se tiene permiso!");
        }


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

       /* final FloatingActionButton floatingActionButtonRec = (FloatingActionButton) findViewById(R.id.floatingActionButtonRec);
        floatingActionButtonRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:071-206990"));
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:071-206990"));
                if(ActivityCompat.checkSelfPermission(ContactoUniActivity.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(intent);
            }
        });

        final FloatingActionButton floatingActionButtonFacea = (FloatingActionButton) findViewById(R.id.floatingActionButtonFacea);
        floatingActionButtonFacea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:071-206990"));
                if(ActivityCompat.checkSelfPermission(ContactoUniActivity.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(intent);
            }
        });


        final FloatingActionButton floatingActionButtonAgro = (FloatingActionButton) findViewById(R.id.floatingActionButtonAgro);
        floatingActionButtonAgro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:071-206990"));
                if(ActivityCompat.checkSelfPermission(ContactoUniActivity.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(intent);
            }
        });*/

      listView = (ListView) findViewById(R.id.listViewContacto);

        List<String> contatos = new ArrayList<String>();

        contatos.add("Rectorado 071-206990");
        contatos.add("Facultad de Ingenieria 071-206990");
        contatos.add("Facultad de Medicina 071-206990");
        contatos.add("Facultad de Ciencias Economicas 071-206990");
        contatos.add("Facultad de Humanidades 071-206990");
        contatos.add("Facultad de Ciencias Juridicas 071-206990");
        contatos.add("Facultad de Ciencias Agropecuarias 071-206990");
        contatos.add("Facultad de Ciencias y Tecnologia 071-206990");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);
        listView.setAdapter(adapter);



    }

    public void miMetodo(View view){
        Toast.makeText(ContactoUniActivity.this, "Pulsa el boton de llamada", Toast.LENGTH_SHORT).show();
    }
}
