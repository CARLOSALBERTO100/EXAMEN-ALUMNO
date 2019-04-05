package itics.carlos.examen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }

    public void suma(View view) {
        Intent intent = new Intent(this, suma.class);
        startActivity(intent);
    }

    public void resta(View view) {
        Intent intent = new Intent(this, resta.class);
        startActivity(intent);
    }

    public void potencia(View view) {
        Intent intent = new Intent(this, potencia.class);
        startActivity(intent);
    }

    public void salir(View view) {
        Intent intent = new Intent(this, salida.class);
        startActivity(intent);
    }
}
