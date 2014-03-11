package com.rajaapps.pagecurl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

import com.rajaapps.pagecurl.NavigationBarLayout.NavigationBarClickListener;

/**
 * Simple Activity for curl testing.
 * 
 */
public class CurlActivity extends Activity {

	private CurlView mCurlView;
	private Context context = this;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_curl);

		int index = 0;
		if (getLastNonConfigurationInstance() != null) {
			index = (Integer) getLastNonConfigurationInstance();
		}

		FrameLayout contentPage = (FrameLayout) findViewById(R.id.contentPage);

		// anh.nguyenquynh
		// mCurlView = (CurlView) findViewById(R.id.curl);

		int[] mBitmapIds = { R.layout.fragment_smart_menu_page1,
				R.layout.fragment_smart_menu_page2,
				R.layout.fragment_smart_menu_page3,
				R.layout.fragment_smart_menu_page4,
				R.layout.fragment_smart_menu_page5,
				R.layout.fragment_smart_menu_page6,
				R.layout.fragment_smart_menu_page7,
				R.layout.fragment_smart_menu_page8,
				R.layout.fragment_smart_menu_page9,
				R.layout.fragment_smart_menu_page10,
				R.layout.fragment_smart_menu_page11 };

		mCurlView = new CurlView(context, contentPage, this);
		mCurlView.setPageProvider(new PageProvider(this, mBitmapIds));
		mCurlView.setSizeChangedObserver(new SizeChangedObserver());
		mCurlView.setCurrentIndex(index);
		mCurlView.setBackgroundColor(0xFF202830);

		FrameLayout curl = (FrameLayout) findViewById(R.id.curl);
		curl.addView(mCurlView);

		contentPage.addView(new Page1View(context, mCurlView));

		// end anh.nguyenquynh
	}

	@Override
	public void onPause() {
		super.onPause();
		mCurlView.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
		mCurlView.onResume();
	}

	@Override
	public Object onRetainNonConfigurationInstance() {
		return mCurlView.getCurrentIndex();
	}

	/**
	 * Bitmap provider.
	 */

	/**
	 * CurlView size changed observer.
	 */
	private class SizeChangedObserver implements CurlView.SizeChangedObserver {
		@Override
		public void onSizeChanged(int w, int h) {
			/*
			 * if (w > h) { mCurlView.setViewMode(CurlView.SHOW_TWO_PAGES);
			 * mCurlView.setMargins(.1f, .05f, .1f, .05f); } else {
			 * mCurlView.setViewMode(CurlView.SHOW_ONE_PAGE); //
			 * mCurlView.setMargins(.1f, .1f, .1f, .1f); }
			 */
			mCurlView.setViewMode(CurlView.SHOW_ONE_PAGE);
		}
	}

}