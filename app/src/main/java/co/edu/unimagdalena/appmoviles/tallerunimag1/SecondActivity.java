package co.edu.unimagdalena.appmoviles.tallerunimag1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2;
    Button sumar,resta,multiplicacion,division,mcm,mcd,mayor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        sumar = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);
        multiplicacion = findViewById(R.id.btnmultiplicar);
        division = findViewById(R.id.btndivision);
        mcm = findViewById(R.id.btnmcm);
        mcd = findViewById(R.id.btnmcd);
        mayor = findViewById(R.id.btnmayor);

        sumar.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
        mcm.setOnClickListener(this);
        mcd.setOnClickListener(this);
        mayor.setOnClickListener(this);
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

            case R.id.btnmultiplicar:

                Toast.makeText(this,"Multiplicacion: "+(a*b),Toast.LENGTH_LONG).show();
                break;

            case R.id.btndivision:

                if(b == 0) {

                    Toast.makeText(this,"el numero 2 no puede ser 0",Toast.LENGTH_LONG).show();

                }else {

                    float c = a;
                    float d = b;
                    Toast.makeText(this, "division: " + (c / d), Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.btnmcd:

                while( a != b)

                    if( a > b)
                        a = a - b;
                    else {
                        b = b - a;
                    }
                    Toast.makeText(this,"El mcd es: "+a,Toast.LENGTH_LONG).show();
                //“El MCD es:” +num1);

                break;


            case R.id.btnmcm:

                int mcm = 0, men, i;
                // Seleccionamos el menor entre num1 y num2
                men = Math.min(a, b);
                for (i=1; i<=men; i++) {
                    // Comprobamos si el número i correspondiente a la
                    // iteración es un divisor exacto de num1 y num2
                    if (a % i == 0 && b % i == 0) {
                        // Asignamos i como el mcd
                        int mcd = i;
                        // Calculamos el mcm de forma similar a como
                        // se calcula usando el Algoritmo de Euclides
                        mcm = (a * b)/mcd;
                    }
                }

                Toast.makeText(this,"El mcm es: "+mcm,Toast.LENGTH_LONG).show();

                break;


            case R.id.btnmayor:

                if(a > b){
                    Toast.makeText(this,"el Mayor es: "+a,Toast.LENGTH_LONG).show();
                }else if( a == b){
                    Toast.makeText(this,"son iguales ",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"el Mayor es: "+b,Toast.LENGTH_LONG).show();
                }

                break;


        }

    }
}