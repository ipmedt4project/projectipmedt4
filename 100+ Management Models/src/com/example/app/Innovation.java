package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

public class Innovation extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_innovation);
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
			Intent i = new Intent(Innovation.this, HomeScreen.class);
			startActivity(i);
			finish();
	       
	    }
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		    switch (item.getItemId()) {
		        case android.R.id.home:
		        	
		        	//System.out.println("UP Pressed");
		        	
		        	Intent i = new Intent(Innovation.this, HomeScreen.class);
		        	startActivity(i);
		        	
		        	finish();
		        	
		            return(true);
		    }

		    return(super.onOptionsItemSelected(item));
		}
		// Hieronder wordt gedefinieerd wat er gebeurd als er een knop ingedrukt wordt.
		//De knop start een nieuwe intent op en sluit de oude intent daarmee af		
		public void onClickmod3(View view)
		{
			Intent i = new Intent(Innovation.this, InnovationMod3.class);
			startActivity(i);
			
			finish();
		}
		
		public void onClickmod4(View view)
		{
			Intent i = new Intent(Innovation.this, InnovationMod4.class);
			startActivity(i);
			
			finish();
		}
}
