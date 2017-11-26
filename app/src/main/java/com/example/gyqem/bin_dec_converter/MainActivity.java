package com.example.gyqem.bin_dec_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String bin = "";

    public TextView output;
    public TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.answer);
        output2 = (TextView)findViewById(R.id.display);

        final Button button0 = (Button)findViewById(R.id.button0);
        final Button button1 =(Button)findViewById(R.id.button1);
        final Button convert = (Button)findViewById(R.id.convert);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bin += "0";
                output2.setText(bin);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bin += "1";
                output2.setText(bin);
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int binary = Integer.parseInt(bin);

                int dec = 0;
                int power = 0;

                while (true){
                    if (binary == 0) break;
                    else{
                        int temp = binary%10;
                        dec += temp*Math.pow(2,power);
                        binary = binary/10;
                        power++;
                    }
                }
                output.setText(Integer.toString(dec));
                bin = "";
                output2.setText("");
            }
        });

    }
}
