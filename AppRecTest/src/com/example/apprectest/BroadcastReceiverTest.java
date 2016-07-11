package com.example.apprectest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BroadcastReceiverTest extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String name = intent.getStringExtra("name");
		System.out.println("接收到的广播:name=" + name);
		Intent mIntent=new Intent(context, MainActivity.class);
		mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		mIntent.putExtra("name", name);
		context.startActivity(mIntent);
	}

}
