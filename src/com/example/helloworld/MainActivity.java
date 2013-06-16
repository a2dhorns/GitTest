package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	
	int counter; //variables type int
	Button add, minus;
	TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        counter = 0;
        
        add = (Button) findViewById(R.id.bAdd);
        minus = (Button) findViewById(R.id.bMinus);
        display = (TextView) findViewById(R.id.tvDisplay);
        
        add.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
			
				counter++;
				display.setText("Your total is " + counter);
			}
		});
        
        minus.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
				counter--;
				display.setText("Your total is " + counter);
			}
		});
    }

    
}
