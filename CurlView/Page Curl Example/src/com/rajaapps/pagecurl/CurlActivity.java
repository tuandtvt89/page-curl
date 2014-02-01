package com.rajaapps.pagecurl;

import com.rajaapps.pagecurl.R;
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

/**
 * Simple Activity for curl testing.
 * 
 * @author harism
 */
public class CurlActivity extends Activity {

	private CurlView mCurlView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_curl);

		int index = 0;
		if (getLastNonConfigurationInstance() != null) {
			index = (Integer) getLastNonConfigurationInstance();
		}
		mCurlView = (CurlView) findViewById(R.id.curl);
		mCurlView.setPageProvider(new PageProvider());
		mCurlView.setSizeChangedObserver(new SizeChangedObserver());
		mCurlView.setCurrentIndex(index);
		mCurlView.setBackgroundColor(0xFF202830);

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
	private class PageProvider implements CurlView.PageProvider {

		// Bitmap resources.
		private int[] mBitmapIds = { R.layout.sample, R.layout.sample1,
				R.layout.sample2, R.layout.sample, R.layout.sample1,
				R.layout.sample2 };

		@Override
		public int getPageCount() {
			return 5;
		}

		private Bitmap loadBitmap(int width, int height, int index) {
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

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
			default:
				Bitmap front3 = loadBitmap(width, height, 0);
				page.setTexture(front3, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
				break;

			/*
			 * // Third case is images on both sides. case 2: { Bitmap front =
			 * loadBitmap(width, height, 1); Bitmap back = loadBitmap(width,
			 * height, 3); page.setTexture(front, CurlPage.SIDE_FRONT);
			 * page.setTexture(back, CurlPage.SIDE_BACK); break; } // Fourth
			 * case is images on both sides - plus they are blend against //
			 * separate colors. case 3: { Bitmap front = loadBitmap(width,
			 * height, 2); Bitmap back = loadBitmap(width, height, 1);
			 * page.setTexture(front, CurlPage.SIDE_FRONT);
			 * page.setTexture(back, CurlPage.SIDE_BACK);
			 * page.setColor(Color.argb(127, 170, 130, 255),
			 * CurlPage.SIDE_FRONT); page.setColor(Color.rgb(255, 190, 150),
			 * CurlPage.SIDE_BACK); break; } // Fifth case is same image is
			 * assigned to front and back. In this // scenario only one texture
			 * is used and shared for both sides. case 4: Bitmap front =
			 * loadBitmap(width, height, 0); page.setTexture(front,
			 * CurlPage.SIDE_BOTH); page.setColor(Color.argb(127, 255, 255,
			 * 255), CurlPage.SIDE_BACK); break;
			 */
			}
		}

	}

	/**
	 * CurlView size changed observer.
	 */
	private class SizeChangedObserver implements CurlView.SizeChangedObserver {
		@Override
		public void onSizeChanged(int w, int h) {
			if (w > h) {
				mCurlView.setViewMode(CurlView.SHOW_TWO_PAGES);
				mCurlView.setMargins(.1f, .05f, .1f, .05f);
			} else {
				mCurlView.setViewMode(CurlView.SHOW_ONE_PAGE);
				// mCurlView.setMargins(.1f, .1f, .1f, .1f);
			}
		}
	}

}