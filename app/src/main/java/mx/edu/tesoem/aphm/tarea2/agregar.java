package mx.edu.tesoem.aphm.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class agregar extends AppCompatActivity {

    Button a, b;
    EditText agr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        agr = (EditText) findViewById(R.id.editText);

        a = (Button) findViewById(R.id.button4);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ag = new Intent(agregar.this, MainActivity.class);
                startActivity(ag);
                finish();
            }
        });

        b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mo = new Intent(agregar.this, Mostrar.class);
                startActivity(mo);
                finish();
            }
        });
}


    public void agregar(View v){
        if(agr.getText().toString().length() < 1) {
            Toast.makeText(this, "Ingrese color.", Toast.LENGTH_SHORT).show();
        }else{
            clases.agregar(agr.getText().toString().toUpperCase());
            Toast.makeText(this, "Color " + agr.getText().toString().toUpperCase() + " se agregó.", Toast.LENGTH_SHORT).show();
            agr.setText("");
        }
    }
}