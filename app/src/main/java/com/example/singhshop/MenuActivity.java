package com.example.singhshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    private Button button_checkout;
private int ChocolateCount = 0;
    private int StawberryCount = 0;
    private int VanillaCount = 0;

    Button Chocolate;
Button Decreasing;
TextView text_chocolate;

Button stawberry_inc;
Button stawberry_dec;
TextView text_stawberry;

Button vanilla_inc;
Button vanilla_dec;
TextView text_Vanilla;

//for checkoiut activity
    float Total;
     float ChocolatePrice;
    float StawberryPrice;
    float VanillaPrice;
float grandTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button_checkout = (Button) findViewById(R.id.button_checkout);

        Chocolate = (Button) findViewById(R.id.Chocolate_Adding);
        text_chocolate = (TextView) findViewById(R.id.chocolate_textView);
        Decreasing = (Button) findViewById(R.id.chocolate_decreasing);


        // for stawberry

        stawberry_inc = (Button) findViewById(R.id.stawberry_Adding);
        stawberry_dec = (Button) findViewById(R.id.stawberry_decreasing);
        text_stawberry = (TextView) findViewById(R.id.stawberry_textView);


        //for vanilla

        vanilla_inc = (Button) findViewById(R.id.vanilla_Adding);
        vanilla_dec = (Button) findViewById(R.id.vanilla_decreasing);
        text_Vanilla = (TextView) findViewById(R.id.vanilla_textView);






        Chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocolateCount++;
                text_chocolate.setText(Integer.toString(ChocolateCount));
                ChocolatePrice = (float)(ChocolateCount*5.99);
            }
        });
        Decreasing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ChocolateCount>0)
                    ChocolateCount--;
                text_chocolate.setText(Integer.toString(ChocolateCount));
                ChocolatePrice = (float)(ChocolateCount*5.99);
            }
        });

        // for stawberry

        stawberry_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StawberryCount++;
                text_stawberry.setText(Integer.toString(StawberryCount));
                StawberryPrice = (float)(StawberryCount*8.99);

            }
        });

        stawberry_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(StawberryCount>0)
                StawberryCount--;
                text_stawberry.setText(Integer.toString(StawberryCount));
                StawberryPrice = (float)(StawberryCount*8.99);

            }
        });

        // for vanilla

        vanilla_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VanillaCount++;
                text_Vanilla.setText(Integer.toString(VanillaCount));
                VanillaPrice = (float) (VanillaCount*9.99);

            }
        });

vanilla_dec.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(VanillaCount>0)
        VanillaCount--;
        text_Vanilla.setText(Integer.toString(VanillaCount));
        VanillaPrice = (float)(VanillaCount*9.99);

    }
});
button_checkout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Total = StawberryPrice + ChocolatePrice + VanillaPrice;
        grandTotal = (float)Total;
        Intent intent = new Intent(MenuActivity.this , CheckoutActivity.class);
        intent.putExtra("value",Total);
        startActivity(intent);
   finish();
    }
});




    }
    public void openCheckoutActivity(){
        Intent intent  = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }
}
