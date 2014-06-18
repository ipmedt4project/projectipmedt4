package com.example.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
	}
	
	
// Als er op de video knop gedrukt wordt wordt er een externe browser geopened en daarin de youtube video afgespeeld 	

public void videoView(View view){
	
	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hKWyqYjzijA")));

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
	Intent i = new Intent(About.this, HomeScreen.class);
	startActivity(i);
	finish();
   
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home:
        	
        	//System.out.println("UP Pressed");
        	
        	Intent i = new Intent(About.this, HomeScreen.class);
        	startActivity(i);
        	
        	finish();
        	
            return(true);
    }

    return(super.onOptionsItemSelected(item));
}

}


