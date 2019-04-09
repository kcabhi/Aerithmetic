package com.example.aerithmetic;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ET1,ET2;
    Button BT1,BT2;
AlertDialog.Builder builder;
    int first,second,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET1=findViewById(R.id.ET1);
        ET2=findViewById(R.id.ET2);
        BT1=findViewById(R.id.BT1);
        BT2 =findViewById(R.id.BT2);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(ET1.getText().toString());
                second=Integer.parseInt(ET2.getText().toString());

                sum=first+second;

                Toast t = Toast.makeText(MainActivity.this, "Sum is = "+ sum, Toast.LENGTH_LONG);
                 t.show();

            }
        });

        builder = new AlertDialog.Builder(this);

        BT2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
builder.setMessage("Are you sure ?")
.setCancelable(false)
        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
        .setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });



            }
        });




    }



}
