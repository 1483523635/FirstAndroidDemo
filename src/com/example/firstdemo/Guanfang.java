package com.example.firstdemo;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.inputmethodservice.Keyboard.Key;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class Guanfang extends Activity {
		private Intent intent;
		private WebView view;
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			@SuppressWarnings("deprecation")
			int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
			if(vinsion>=5)
			{
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
			}
			super.onCreate(savedInstanceState);
			intent=getIntent();
			int id=intent.getIntExtra("id", 0);
			switch(id){
			case 0:
				guangwang();
				break;
			case 1:
				weibo();
				break;
			case 2:
				yanguang();
				break;
			case 6:
				anjian();
				break;
			default:
				break;
			}
			
		}
		private void yanguang() {
			// TODO Auto-generated method stub
			setContentView(R.layout.yanguang);
			view=(WebView) this.findViewById(R.id.webView1);
			view.loadUrl("http://www.baidu.com");
		}
		@SuppressLint("NewApi")
		private void anjian() {
			// TODO Auto-generated method stub
			setContentView(R.layout.anjian);
			ImageButton ib=(ImageButton) this.findViewById(R.id.imageButton1);
			ib.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					finish();
				int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
				if(vinsion>=5)
				{
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
				}
				}
				
			});
			
}
		//微博网站链接
		@SuppressLint("SetJavaScriptEnabled")
		private void weibo() {
			// TODO Auto-generated method stub
			setContentView(R.layout.weibo);
			view=(WebView) this.findViewById(R.id.webView1);
			view.getSettings().setJavaScriptEnabled(true); 
			WebSettings settings=view.getSettings();
			settings.setUseWideViewPort(true); 
		    settings.setLoadWithOverviewMode(true);
			ImageButton ib=(ImageButton) this.findViewById(R.id.imageButton1);
			ib.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(view.canGoBack())
						view.goBack();
					if(!view.canGoBack())
				        finish();
					//设定特效
				int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
				if(vinsion>=5)
				{
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
				}
				}
			});
	        //加载需要显示的网页  
	        view.loadUrl("http://m.3g.qq.com/wbread/copage/singleguest?lp=0,0,5,0,6&id=thjcywb");  
	        //设置Web视图  
	        view.setWebViewClient(new HelloWebViewClient1());  
	    }
		//官网链接
		@SuppressLint("SetJavaScriptEnabled")
		private void guangwang() {
			// TODO Auto-generated method stub
			setContentView(R.layout.web);
				view=(WebView) this.findViewById(R.id.webView1);
				view.getSettings().setJavaScriptEnabled(true);  
				WebSettings settings=view.getSettings();
				 settings.setUseWideViewPort(true);
				 settings.enableSmoothTransition();
			        settings.setLoadWithOverviewMode(true); 
				ImageButton ib=(ImageButton) this.findViewById(R.id.imageButton1);
				ib.setOnClickListener(new OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						if(view.canGoBack())
							view.goBack();
						if(!view.canGoBack())
					        finish();
					@SuppressWarnings("deprecation")
					int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
					if(vinsion>=5)
					{
						overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
					}
					}
				});
		        //加载需要显示的网页  
		        view.loadUrl("http://www.thjcy.cn/wz_Class.asp?ClassID=15");  
		        //设置Web视图  
		        view.setWebViewClient(new HelloWebViewClient1 ());
		    }  
		      
		    @Override 
		    //设置回退  
		    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法  
		    public boolean onKeyDown(int keyCode, KeyEvent event) { 
		    	try{
		        if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {  
		            view.goBack(); //goBack()表示返回WebView的上一页面  
		            return true;
		        }
		        if(keyCode==KeyEvent.KEYCODE_BACK&&!(view.canGoBack()))
		        {
		        	
		        	finish();
		        	@SuppressWarnings("deprecation")
					int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
					if(vinsion>=5)
					{
						overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
					}
		        }}
		    	catch(NullPointerException e){
		    		finish();
		    		int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
					if(vinsion>=5)
					{
						overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
					}
		    	}
		    	
				return false;	
		      
		          
		    }  
		   /* public void onBackPressed() {
				// TODO Auto-generated method stub
				super.onBackPressed();
				int vinsion=Integer.valueOf(android.os.Build.VERSION.SDK);
				if(vinsion>=5)
				{
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.slide_out_right);
				}
			}*/
		      	
}
//webview中链接设置
class HelloWebViewClient1 extends WebViewClient {  
		        @Override 
		        public boolean shouldOverrideUrlLoading(WebView view, String url) {  
		            view.loadUrl(url);  
		            return true;  
		        }  
		    }  