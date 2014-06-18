package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Bolcom extends Activity {

	private WebView browser;
	// Hier wordt een webview gecreeërd die vervolgens de website met de desbetreffende URL opend, dit alles draait in de applicatie zelf	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bolcom);
		
		browser = (WebView) findViewById(R.id.webview1);
		
		browser.setWebViewClient(new WebViewClient());
		
		WebSettings settings = browser.getSettings();
		settings.setJavaScriptEnabled(true);
		
		browser.loadUrl("http://www.bol.com/nl/p/100-management-models/9200000020072854/");
	}
	//Onderstaande code is de code voor de knoppen om terug te keren naar de homepage
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
		Intent i = new Intent(Bolcom.this, Webpage.class);
		startActivity(i);
		finish();
       
    }
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	        	
	        	//System.out.println("UP Pressed");
	        	
	        	Intent i = new Intent(Bolcom.this, Webpage.class);
	        	startActivity(i);
	        	
	        	finish();
	        	
	            return(true);
	    }

	    return(super.onOptionsItemSelected(item));
	}

}