package com.example.apprectest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tvShow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvShow = (TextView) findViewById(R.id.tv_show);
		Intent recIntent = getIntent();
		if (recIntent != null) {
			String name = recIntent.getStringExtra("name");
			tvShow.setText(name);
		}
	}
}
