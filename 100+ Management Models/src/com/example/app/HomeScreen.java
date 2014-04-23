package com.example.app;

import android.app.Activity; 
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreen extends Activity {

	
	private DatabaseModels dbmodels;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		dbmodels = new DatabaseModels(savedInstanceState, this);
		
	}


	
		public void onClick1 (View view)  
		{  
			Intent i = new Intent(HomeScreen.this, Sustainability.class);
			startActivity(i);

			finish();
			
		}
            
		public void onClick2 (View view)
		{ 
			Intent i = new Intent(HomeScreen.this, Innovation.class);
			startActivity(i);
			
			finish();
		}
	
		public void onClick3 (View view)
		{ 
			Intent i = new Intent(HomeScreen.this, Strategy.class);
			startActivity(i);
			
			finish();
		}
		
		public void onClick4 (View view)
		{
			Intent i = new Intent(HomeScreen.this, Diversity.class);
			startActivity(i);
			
			finish();
		}
		
		public void onClick5 (View view)
		{
			Intent i = new Intent(HomeScreen.this, Customer.class);
			startActivity(i);
			finish();
		}
		
		public void onClick6 (View view)
		{ 
			Intent i = new Intent(HomeScreen.this, HRM.class);
			startActivity(i);
			finish();
		}
		
		public void onClick7 (View view)
		{
			Intent i = new Intent(HomeScreen.this, Results.class);
			startActivity(i);
			finish();
		}
		
		public void onClick8 (View view)
		{ 
			Intent i = new Intent(HomeScreen.this, Leadership.class);
			startActivity(i);
			finish();
		}
		
		public void onClick9 (View view)
		{ 
			Intent i = new Intent(HomeScreen.this, Webpage.class);
			startActivity(i);
			finish();
		}

		public void onClick10 (View view)
		{ 
			Intent i = new Intent(HomeScreen.this, About.class);
			i.putE("db", dbmodels);
			startActivity(i);
			finish();
		}



}