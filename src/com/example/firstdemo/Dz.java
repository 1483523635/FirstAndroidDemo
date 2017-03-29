package com.example.firstdemo;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TabHost;

public class Dz extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		TabHost th=getTabHost();
		th.addTab(th.newTabSpec("tab1").setIndicator("µÇÂ½").setContent(new Intent(this,Denglu.class)));
		th.addTab(th.newTabSpec("tab2").setIndicator("×¢²á").setContent(new Intent(this,Zhuce.class)));
	}
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
		if(vinsion>=5)
		{
			overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
		}
	}
}
