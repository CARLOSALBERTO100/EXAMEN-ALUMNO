package itics.carlos.examen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    TextView lblresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        txtnum1 = (EditText) findViewById(R.id.txtval1);
        txtnum2 = (EditText) findViewById(R.id.txtval2);
        lblresultado = (TextView) findViewById(R.id.lblresultado);
    }

    public void pcalcular(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        lblresultado.setText(String.valueOf(num1-num2));
    }
}
