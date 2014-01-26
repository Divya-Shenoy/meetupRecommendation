package com.example.meetuprecommendation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	Button signin,signup;
	
	final String username="",password="";	
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin = (Button)findViewById(R.id.button1);
        signin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {				
				
				Thread login = new Thread(){
					public void run(){
						
						EditText term = (EditText)findViewById(R.id.editText1);		
						String searchTerm =term.getText().toString();
						
						EditText location = (EditText)findViewById(R.id.editText2);
						String searchLocation = location.getText().toString();
						Intent i = new Intent(getApplicationContext(), LoginActivity.class);
						i.putExtra("term",searchTerm);
						i.putExtra("location", searchLocation);
						startActivity(i);	
					}
				};				
				login.start();							
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
