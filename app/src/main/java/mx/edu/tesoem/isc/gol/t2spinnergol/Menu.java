package mx.edu.tesoem.isc.gol.t2spinnergol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1=(Button) findViewById(R.id.agrega);
        btn2=(Button) findViewById(R.id.mostrar);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==btn1.getId()) {
            Intent agregar = new Intent(this, Agregar.class);
            startActivity(agregar);
            finish();
        }
        if (v.getId()==btn2.getId()) {
            Intent mostrar = new Intent(this, Mostrar.class);
            startActivity(mostrar);
            finish();
        }
    }
}
