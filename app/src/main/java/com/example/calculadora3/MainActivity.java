package com.example.calculadora3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn7;
    Button btn8;
    Button btn9;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn0;
    Button btnpoint;
    Button btnpercent;
    Button btnover;
    Button btntimes;
    Button btnplus;
    Button btnminus;
    Button btnclear;
    Button btnequal;
    TextView pantalla;
    Double operador1;
    Double operador2;
    Double resultado;
    Integer operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn0 = findViewById(R.id.button0);
        btnpoint = findViewById(R.id.buttonpoint);
        btnpercent = findViewById(R.id.buttonpercent);
        btnover = findViewById(R.id.buttonover);
        btntimes = findViewById(R.id.buttontimes);
        btnplus = findViewById(R.id.buttonplus);
        btnminus = findViewById(R.id.buttonminus);
        btnclear = findViewById(R.id.buttonclear);
        btnequal = findViewById(R.id.buttonequal);
        pantalla = findViewById(R.id.pantalla);
        operador1 = 0.0;
        operador2 = 0.0;
        resultado = 0.0;
        operacion = 0;

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"9");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"6");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"3");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText()+"0");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countPoint(pantalla.getText().toString())>=1)
                    pantalla.setText(pantalla.getText());
                else
                    pantalla.setText(pantalla.getText()+".");
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    operador1 = Double.parseDouble(pantalla.getText().toString());
                }catch (NumberFormatException er){
                    operador1 = 0.0;
                }
                operacion = 5;
                pantalla.setText("");
            }
        });
        btnover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    operador1 = Double.parseDouble(pantalla.getText().toString());
                }catch (NumberFormatException er){
                    operador1 = 0.0;
                }
                operacion = 4;
                pantalla.setText("");
            }
        });
        btntimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    operador1 = Double.parseDouble(pantalla.getText().toString());
                }catch (NumberFormatException er){
                    operador1 = 0.0;
                }
                operacion = 3;
                pantalla.setText("");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    operador1 = Double.parseDouble(pantalla.getText().toString());
                }catch (NumberFormatException er){
                    operador1 = 0.0;
                }
                operacion = 1;
                pantalla.setText("");
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    operador1 = Double.parseDouble(pantalla.getText().toString());
                }catch (NumberFormatException er){
                    operador1 = 0.0;
                }
                operacion = 2;
                pantalla.setText("");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pantalla.setText("=");
                if (pantalla.getText().toString() == ""){
                    operador2 = 0.0;
                }else {
                    operador2 = Double.parseDouble(pantalla.getText().toString());
                }

                if (operacion == 1){
                    resultado = operador1+operador2;
                    pantalla.setText(resultado.toString());
                }
                else if (operacion == 2){
                    resultado = operador1-operador2;
                    pantalla.setText(resultado.toString());
                }
                else if (operacion == 3){
                    resultado = operador1*operador2;
                    pantalla.setText(resultado.toString());
                }
                else if (operacion == 4){
                    resultado = operador1/operador2;
                    pantalla.setText(resultado.toString());
                }
                else if (operacion == 5){
                    resultado = (operador1*operador2)/100;
                    pantalla.setText(resultado.toString());
                }
            }
        });
    }

    public Integer countPoint(String s){

        char[] Arraycadena;
        Arraycadena = s.toCharArray();

        Integer counter = 0;

        for (Integer i = 0; i<Arraycadena.length;i++){
            if (Arraycadena[i]=='.')
                counter++;
        }

        return counter;
    }
}
