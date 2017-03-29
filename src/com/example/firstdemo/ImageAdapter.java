package com.example.firstdemo;

import android.R.color;
import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

@SuppressWarnings("unused")
public class ImageAdapter extends BaseAdapter implements ListAdapter {
	int [] imageid=new int[]{
			R.drawable.a,R.drawable.b,
			R.drawable.c,
			R.drawable.d,
			R.drawable.e,
			R.drawable.f,
			R.drawable.g,
			R.drawable.h,
			R.drawable.i,
			R.drawable.j,
			R.drawable.k,
	};
	String[] textid=new String[]{
		"官方网站","官方微博","阳光检务","依申请公开项","在线预约","交流平台","案件查询","网上举报","控告申诉","检察长信箱","多媒体信息"	
	};
	
	
	private Context mc;
	public ImageAdapter(Context c){
		mc=c;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		return imageid.length;
	}

	@Override
	public Object getItem(int arg0) {
		
		return imageid[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		/*ImageView image;
		if(arg1==null){
			image=new ImageView(mc);
			image.setLayoutParams(new GridView.LayoutParams(85,85));
			image.setScaleType(ImageView.ScaleType.CENTER_CROP);
			image.setPadding(8, 8, 8, 8);
		}
		else
		{
			image=(ImageView) arg1;
		}
		image.setImageResource(imageid[arg0]);
		
		return image;}*/
		public View getView(int position, View convertView, ViewGroup parent) {
			  TextView text = new TextView(mc);
			  
			  text.setGravity(Gravity.CENTER_HORIZONTAL);
			  text.setCompoundDrawablePadding(2);
			  // 重点，将该图片显示在TextView上方
			  text.setCompoundDrawablesWithIntrinsicBounds(null, mc.getResources().getDrawable(imageid[position]), null, null);
			  text.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 10f);
			
			  text.setText(textid[position]);
			  text.setPadding(2, 2, 2,2);
			  return text;
			}
	

}
