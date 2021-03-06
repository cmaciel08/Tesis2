package android.prueba.david.tesis.PjudicialActivity;
import android.content.Intent;
import android.database.Cursor;
import android.prueba.david.tesis.BaseDatos.DataBaseManagerPjudicial;
import android.prueba.david.tesis.R;
import android.prueba.david.tesis.UniActivity.MapsUniActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public abstract class PjudicialActivity extends AppCompatActivity  {

    private DataBaseManagerPjudicial managerPjudicial;
    private ListView lista;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;
    private TextView tv;
    private ImageButton bt;
    private ImageButton imageButtonPj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjudicial);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

        managerPjudicial= new DataBaseManagerPjudicial(this);
        lista = (ListView) findViewById(R.id.listViewPjudicial);
        /*tv = (TextView) findViewById(R.id.editBuscar);
        /*bt = (ImageButton) findViewById(R.id.imageButtonBuscar);
        /*bt.setOnClickListener(this);


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
        adapter = new SimpleCursorAdapter(PjudicialActivity.this,android.R.layout.simple_list_item_2, cursor, from,to,0);
        lista.setAdapter(adapter);


        imageButtonPj = (ImageButton) findViewById(R.id.floatingActionButtonPju);
        imageButtonPj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MapsUniActivity.class);
                startActivity(intent);
            }
        });

    }


}
