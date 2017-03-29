package com.example.firstdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.QuickContactBadge;
import android.widget.SimpleAdapter;
import android.widget.Toast;

@SuppressWarnings("unused")
public class Main extends Activity{
	private QuickContactBadge q;
	protected void onCreate(Bundle savedInstanceState) {
		//TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
	    int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
		if(vinsion>=5)                               
		{
			overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
		}
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
	    GridView g=(GridView) this.findViewById(R.id.gridView1);
		g.setAdapter(new ImageAdapter(this));
		g.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					Intent intent=new Intent(Main.this,Guanfang.class);
					intent.putExtra("id", 0);
					startActivity(intent);
					break;
				case 1:
					Intent intent1=new Intent(Main.this,Guanfang.class);
					intent1.putExtra("id", 1);
					startActivity(intent1);
					break;
				case 2:
					Intent intent2=new Intent(Main.this,Guanfang.class);
					
					intent2.putExtra("id", 2);
					startActivity(intent2);
					break;
				case 3:
					Intent intent3=new Intent(Main.this,Guanfang.class);
					intent3.putExtra("id", 3);
					startActivity(intent3);
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					Intent intent6=new Intent(Main.this,Guanfang.class);
					intent6.putExtra("id", 6);
					startActivity(intent6);
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;	
				case 10:
					break;
					
				default:
					break;
				}
			}
		});
		/*q=(QuickContactBadge) this.findViewById(R.id.quickContactBadge1);
		q.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Main.this,Dz.class);
				startActivityForResult(intent, 11);
				@SuppressWarnings("deprecation")
				int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
				if(vinsion>=5)
				{
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
				}
			}
		});*/
			} 
	}

