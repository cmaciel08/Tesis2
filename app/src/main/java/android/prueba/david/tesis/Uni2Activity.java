package android.prueba.david.tesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class Uni2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni2);


       Button btn2 = (Button) findViewById(R.id.buttonInge);
       Button btn3 = (Button) findViewById(R.id.buttonMed);
       Button btn4 = (Button) findViewById(R.id.buttonFacea);
       Button btn5 = (Button) findViewById(R.id.buttonHuma);
       Button btn6 = (Button) findViewById(R.id.buttonDer);
       Button btn8 = (Button) findViewById(R.id.buttonTecno);



        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),UniActivity.class);
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

    }

}


