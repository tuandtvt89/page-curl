package com.rajaapps.pagecurl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class Page7View extends FrameLayout {

	public Page7View(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initView();
	}
	
	private void initView() {
        View view = inflate(getContext(), R.layout.fragment_smart_menu_page7, null);
        addView(view);
    }
}
