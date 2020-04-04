package com.example.singhshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class CheckoutActivity extends AppCompatActivity {

    float previous;
    TextView price_textView;
float afterTax;
TextView tax;

TextView tvq;
float tax_tvq;
TextView tsp;
float tax_tsp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

price_textView = (TextView)findViewById(R.id.textView_price);

tvq = (TextView)findViewById(R.id.tvq_tax);
tsp = (TextView)findViewById(R.id.tps_tax);



   previous = getIntent().getExtras().getFloat("value");
   price_textView.setText(Float.toString(previous));

   //tvq
        tax_tvq = (float) (0.10*previous);
        tvq.setText(Float.toString(tax_tvq));


        //tsp
        tax_tsp = (float)(0.05*previous);
       tsp.setText(Float.toString(tax_tsp));

   // for tax
        tax = (TextView) findViewById(R.id.tax_TextView);
        afterTax = (float)(previous + (0.15*previous));
   tax.setText(Float.toString(afterTax));

    }
}
