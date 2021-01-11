package edu.upc.dsa.example.primerejemplodsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find editText
        mEditText = (EditText) findViewById(R.id.editText);

    }

    public void btnClick(android.view.View v){
        String theString = mEditText.getText().toString();
        Intent intent = new Intent( MainActivity.this, MainActivity2.class);
        intent.putExtra("nombre", theString);
        startActivity(intent);
    }
}