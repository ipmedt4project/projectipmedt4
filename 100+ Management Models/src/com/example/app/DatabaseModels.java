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

  }

