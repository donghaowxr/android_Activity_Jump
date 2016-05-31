package com.example.activityintenttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

    private Button btnJump;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJump = (Button) findViewById(R.id.btnJump);
        btnJump.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnJump:
			Intent intent=new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtra("person", new Person("Ð¡Ã÷", 3, "Ò»°à"));
			startActivity(intent);
			break;
		}
	}
}
