package mx.edu.tesoem.aphm.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Mostrar extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

        Spinner objSpinner;
        ArrayAdapter<String> listColors0;
        boolean flag = false;
        Button re;



@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        objSpinner = findViewById(R.id.spinner);
        listColors0 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, clases.mostrar());
        objSpinner.setAdapter(listColors0);
        objSpinner.setOnItemSelectedListener(this);

        re = (Button) findViewById(R.id.button6);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent r = new Intent(Mostrar.this,MainActivity.class);
               startActivity(r);
               finish();
            }
        });
        }

@Override
public void onItemSelected(AdapterView<?> parent, View v, int pos, long id){
        if(!flag){
        flag = true;
        return;
        }
        Toast.makeText(this, "Ha seleccionado " + parent.getItemAtPosition(pos).toString(),Toast.LENGTH_SHORT).show();
        }

@Override
public void onNothingSelected(AdapterView<?> arg0){}

public void backMain(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
        finish();
        }


        }
