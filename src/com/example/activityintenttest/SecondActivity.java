package com.example.activityintenttest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	private TextView tvShowName;
	private TextView tvShowAge;
	private TextView tvShowClassName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		tvShowName = (TextView) findViewById(R.id.tvShowName);
		tvShowAge = (TextView) findViewById(R.id.tvShowAge);
		tvShowClassName = (TextView) findViewById(R.id.tvShowClassName);
		
		Person person=getIntent().getParcelableExtra("person");
		tvShowName.setText(person.getName());
		tvShowAge.setText(String.valueOf(person.getAge()));
		tvShowClassName.setText(person.getClassName());
	}
}
