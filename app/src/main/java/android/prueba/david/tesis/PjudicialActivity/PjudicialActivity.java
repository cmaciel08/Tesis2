package android.prueba.david.tesis.PjudicialActivity;

import android.prueba.david.tesis.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PjudicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjudicial);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);



    }
}
