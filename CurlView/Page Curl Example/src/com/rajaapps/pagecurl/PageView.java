package com.rajaapps.pagecurl;

import com.rajaapps.pagecurl.NavigationBarLayout.NavigationBarClickListener;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class PageView extends FrameLayout {
	
	IndexViewLayout indexViewLayout;
	private CurlView curlView;
	
	public PageView(Context context, CurlView curlView) {
		super(context);
		this.curlView = curlView;
		// TODO Auto-generated constructor stub
	}

	public CurlView getCurlView() {
		return curlView;
	}
	
	public void setupIndex() {
		indexViewLayout = (IndexViewLayout) findViewById(R.id.viewIndex);

		NavigationBarLayout navigationBarLayout = (NavigationBarLayout) findViewById(R.id.navigationBar);
		navigationBarLayout
				.setNavigationBarClickListener(new NavigationBarClickListener() {
					@Override
					public void onIndexButtonClick() {
						//
						if (indexViewLayout.getVisibility() == View.VISIBLE) {
							indexViewLayout.setVisibility(View.INVISIBLE);
						} else {
							indexViewLayout.setVisibility(View.VISIBLE);
						}
					}

					@Override
					public void onBackButtonClick() {
						//
					}
				});
		
		indexViewLayout.setOnTouchListenerForAllIndexButtons(curlView);
	}
	
	public void removeIndexView() {
		((Activity)this.getContext()).runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if ( indexViewLayout.getVisibility() == View.VISIBLE) {
					indexViewLayout.setVisibility(View.INVISIBLE);
				}
			}
		});

	}
}
