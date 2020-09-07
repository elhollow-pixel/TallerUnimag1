package co.edu.unimagdalena.appmoviles.tallerunimag1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2;
    Button sumar,resta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        sumar = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);

        sumar.setOnClickListener(this);
        resta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int a = Integer.parseInt(n1.getText().toString());
        int b = Integer.parseInt(n2.getText().toString());

        switch (view.getId()){

            case R.id.btnsumar:

                Toast.makeText(this,"Suma: "+(a+b),Toast.LENGTH_LONG).show();
                break;

            case R.id.btnrestar:

                Toast.makeText(this,"resta: "+(a-b),Toast.LENGTH_LONG).show();
                break;

        }
    }
}