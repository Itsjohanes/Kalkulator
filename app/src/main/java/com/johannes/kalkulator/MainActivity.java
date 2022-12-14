package com.johannes.kalkulator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

Button buttonTambah,buttonKurang,buttonKali;
EditText angka1;
EditText angka2;


    @Override
    //saat pertama kali
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTambah = (Button) findViewById(R.id.button);
        buttonKurang = (Button) findViewById(R.id.button2);
        buttonKali  = (Button) findViewById(R.id.button3);
        angka1 = (EditText) findViewById(R.id.txt1);
        angka2 = (EditText) findViewById(R.id.txt2);
       buttonTambah.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(!angka1.equals("") && !angka2.equals("")){
                    int a = Tambah();
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Hasil " + a).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            angka1.setText("");
                            angka2.setText("");
                        }
                    });
                    AlertDialog dialog = builder.create();
                        dialog.show();
                }

            }
        });
        buttonKurang.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(!angka1.equals("") && !angka2.equals("")){
                    int a = Kurang();
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Hasil " + a).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            angka1.setText("");
                            angka2.setText("");
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }

            }
        });
        buttonKali.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(!angka1.equals("") && !angka2.equals("")){
                    int a = Kali();
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Hasil " + a).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            angka1.setText("");
                            angka2.setText("");
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }

            }
        });

    }



    private int Tambah(){
        int angka11 = Integer.parseInt(angka1.getText().toString());
        int angka22 = Integer.parseInt(angka2.getText().toString());
        int angka3 = angka11 + angka22;
        return angka3;
    }
    private int Kurang(){
        int angka11 = Integer.parseInt(angka1.getText().toString());
        int angka22 = Integer.parseInt(angka2.getText().toString());
        int angka3 = angka11 - angka22;
        return angka3;
    }
    private int Kali(){
        int angka11 = Integer.parseInt(angka1.getText().toString());
        int angka22 = Integer.parseInt(angka2.getText().toString());
        int angka3 = angka11 * angka22;
        return angka3;
    }
    private int Bagi(){
        int angka11 = Integer.parseInt(angka1.getText().toString());
        int angka22 = Integer.parseInt(angka2.getText().toString());
        int angka3 = angka11 / angka22;
        return angka3;
    }


}