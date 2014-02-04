package com.rajaapps.pagecurl;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class onTouchMovingToPageWithEffect implements OnTouchListener {

	private int index;
	private CurlView curl;
	public onTouchMovingToPageWithEffect(int index, CurlView curlView) {
		this.index = index;
		this.curl = curlView;
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		curl.switchToPage(index, CurlView.CURL_RIGHT);
		return true;
	}
	
}