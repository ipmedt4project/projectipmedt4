package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Webpage extends Activity {


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		
// A model is being fetched from the existing database		
		DatabaseModels db = new DatabaseModels(savedInstanceState, this);
		db.db.getModel(1);
		
// A textview is created with the text from the database in it		
		TextView text = (TextView) findViewById(R.id.textView1);
		text.setText(db.db.getModel(1).getModeltext());
		
	}
	// Hieronder wordt gedefinieerd wat er gebeurd als er een knop ingedrukt wordt.
	//De knop start een nieuwe intent op en sluit de oude intent daarmee af
	public void onClick1(View view) {
		
		Intent i = new Intent(Webpage.this, Amazon.class);
		startActivity(i);

		finish();
		
	}
	
	public void onClick2(View view){
		
		Intent i = new Intent(Webpage.this, Bolcom.class);
		startActivity(i);
		finish();
	}
	//Onderstaande code is de code voor de knoppen om terug te keren naar de homepage	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
	{
        if ((keyCode == KeyEvent.KEYCODE_BACK)) 
        {
            onBackPressed();
            System.out.println("Back pressed");
        }
       
		return true;
	}
	@Override
    public void onBackPressed()
	{
		Intent i = new Intent(Webpage.this, HomeScreen.class);
		startActivity(i);
		finish();
       
    }
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	        	
	        	//System.out.println("UP Pressed");
	        	
	        	Intent i = new Intent(Webpage.this, HomeScreen.class);
	        	startActivity(i);
	        	
	        	finish();
	        	
	            return(true);
	    }

	    return(super.onOptionsItemSelected(item));
	}
}
