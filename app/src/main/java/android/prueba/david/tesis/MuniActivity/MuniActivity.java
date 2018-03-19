package android.prueba.david.tesis.MuniActivity;

import android.content.Intent;
import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerMuni;
import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MuniActivity extends AppCompatActivity {

    private DataBaseManagerMuni managerMuni;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;
    private ImageButton imageButtonMu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);


        managerMuni= new DataBaseManagerMuni(this);
        lista = (ListView) findViewById(R.id.listViewMuni);


        // Datos a ingresar en nuestra tabla de pjudicial
       /* managerMuni.insertar("Pantente fija anual-Surtidor de combustible liquido, nafta, Gas Oill, Fuell Oil, Kerosen, Alcohol y otros (Grifo por unidad)", "70.000");
        managerMuni.insertar("Pantente fija anual-Surtidor de combustible liquido, nafta, Gas Oill, Fuell Oil, Kerosen, Alcohol y otros (Servicio de lavado y engrase)", "70.000");
        managerMuni.insertar("Pantente fija anual-Surtidor de combustible liquido, nafta, Gas Oill, Fuell Oil, Kerosen, Alcohol y otros (Servicio de Gomeria)", "60.000");
        managerMuni.insertar("Patente fija anual-Escritorios de Sociedades constituidas con fines de lucro", "210.000");
        managerMuni.insertar("Patente fija anual-Escritorios de Sociedades de Responsabilidad Limitada", "210.000");
        managerMuni.insertar("Patente fija anual-Sociedades Anonimas", "210.000");
        managerMuni.insertar("Patente fija anual-Escritorios de Importaciones", "195.500");
        managerMuni.insertar("Patente fija anual-Escritorios de Despachante de Aduanas y/o Agente de Transporte", "195.500");
        managerMuni.insertar("Patente fija anual-Escritorios de Gestorias y Asesorias", "195.500");
        managerMuni.insertar("Patente fija anual-Escritorios de otras Sociedades", "195.500");
        managerMuni.insertar("Patente fija anual-Escritorios de Exportaciones", "210.000");
        managerMuni.insertar("Patente fija anual-Escritorios de Comicionistas", "210.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de helados, confituras, chipas y productos afines", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de revistas, libros e impresos general", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de mercaderias general en carros", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes en vehiculo automotor, de leche y productos lacteos", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de plantas", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de comestibles en general", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de bebidas alcoholicas y gaseosas en general", "120.000");
        managerMuni.insertar("Patente Comercial anual-Vendedores Ambulantes de mosto", "120.000");*/
        //managerRec.eliminar("Matricula Lic. Administracion");


        String [] from = new String[] {managerMuni.CN_NAME,managerMuni.CN_MONTO};
        int [] to = new int[] {android.R.id.text1,android.R.id.text2};

        //simple_list_item_2
        cursor = managerMuni.cargarCursorArancel();
        adapter = new SimpleCursorAdapter(MuniActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);


        imageButtonMu = (ImageButton) findViewById(R.id.imageButtonMaps3);
        imageButtonMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MapsMuniActivity.class);
                startActivity(intent);
            }
        });

    }
}
