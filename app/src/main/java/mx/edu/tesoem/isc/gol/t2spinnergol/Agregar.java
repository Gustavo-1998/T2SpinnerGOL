package mx.edu.tesoem.isc.gol.t2spinnergol;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Agregar extends AppCompatActivity implements View.OnClickListener {
    Button btn2, btn3;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        et1 = (EditText) findViewById(R.id.color);

        btn2 = (Button) findViewById(R.id.muestra);
        btn3 = (Button) findViewById(R.id.regresa);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    public void addColor(View v){
        if(et1.getText().toString().length() < 1) {
            Toast.makeText(this, "Ingrese un color valido.", Toast.LENGTH_SHORT).show();
        }else{
            GlobalClass.addColor(et1.getText().toString().toUpperCase());
            Toast.makeText(this, "Color " + et1.getText().toString().toUpperCase() + " agregado.", Toast.LENGTH_SHORT).show();
            et1.setText("");
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btn2.getId()) {
            Intent mostrar = new Intent(this, Mostrar.class);
            startActivity(mostrar);
            finish();
        }
        if (v.getId() == btn3.getId()) {
            Intent regresar = new Intent(this, Menu.class);
            startActivity(regresar);
            finish();
        }
    }
}
