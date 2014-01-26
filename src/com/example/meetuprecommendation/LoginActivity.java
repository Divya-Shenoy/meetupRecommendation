package com.example.meetuprecommendation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

import com.example.meetuprecommendation.R;

public class LoginActivity extends Activity{
	private ProgressDialog progressDialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		progressDialog =ProgressDialog.show(this, "", "Loading..");
	//	System.out.println("inside searchActivity");
		String term = getIntent().getExtras().getString("term");
		String location = getIntent().getExtras().getString("location");
	}
}
