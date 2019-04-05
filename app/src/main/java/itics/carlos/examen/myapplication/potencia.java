package itics.carlos.examen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class potencia extends AppCompatActivity {

    EditText txtnum1;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        txtnum1 = (EditText) findViewById(R.id.txtval1);
        lblresultado = (TextView) findViewById(R.id.lblresultado);
    }
    public void pcalcular(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());


        lblresultado.setText(String.valueOf(num1*num1));
    }
}
