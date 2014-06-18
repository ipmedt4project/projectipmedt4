package com.example.app;

import java.util.List;

import com.example.app.DatabaseHandler;
import com.example.app.Model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
 
public class DatabaseModels{

	DatabaseHandler db;

	 	
	public DatabaseModels(Bundle savedInstanceState, Context c) {
    	
		db = new DatabaseHandler(c);
		db.onCreate(db.getWritableDatabase());
    	System.out.println("Start Database");
       
  // De database is aangeroepen.  
                 
        /**
         * CRUD Operations
         * */
        // Inserting Texts in database
        Log.d("Insert: ", "Inserting .."); 
        db.addModel(new Model("100+ Management Models offers a quick overview of the key features and potential applications of each of the most important models in nine different categories."));        
         
        // Reading all Texts in database
        Log.d("Reading: ", "Reading all contacts.."); 
        List<Model> modeltexts = db.getAllModels();       
         
        for (Model md : modeltexts) {
            String log = "Id: "+md.getID()+" ,Text: " + md.getModeltext();
        // Writing models to log
        Log.d("Model: ", log);
        
        
        	}
        
  }

  }

