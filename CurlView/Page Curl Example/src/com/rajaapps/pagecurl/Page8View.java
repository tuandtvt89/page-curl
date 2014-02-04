package com.rajaapps.pagecurl;

import com.rajaapps.pagecurl.NavigationBarLayout.NavigationBarClickListener;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class Page8View extends PageView {

	public Page8View(Context context, CurlView curlView) {
		super(context, curlView);
		// TODO Auto-generated constructor stub
		initView();
	}
	
	private void initView() {
        View view = inflate(getContext(), R.layout.fragment_smart_menu_page8, null);
        addView(view);
        setupIndex();
    }

}