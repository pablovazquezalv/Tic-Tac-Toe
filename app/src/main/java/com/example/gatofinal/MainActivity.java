package com.example.gatofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno = 0, x = 0, o = 0;
    int contador;
    Button C1,C2,C3,C4,C5,C6,C7,C8,C9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view)
    {
        Button b = (Button) view;
        //CONTADOR
        contador++;
        turno = contador % 2;
        if (turno == 1) {
            b.setText("X");
            b.setTextColor(Color.BLACK);
            b.setEnabled(false);
        }
        {
            b.setText("0");
            b.setTextColor(Color.BLUE);
            b.setEnabled(false);

        }

    }

    public void verificaGanador(boolean campeon){
        boolean champ = false;
        if (C1.getText() == "X" && C2.getText() == "X" && C3.getText() == "X")
        {
          champ=true;
        }
        else if (C1.getText() == "X" && C5.getText() == "X" && C9.getText() == "X")
        {
            champ=true;
        }
        else if (C1.getText() == "X" && C4.getText() == "X" && C7.getText() == "X")
        {
            champ=true;
        }
        else if (C3.getText() == "X" && C5.getText() == "X" && C7.getText() == "X")
        {
            champ=true;
        }
        else if (C2.getText() == "X" && C5.getText() == "X" && C8.getText() == "X")
        {
            champ=true;
        }
        else if (C1.getText() == "O" && C2.getText() == "O" && C3.getText() == "O")
        {
            champ=true;
        }
        else if (C1.getText() == "O" && C5.getText() == "O" && C9.getText() == "O")
        {
            champ=true;
        }
        else if (C1.getText() == "O" && C4.getText() == "O" && C7.getText() == "O")
        {
            champ=true;
        }
        else if (C3.getText() == "O" && C5.getText() == "O" && C7.getText() == "O")
        {
            champ=true;
        }
        else if (C2.getText() == "O" && C5.getText() == "O" && C8.getText() == "O")
        {
            champ=true;
        }else {
            champ=false;
        }


    }
}
}