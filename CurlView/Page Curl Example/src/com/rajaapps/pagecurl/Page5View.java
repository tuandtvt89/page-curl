package com.rajaapps.pagecurl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class Page5View extends FrameLayout {

	public Page5View(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initView();
	}
	
	private void initView() {
        View view = inflate(getContext(), R.layout.fragment_smart_menu_page5, null);
        addView(view);
    }

	

}