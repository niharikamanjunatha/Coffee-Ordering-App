package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quant1, quant2, quant3 = 0;
    int totalprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quant1);
        quantityTextView.setText("" + number);
    }
    private void display2(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quant2);
        quantityTextView.setText("" + number);
    }
    private void display3(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quant3);
        quantityTextView.setText("" + number);
    }


    public void increment1(View view)
    {
        quant1 = quant1+1;
        display1(quant1);
    }
    public void increment2(View view)
    {
        quant2 = quant2+1;
        display2(quant2);
    }
    public void increment3(View view)
    {
        quant3 = quant3+1;
        display3(quant3);
    }


    public void decrement1(View view)
    {
        if(quant1==0)
            display1(quant1);
        else
        {
            quant1 = quant1-1;
            display1(quant1);
        }
    }
    public void decrement2(View view)
    {
        if(quant2==0)
            display2(quant2);
        else
        {
            quant2 = quant2-1;
            display2(quant2);
        }
    }
    public void decrement3(View view)
    {
        if(quant3==0)
            display3(quant3);
        else
        {
            quant3 = quant3-1;
            display3(quant3);
        }
    }

    public void displaytext(View view)
    {
        TextView totalPrice = (TextView)findViewById(R.id.totalprice);
        if(quant1==0&&quant2==0&&quant3==0)
        {
            totalPrice.setText("Sorry! You haven't ordered anything.");
        }
        else
        {
            totalprice = (116*quant1)+(163*quant2)+(142*quant3);

            totalPrice.setText("Thank you for ordering!\n\n"+"Total Price : Rs. "+totalprice);

        }
    }
}