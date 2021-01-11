package edu.upc.dsa.example.primerejemplodsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textVUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nombre = getIntent().getStringExtra("nombre");
        textVUser.setText("Username"+nombre);
    }


}

