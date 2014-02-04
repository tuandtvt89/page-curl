package com.rajaapps.pagecurl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * ç›®æ¬¡ã?®ãƒ¬ã‚¤ã‚¢ã‚¦ãƒˆã‚¯ãƒ©ã‚¹ã?§ã?™ã€‚
 */
public class IndexViewLayout extends FrameLayout {
    // Index = 1:Smart Item, 2:kitchen, 5:BathRoom, 7:LUXE Dresser, 9:Living&Stair, 13:Entrance, 15:WAMODERN Room, 17:Closet
    public static final int[] jumpPageIndexArray = new int[] { 0, 1, 4, 6, 8, 12, 14, 16 };
    private ImageView[] indexImageArray;
    private Button[] indexButtonArray;

    public IndexViewLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public IndexViewLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IndexViewLayout(Context context) {
        super(context);
    }

    /*
     * (non-Javadoc)
     * 
     * @see android.view.View#onFinishInflate()
     */
    @Override
    protected void onFinishInflate() {

        this.indexImageArray = new ImageView[] { (ImageView) findViewById(R.id.imageIndex1),
                (ImageView) findViewById(R.id.imageIndex2), (ImageView) findViewById(R.id.imageIndex3),
                (ImageView) findViewById(R.id.imageIndex4), (ImageView) findViewById(R.id.imageIndex5),
                (ImageView) findViewById(R.id.imageIndex6), (ImageView) findViewById(R.id.imageIndex7),
                (ImageView) findViewById(R.id.imageIndex8) };

        this.indexButtonArray = new Button[] { (Button) findViewById(R.id.buttonIndex1),
                (Button) findViewById(R.id.buttonIndex2), (Button) findViewById(R.id.buttonIndex3),
                (Button) findViewById(R.id.buttonIndex4), (Button) findViewById(R.id.buttonIndex5),
                (Button) findViewById(R.id.buttonIndex6), (Button) findViewById(R.id.buttonIndex7),
                (Button) findViewById(R.id.buttonIndex8) };

        Button buttonCloseIndex = (Button) findViewById(R.id.buttonCloseIndex);
        buttonCloseIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // è‡ªåˆ†è‡ªèº«ã?® View ã‚’é?žè¡¨ç¤ºã?«ã?™ã‚‹
                IndexViewLayout.this.setVisibility(INVISIBLE);
            }
        });
    }

    /**
     * å…¨ã?¦ã?®ç›®æ¬¡ãƒœã‚¿ãƒ³ã?®ã‚¿ãƒƒãƒ?ãƒªã‚¹ãƒŠãƒ¼ã‚’ã‚»ãƒƒãƒˆã?—ã?¾ã?™ã€‚
     * 
     * @param viewPager
     * @param pagerAdapter
     */
    
    public void setOnTouchListenerForAllIndexButtons(CurlView curlView) {
    	for (int index = 0; index < IndexViewLayout.jumpPageIndexArray.length; index++) {
          this.indexButtonArray[index].setOnTouchListener(
        		  new onTouchMovingToPageWithEffect(index, curlView));
          }
    }
    
//    public void setOnTouchLisnerAllIndexButtons(ViewPager viewPager, MainFragmentPagerAdapter pagerAdapter) {
//        for (int index = 0; index < IndexViewLayout.jumpPageIndexArray.length; index++) {
//            this.indexButtonArra`y[index].setOnTouchListener(new OnTouchMovingToPageWithEffectListener(
//                    this.indexImageArray[index], pagerAdapter, viewPager, IndexViewLayout.jumpPageIndexArray[index]));
//        }
//    }
//
//    public void setOnTouchLisnerAllIndexButtonsOnSubWindow(final FragmentActivity activity) {
//        for (int index = 0; index < IndexViewLayout.jumpPageIndexArray.length; index++) {
//            final int position = IndexViewLayout.jumpPageIndexArray[index];
//            this.indexButtonArray[index].setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View arg0, MotionEvent arg1) {
//                    if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
//                        Intent returnIntent = new Intent();
//                        returnIntent.putExtra("page", position);
//                        activity.setResult(FragmentActivity.RESULT_OK, returnIntent);
//                        activity.finish();
//                    }
//                    return true;
//                }
//            });
//        }
//    }
//
//    /**
//     * ãƒšãƒ¼ã‚¸å¤‰æ›´ã?«ä¼´ã?† View ã?®çŠ¶æ…‹å¤‰æ›´ã‚’è¡Œã?„ã?¾ã?™ã€‚
//     * 
//     * @param pageNo
//     *            ç§»å‹•å…ˆãƒšãƒ¼ã‚¸ç•ªå?·
//     */
//    public void changePage(int pageNo) {
//        for (int index = 0; index < indexImageArray.length; index++) {
//            if (index == pageNo) {
//                indexImageArray[index].setVisibility(View.VISIBLE);
//            } else {
//                indexImageArray[index].setVisibility(View.INVISIBLE);
//            }
//        }
//    }
}
