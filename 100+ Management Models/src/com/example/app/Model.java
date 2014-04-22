package com.example.app;

public class Model {
	
	 //private variables
    int _id;
    String _modelText;
     
    // Empty constructor
    public Model(){
         
    }
    // constructor
    public Model(int id, String modeltext){
        this._id = id;
        this._modelText = modeltext;

    }
     
    // constructor
    public Model(String modeltext){
        this._modelText = modeltext;
    }
    // getting ID
    public int getID(){
        return this._id;
    }
     
    // setting id
    public void setID(int id){
        this._id = id;
    }
     
    // getting name
    public String getModeltext(){
        return this._modelText;
    }
     
    // setting name
    public void setModeltext(String modeltext){
        this._modelText = modeltext;
    }

}


