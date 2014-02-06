package com.rajaapps.pagecurl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class Page2View extends FrameLayout {

	public Page2View(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initView();
	}
	
	private void initView() {
        View view = inflate(getContext(), R.layout.fragment_smart_menu_page2, null);
        addView(view);
    }

}