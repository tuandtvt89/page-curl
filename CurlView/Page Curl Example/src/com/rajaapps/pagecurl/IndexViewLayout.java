package com.rajaapps.pagecurl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * 目次�?�レイアウトクラス�?��?�。
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
                // 自分自身�?� View を�?�表示�?��?�る
                IndexViewLayout.this.setVisibility(INVISIBLE);
            }
        });
    }

    /**
     * 全�?��?�目次ボタン�?�タッ�?リスナーをセット�?��?��?�。
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
//     * ページ変更�?�伴�?� View �?�状態変更を行�?��?��?�。
//     * 
//     * @param pageNo
//     *            移動先ページ番�?�
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
