package android.prueba.david.tesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IngenieriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingenieria);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);
    }
}
