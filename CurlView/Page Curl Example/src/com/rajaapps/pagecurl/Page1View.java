package com.rajaapps.pagecurl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Page1View extends FrameLayout {

	private CurlView curlView;
	
	public Page1View(Context context, CurlView curlView) {
		super(context);
		// TODO Auto-generated constructor stub
		initView();
		this.curlView = curlView;
	}
	
	private void initView() {
        View rootView = inflate(getContext(), R.layout.fragment_smart_menu_page1, null);        
        
     // 1. BathRoom
        final Button buttonBathRoom = (Button) rootView.findViewById(R.id.button_bath_room);
        final ImageView imageBathRoom = (ImageView) rootView.findViewById(R.id.image_bath_room);
        buttonBathRoom.setOnTouchListener(new onTouchMovingToPageWithEffect(2, curlView));       

        // 2. Lavatory
        final Button buttonLavatory = (Button) rootView.findViewById(R.id.button_lavatory);
        final ImageView imageLavatory = (ImageView) rootView.findViewById(R.id.image_lavatory);

        // 3. Closet
        final Button buttonCloset = (Button) rootView.findViewById(R.id.button_closet);
        final ImageView imageCloset = (ImageView) rootView.findViewById(R.id.image_closet);

        // 4. WAMODERN room
        final Button buttonWamodernRoom = (Button) rootView.findViewById(R.id.button_wamodern_room);
        final ImageView imageWamodernRoom = (ImageView) rootView.findViewById(R.id.image_wamodern_room);

        // 5. Kitchen
        final Button buttonKitchen = (Button) rootView.findViewById(R.id.button_kitchen);
        final ImageView imageKitchen = (ImageView) rootView.findViewById(R.id.image_kitchen);

        // 6. Living&Stair
        final Button buttonLivingStair = (Button) rootView.findViewById(R.id.button_living_stair);
        final ImageView imageLivingStair = (ImageView) rootView.findViewById(R.id.image_living_stair);

        // 7. Entrance
        final Button buttonEntrance = (Button) rootView.findViewById(R.id.button_entrance);
        final ImageView imageEntrance = (ImageView) rootView.findViewById(R.id.image_entrance);
        
        addView(rootView);
    }

	private class onTouchMovingToPageWithEffect implements OnTouchListener {

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

}
