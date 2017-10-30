package android.prueba.david.tesis.UniActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.prueba.david.tesis.R;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactoUniActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_uni);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        final FloatingActionButton floatingActionButtonRec = (FloatingActionButton) findViewById(R.id.floatingActionButtonRec);
        floatingActionButtonRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
        });

      /*  listView = (ListView) findViewById(R.id.ListViewContactos);

        List<String> contatos = new ArrayList<String>();
        contatos.add("Rectorado 071-206990");
        contatos.add("Facultad de Ciencias Economicas 071-206990");
        contatos.add("Facultad de Ingenieria 071-206990");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);
        listView.setAdapter(adapter);*/



    }

    public void miMetodo(View view){
        Toast.makeText(ContactoUniActivity.this, "Pulsa el boton de llamada", Toast.LENGTH_SHORT).show();
    }
}
