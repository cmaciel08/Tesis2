package android.prueba.david.tesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HumanidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanidades);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_desktop);

    }
}
