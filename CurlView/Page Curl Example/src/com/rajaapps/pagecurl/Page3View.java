package com.rajaapps.pagecurl;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.FrameLayout.LayoutParams;

public class Page3View extends FrameLayout {

	public Page3View(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initView();
	}
	
	private void initView() {
        View rootView = inflate(getContext(), R.layout.fragment_smart_menu_page3, null);

        final ImageView backgroundImageView = (ImageView) rootView.findViewById(R.id.imageSlideIndicator);
        final ImageView currentSelectedImage = (ImageView) rootView.findViewById(R.id.imageCurrentSelected);
        final ImageView imageVariationOfSize = (ImageView) rootView.findViewById(R.id.imageVariationOfSize);
        final ImageView imageHide = (ImageView) rootView.findViewById(R.id.imageHideButtons);

        // Set listener for touch effect and playing movie
                
        // Switching color buttons
        Button color1Button = (Button) rootView.findViewById(R.id.buttonColor1);
        // color1Button.setOnTouchListener(new
        // OnTouchChangingColorListener(backgroundImageView, , imageStainless));
        color1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO EGUCHI Change image name
                backgroundImageView.setImageResource(R.drawable.page3_main_1);
                // currentSelectedImage.setLeft(72);
                LayoutParams l = (LayoutParams) currentSelectedImage.getLayoutParams();
                l.leftMargin = 85;
                currentSelectedImage.setLayoutParams(l);
            }
        });
        Button color2Button = (Button) rootView.findViewById(R.id.buttonColor2);
        color2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO EGUCHI Change image name
                backgroundImageView.setImageResource(R.drawable.page3_main_2);
                // currentSelectedImage.setLeft(137);
                LayoutParams l = (LayoutParams) currentSelectedImage.getLayoutParams();
                l.leftMargin = 146;
                currentSelectedImage.setLayoutParams(l);
            }
        });
        Button color3Button = (Button) rootView.findViewById(R.id.buttonColor3);
        color3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO EGUCHI Change image name
                backgroundImageView.setImageResource(R.drawable.page3_main_3);
                // currentSelectedImage.setLeft(199);
                LayoutParams l = (LayoutParams) currentSelectedImage.getLayoutParams();
                l.leftMargin = 206;
                currentSelectedImage.setLayoutParams(l);
            }
        });

        Button color4Button = (Button) rootView.findViewById(R.id.buttonColor4);
        color4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO EGUCHI Change image name
                backgroundImageView.setImageResource(R.drawable.page3_main_4);
                // currentSelectedImage.setLeft(261);
                LayoutParams l = (LayoutParams) currentSelectedImage.getLayoutParams();
                l.leftMargin = 266;
                currentSelectedImage.setLayoutParams(l);
            }
        });
        addView(rootView);
    }
	
	

	

}