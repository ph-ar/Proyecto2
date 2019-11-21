package mx.edu.tesoem.aphm.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ag,mr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            ag = (Button) findViewById(R.id.button);
            ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,agregar.class);
                startActivity(a);
                finish();
            }
        });

        mr = (Button) findViewById(R.id.button2);
        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, Mostrar.class);
                startActivity(m);
                finish();
            }
        });

    }
}
