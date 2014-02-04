package com.rajaapps.pagecurl;

import com.rajaapps.pagecurl.NavigationBarLayout.NavigationBarClickListener;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Page1View extends PageView {
	
	public Page1View(Context context, CurlView curlView) {
		super(context, curlView);
		// TODO Auto-generated constructor stub
		initView();		
	}	
	
	private void initView() {
        View rootView = inflate(getContext(), R.layout.fragment_smart_menu_page1, null);        
        
     // 1. BathRoom
        final Button buttonBathRoom = (Button) rootView.findViewById(R.id.button_bath_room);
        final ImageView imageBathRoom = (ImageView) rootView.findViewById(R.id.image_bath_room);
        buttonBathRoom.setOnTouchListener(new onTouchMovingToPageWithEffect(1, getCurlView()));       

        // 2. Lavatory
        final Button buttonLavatory = (Button) rootView.findViewById(R.id.button_lavatory);
        final ImageView imageLavatory = (ImageView) rootView.findViewById(R.id.image_lavatory);
        buttonLavatory.setOnTouchListener(new onTouchMovingToPageWithEffect(4, getCurlView()));
        
        // 3. Closet
        final Button buttonCloset = (Button) rootView.findViewById(R.id.button_closet);
        final ImageView imageCloset = (ImageView) rootView.findViewById(R.id.image_closet);
        buttonCloset.setOnTouchListener(new onTouchMovingToPageWithEffect(6, getCurlView()));
        
        // 4. WAMODERN room
        final Button buttonWamodernRoom = (Button) rootView.findViewById(R.id.button_wamodern_room);
        final ImageView imageWamodernRoom = (ImageView) rootView.findViewById(R.id.image_wamodern_room);
        buttonWamodernRoom.setOnTouchListener(new onTouchMovingToPageWithEffect(8, getCurlView()));
        
        // 5. Kitchen
        final Button buttonKitchen = (Button) rootView.findViewById(R.id.button_kitchen);
        final ImageView imageKitchen = (ImageView) rootView.findViewById(R.id.image_kitchen);
        buttonKitchen.setOnTouchListener(new onTouchMovingToPageWithEffect(12, getCurlView()));
        
        // 6. Living&Stair
        final Button buttonLivingStair = (Button) rootView.findViewById(R.id.button_living_stair);
        final ImageView imageLivingStair = (ImageView) rootView.findViewById(R.id.image_living_stair);
        buttonLivingStair.setOnTouchListener(new onTouchMovingToPageWithEffect(14, getCurlView()));
        
        // 7. Entrance
        final Button buttonEntrance = (Button) rootView.findViewById(R.id.button_entrance);
        final ImageView imageEntrance = (ImageView) rootView.findViewById(R.id.image_entrance);
        buttonEntrance.setOnTouchListener(new onTouchMovingToPageWithEffect(16, getCurlView()));
        
        addView(rootView);
        setupIndex();
    }	
}
