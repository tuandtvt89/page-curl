package com.rajaapps.pagecurl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;

public class PageProvider implements CurlView.PageProvider {

	// Bitmap resources.
	
	private int[] mBitmapIds = new int[11];
	private Activity activity;

	public PageProvider(Activity activity, int[] mBitmapIds) {
		this.mBitmapIds = mBitmapIds;
		this.activity = activity;
	}
	
	@Override
	public int getPageCount() {
		return 11;
	}

	private Bitmap loadBitmap(int width, int height, int index) {
		LayoutInflater inflater = (LayoutInflater) this.activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		Log.d("index", String.valueOf(index));
		View v = inflater.inflate(mBitmapIds[index], null);
		v.measure(MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
				MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY));
		v.layout(0, 0, v.getMeasuredWidth(), v.getMeasuredHeight());
		Bitmap b = Bitmap.createBitmap(v.getWidth(), v.getHeight(),
				Bitmap.Config.ARGB_8888);
		Canvas c = new Canvas(b);
		v.draw(c);
		return b;
	}

	@Override
	public void updatePage(CurlPage page, int width, int height, int index) {

		switch (index) {
		// First case is image on front side, solid colored back.
		case 0:
			Bitmap front = loadBitmap(width, height, 0);
			page.setTexture(front, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 1:
			Bitmap front1 = loadBitmap(width, height, 1);
			page.setTexture(front1, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 2:
			Bitmap front2 = loadBitmap(width, height, 2);
			page.setTexture(front2, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 3:
			Bitmap front3 = loadBitmap(width, height, 3);
			page.setTexture(front3, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 4:
			Bitmap front4 = loadBitmap(width, height, 4);
			page.setTexture(front4, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 5:
			Bitmap front5 = loadBitmap(width, height, 5);
			page.setTexture(front5, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 6:
			Bitmap front6 = loadBitmap(width, height, 6);
			page.setTexture(front6, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 7:
			Bitmap front7 = loadBitmap(width, height, 7);
			page.setTexture(front7, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 8:
			Bitmap front8 = loadBitmap(width, height, 8);
			page.setTexture(front8, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 9:
			Bitmap front9 = loadBitmap(width, height, 9);
			page.setTexture(front9, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		case 10:
			Bitmap front10 = loadBitmap(width, height, 10);
			page.setTexture(front10, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		default:
			Bitmap front0 = loadBitmap(width, height, 0);
			page.setTexture(front0, CurlPage.SIDE_FRONT);
			page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
			break;
		}
	}

}