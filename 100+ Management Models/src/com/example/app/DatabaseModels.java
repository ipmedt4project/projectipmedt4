package com.example.app;

import java.util.List; 

import com.example.app.DatabaseHandler;
import com.example.app.Model;
import com.example.app.HomeScreen;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

 
public class DatabaseModels extends Activity {

	DatabaseHandler db;

	 	
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	
		db = new DatabaseHandler(this);
		
    	System.out.println("Start Database");
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        

                 
        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Insert: ", "Inserting .."); 
        db.addModel(new Model("Model 1 text"));        
        db.addModel(new Model("Model 2 text"));
        db.addModel(new Model("Model 3 text"));
        db.addModel(new Model("Model 4 text"));
         
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts.."); 
        List<Model> modeltexts = db.getAllModels();       
         
        for (Model md : modeltexts) {
            String log = "Id: "+md.getID()+" ,Text: " + md.getModeltext();
                // Writing Contacts to log
        Log.d("Model: ", log);
        
        
        
    }
  }
    
    public DatabaseModels()
    {
    	
    }
    
    public void onClick01(View view)
    {
    	Toast.makeText(this, "DAT ZOU JE WEL WILLEN JAH, TIEFUSMONGOOL", Toast.LENGTH_SHORT).show(); 
    	
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
		Intent i = new Intent(DatabaseModels.this, HomeScreen.class);
		startActivity(i);
		finish();
       
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	        	
	        	//System.out.println("UP Pressed");
	        	
	        	Intent i = new Intent(DatabaseModels.this, HomeScreen.class);
	        	startActivity(i);
	        	
	        	finish();
	        	
	            return(true);
	    }

	    return(super.onOptionsItemSelected(item));
	}
    
}

