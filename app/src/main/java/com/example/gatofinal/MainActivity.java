package com.example.gatofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Integer turno=0,c=0;

    TextView ganador;
    Button C1,C2,C3,C4,C5,C6,C7,C8,C9,REINICIAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ganador= (TextView) findViewById(R.id.V1);
        C1=(Button) findViewById(R.id.C1);
        C2=(Button) findViewById(R.id.C2);
        C3=(Button) findViewById(R.id.C3);
        C4=(Button) findViewById(R.id.C4);
        C5=(Button) findViewById(R.id.C5);
        C6=(Button) findViewById(R.id.C6);
        C7=(Button) findViewById(R.id.C7);
        C8=(Button) findViewById(R.id.C8);
        C9=(Button) findViewById(R.id.C9);


        C1.setOnClickListener(this);
        C2.setOnClickListener(this);
        C3.setOnClickListener(this);
        C4.setOnClickListener(this);
        C5.setOnClickListener(this);
        C6.setOnClickListener(this);
        C7.setOnClickListener(this);
        C8.setOnClickListener(this);
        C9.setOnClickListener(this);
        REINICIAR.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;

        c++;
        turno = c % 2;
        if (turno == 1) {
            b.setText("X");
            b.setTextColor(android.R.color.darker_gray);
            b.setEnabled(false);
            verificaGanador();
        } else {
            b.setText("O");
            b.setTextColor(android.R.color.darker_gray);
            b.setEnabled(false);
            verificaGanador();


        }




    }



    public void verificaGanador(){


        if (C1.getText() == "X" && C2.getText() == "X" && C3.getText() == "X")
        {
        ganador.setText("el ganador es: X");
            inabilitar();
            reinicio();
        }
        else if (C1.getText() == "X" && C5.getText() == "X" && C9.getText() == "X")
        {
            ganador.setText("el ganador es: X");
            inabilitar();
            reinicio();
        }
        else if (C1.getText() == "X" && C4.getText() == "X" && C7.getText() == "X")
        {
            ganador.setText("el ganador es: X");
            inabilitar();
            reinicio();
        }
        else if (C3.getText() == "X" && C5.getText() == "X" && C7.getText() == "X")
        {
            ganador.setText("el ganador es: X");
            inabilitar();
            reinicio();
        }
        else if (C2.getText() == "X" && C5.getText() == "X" && C8.getText() == "X")
        {
            ganador.setText("el ganador es: X");
            inabilitar();
            reinicio();
        }
        else if (C1.getText() == "O" && C2.getText() == "O" && C3.getText() == "O")
        {
            ganador.setText("el ganador es: 0");
            inabilitar();
            reinicio();
        }
        else if (C1.getText() == "O" && C5.getText() == "O" && C9.getText() == "O")
        {
            ganador.setText("el ganador es: 0");
            reinicio();
        }
        else if (C1.getText() == "O" && C4.getText() == "O" && C7.getText() == "O")
        {
            ganador.setText("el ganador es: 0");
            inabilitar();
            reinicio();
        }
        else if (C3.getText() == "O" && C5.getText() == "O" && C7.getText() == "O")
        {
            ganador.setText("el ganador es: 0");
            inabilitar();
            reinicio();
        }
        else if (C2.getText() == "O" && C5.getText() == "O" && C8.getText() == "O")
        {
            ganador.setText("el ganador es: 0");
            inabilitar();
            reinicio();
        }else {
            ganador.setText("el ganador : NADIE GANO");
            reinicio();
        }


    }


    public void reinicio() {
        C1.setEnabled(true);
        C1.setText("");
        C2.setEnabled(true);
        C2.setText("");
        C3.setEnabled(true);
        C3.setText("");
        C4.setEnabled(true);
        C4.setText("");
        C5.setEnabled(true);
        C5.setText("");
        C6.setEnabled(true);
        C6.setText("");
        C7.setEnabled(true);
        C7.setText("");
        C8.setEnabled(true);
        C8.setText("");
        C9.setEnabled(true);
        C9.setText("");


    }

    public void inabilitar() {
        C1.setEnabled(false);
        C2.setEnabled(false);
        C3.setEnabled(false);
        C4.setEnabled(false);
        C5.setEnabled(false);
        C6.setEnabled(false);
        C7.setEnabled(false);
        C8.setEnabled(false);
        C9.setEnabled(false);
    }
}
