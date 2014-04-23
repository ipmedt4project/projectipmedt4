package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

public class Sustainability extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_sustainability);
		}

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
			Intent i = new Intent(Sustainability.this, HomeScreen.class);
			startActivity(i);
			finish();
	       
	    }
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		    switch (item.getItemId()) {
		        case android.R.id.home:
		        	
		        	//System.out.println("UP Pressed");
		        	
		        	Intent i = new Intent(Sustainability.this, HomeScreen.class);
		        	startActivity(i);
		        	
		        	finish();
		        	
		            return(true);
		    }

		    return(super.onOptionsItemSelected(item));
		}
		
		public void onClickmod1(View view)
		{
			Intent i = new Intent(Sustainability.this, SustainabilityMod1.class);
			startActivity(i);
			
			finish();
		}
		
		public void onClickmod8(View view)
		{
			Intent i = new Intent(Sustainability.this, SustainabilityMod2.class);
			startActivity(i);
			
			finish();
		}

}