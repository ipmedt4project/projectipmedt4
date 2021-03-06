package com.example.app;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper{
	
	
	// Alle Statische variabelen
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "models";
 
    // table name
    private static final String TABLE_MODELS = "modelTexts";
 
    // Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_TEXT = "modeltext";
    int i;
 
        
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
 
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    	 
    	
    	
    	String DELETE_MODEL_TABLE = "DROP TABLE IF EXISTS " + TABLE_MODELS;
    	  	
    	db.execSQL(DELETE_MODEL_TABLE);
    	System.out.println("Tables dropped");
    	
    	
    	String CREATE_MODEL_TABLE = "CREATE TABLE " + TABLE_MODELS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_TEXT + " TEXT " + ")";
       
        db.execSQL(CREATE_MODEL_TABLE);
                
        System.out.println("Tables created");
        
        
    }
 
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MODELS);
 
        // Create tables again
        onCreate(db);
    }
    
    

 // Adding a new model
    public void addModel(Model modeltext) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        values.put(KEY_TEXT, modeltext.getModeltext()); // Contact Name
             
        // Inserting Row
        db.insert(TABLE_MODELS, null, values);
        db.close(); // Closing database connection
    }
    
    // Getting a single model
    public Model getModel(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
     
        Cursor cursor = db.query(TABLE_MODELS, new String[] { KEY_ID,
                KEY_TEXT}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
     
        Model Modeltext = new Model(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1));
        // return model
        return Modeltext;
    }
    
 // Getting a All models
    public List<Model> getAllModels() {
        List<Model> modelList = new ArrayList<Model>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_MODELS;
 
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
 
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Model modeltext = new Model();
                modeltext.setID(Integer.parseInt(cursor.getString(0)));
                modeltext.setModeltext(cursor.getString(1));
                // Adding contact to list
                modelList.add(modeltext);
            } while (cursor.moveToNext());
        }
        // return model list
        return modelList;
    }
 
    
 // Updating single model
    public int updateModel(Model modeltext) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        values.put(KEY_TEXT, modeltext.getModeltext());
             
        // updating row
        return db.update(TABLE_MODELS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(modeltext.getID()) });
    }
    
    // Deleting single model
    public void deleteModel(Model modeltext) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_MODELS, KEY_ID + " = ?",
                new String[] { String.valueOf(modeltext.getID()) });
        db.close();
    }

}
    
    

