package android.prueba.david.tesis.UniActivity;

import android.content.Intent;
import android.prueba.david.tesis.R;
import android.prueba.david.tesis.UniActivity.AgronomiaActivity;
import android.prueba.david.tesis.UniActivity.ContactoUniActivity;
import android.prueba.david.tesis.UniActivity.DerechoActivity;
import android.prueba.david.tesis.UniActivity.FaceaActivity;
import android.prueba.david.tesis.UniActivity.HumanidadesActivity;
import android.prueba.david.tesis.UniActivity.IngenieriaActivity;
import android.prueba.david.tesis.UniActivity.MedicinaActivity;
import android.prueba.david.tesis.UniActivity.RectoradoActivity;
import android.prueba.david.tesis.UniActivity.TecnologiaActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Uni2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);


       Button btn2 = (Button) findViewById(R.id.buttonInge);
       Button btn3 = (Button) findViewById(R.id.buttonMed);
       Button btn4 = (Button) findViewById(R.id.buttonFacea);
       Button btn5 = (Button) findViewById(R.id.buttonHuma);
       Button btn6 = (Button) findViewById(R.id.buttonDer);
       Button btn8 = (Button) findViewById(R.id.buttonTecno);
       Button btn1 = (Button) findViewById(R.id.buttonRec);
       Button btn7 = (Button) findViewById(R.id.buttonAgro);
       ImageButton btn9 = (ImageButton) findViewById(R.id.imageButtonContacto);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ContactoUniActivity.class);
                startActivity(intent);
            }
        });


        ImageButton btn10 = (ImageButton) findViewById(R.id.imageButtonInfo);

        btn10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), InfoUniActivity.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),FaceaActivity.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DerechoActivity.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),RectoradoActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), IngenieriaActivity.class);
                startActivity(intent);
            }
        });
         btn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(view.getContext(), MedicinaActivity.class);
                 startActivity(intent);
             }
         });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HumanidadesActivity.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AgronomiaActivity.class);
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TecnologiaActivity.class);
                startActivity(intent);
            }
        });


    }


}


