package com.com.saranya.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName(); //for logging debug
      //declar mFactBook or instantiate from ht FactBook class which is a datatype here
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //declare our View variables and assign values
        // TextView,Button are a datatype

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLaout);

        //listener is variable object
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            //Called when a view has been clicked
            public void onClick(View v) {
                //mFactBook is an object
                String fact = mFactBook.getFact();
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);
        //Context context = getApplicationContext();

       // Toast.makeText(this, "Hello toast!", Toast.LENGTH_LONG).show();
        Log.d(TAG,"We are logging from onCreate method!.");


    }
}
