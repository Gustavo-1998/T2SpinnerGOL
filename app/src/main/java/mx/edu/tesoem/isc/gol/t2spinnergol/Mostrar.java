package mx.edu.tesoem.isc.gol.t2spinnergol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Mostrar extends AppCompatActivity implements View.OnClickListener {

    Button btn1;

    List<String> ListaColores;
    String[]strColores;
    Spinner objSpinner;
    ArrayAdapter<String> listColores;
    boolean flag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        btn1 = (Button) findViewById(R.id.reg2);
        btn1.setOnClickListener(this);

        objSpinner = findViewById(R.id.coloreslista);
        listColores = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,GlobalClass.showColors());
        objSpinner.setAdapter(listColores);
    }

    @Override
    public void onClick(View v) {
        Intent pantalla1= new Intent(this,Menu.class);
        startActivity(pantalla1);
        finish();
    }


    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id){
        if(!flag){
            flag = true;
            return;
        }
        Toast.makeText(this, "Ha seleccionado " + parent.getItemAtPosition(pos).toString(),Toast.LENGTH_SHORT).show();
    }
}
