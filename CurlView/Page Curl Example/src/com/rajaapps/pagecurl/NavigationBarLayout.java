package com.rajaapps.pagecurl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 蜈ｱ騾壹�逕ｻ髱｢�?��?Κ縺ｮ�?翫ン繧ｲ�?ｼ繧ｷ�?ｧ�?ｳ�?舌�繧堤ｮ｡逅�☆繧�?�?��?ｩ繧ｹ縺ｧ縺�?��
 */
public class NavigationBarLayout extends FrameLayout implements OnClickListener {
	/**
	 * �?翫ン繧ｲ�?ｼ繧ｷ�?ｧ�?ｳ�?舌�蜀���?懊�?��?ｳ繧�?��?��?ｪ�?��?�縺励◆縺ｨ縺阪�繧､�?�?�Φ�?医Μ繧ｹ�?翫�
	 */
	NavigationBarClickListener navigationBarClickListener;

	/**
	 * 繧ｿ繧､�?医�?�?ｩ�?�?��?
	 */
	private ImageView titleLabelImage;

	/**
	 * �?壹�繧ｸ逡ｪ蜿ｷ
	 */
	private TextView pageNoText;

	/**
	 * 謌ｻ繧�?�繧ｿ�?ｳ
	 */
	private ImageView backButton;

	/**
	 * 逶ｮ谺｡�?懊�?��?ｳ
	 */
	private ImageView indexButton;

	/**
	 * �?壹�繧ｸ繧､�?ｳ�?�ャ繧ｯ繧ｹ逡ｪ蜿ｷ縺ｨ繧ｿ繧､�?医�?�?ｩ�?�?��?縺ｮ�?ｪ繧ｽ�?ｼ繧ｹID縺ｮ髢｢騾｣莉倥¢驟榊�
	 */
	private static final int[] titleLabelImageIndexReferences = new int[] { R.drawable.page1_title,
			R.drawable.page2_title, R.drawable.page3_title, R.drawable.page4_title, R.drawable.page5_title,
			R.drawable.page6_title, R.drawable.page7_title, R.drawable.page8_title, R.drawable.page9_title,
			R.drawable.page9_title, R.drawable.page9_title, R.drawable.page9_title, R.drawable.page14_title,
			R.drawable.page14_title, R.drawable.page16_title, R.drawable.page16_title, R.drawable.page17_title,
			R.drawable.page18_title, R.drawable.page19_title };

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public NavigationBarLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public NavigationBarLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	/**
	 * @param context
	 */
	public NavigationBarLayout(Context context) {
		super(context);
		init(context);
	}

	/**
	 * �?翫ン繧ｲ�?ｼ繧ｷ�?ｧ�?ｳ�?舌�縺ｮ蛻晄悄蛹門�逅�〒縺�?��
	 */
	private void init(Context context) {
	}

	/**
	 * @param navigationBarClickListener
	 *            the navigationBarClickListener to set
	 */
	public void setNavigationBarClickListener(NavigationBarClickListener navigationBarClickListener) {
		this.navigationBarClickListener = navigationBarClickListener;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.view.View#onFinishInflate()
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();

		titleLabelImage = (ImageView) findViewById(R.id.imageTitle);
		pageNoText = (TextView) findViewById(R.id.textPage);
		backButton = (ImageView) findViewById(R.id.buttonBackToMain);
		indexButton = (ImageView) findViewById(R.id.buttonIndex);

		// 繧ｯ�?ｪ�?��?��?ｪ繧ｹ�?翫�繧�?�∪縺ｨ繧√※繧ｻ�?�ヨ
		View[] toBeRegisterOnClickListenerViews = { backButton, indexButton };
		for (View v : toBeRegisterOnClickListenerViews) {
			v.setOnClickListener(this);
		}
	}

	/**
	 * 謌ｻ繧�?�繧ｿ�?ｳ縺ｮ繧ｿ�?�メ�?ｪ繧ｹ�?翫�繧�?��??�?�ヨ縺励∪縺�?��
	 * 
	 * @param listener
	 */
//	public void setBackButtonOnTouchListener(FragmentActivity fragmentActivity) {
//		this.backButton.setOnTouchListener(new OnTouchStartingActivityWithEffectListener(this.backButton,
//				fragmentActivity, "jp.co.ichijo.cube_smart.menu", "jp.co.ichijo.cube_smart.menu.IsmartMenuActivity"));
//	}

	/**
	 * 謖�ｮ壹�?��?ｳ�?�ャ繧ｯ繧ｹ逡ｪ蜿ｷ縺ｫ蟇ｾ蠢懊☆繧�?�?�繧､�?医�?�?ｩ�?�?��?縺ｮ繧､�?｡�?ｼ繧ｸ繧�?��??�?�ヨ縺励∪縺�?��
	 * 
	 * @param position
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void setTitleLabelTextImageByIndex(int position) {
		int resId = NavigationBarLayout.titleLabelImageIndexReferences[position];
		titleLabelImage.setImageResource(resId);
		setTitleLabelTextImage(resId);
	}

	/**
	 * 繧ｿ繧､�?医�?�?ｩ�?�?��?縺ｮ繧､�?｡�?ｼ繧ｸ繧�?��??�?�ヨ縺励∪縺�?��
	 * 
	 * @param resId
	 */
	public void setTitleLabelTextImage(int resId) {
		titleLabelImage.setImageResource(resId);
	}

	/**
	 * 繧ｿ繧､�?医�?�?ｩ�?�?��?縺ｮ繧､�?｡�?ｼ繧ｸ繧�?��??�?�ヨ縺励∪縺�?��
	 * 
	 * @param resId
	 */
	public void setBackButtonImage(int resId) {
		backButton.setImageResource(resId);
	}

	/**
	 * �?壹�繧ｸ逡ｪ蜿ｷ縺ｮ�?��??繧ｹ�?医ｒ繧ｻ�?�ヨ縺励∪縺�?��
	 */
	public void setPageNoText(String pageNoText) {
		this.pageNoText.setText(pageNoText);
	}

	/**
	 * 逶ｮ谺｡�?懊�?��?ｳ縺ｮ陦ｨ�?�ｺ迥ｶ諷�?ｒ繧ｻ�?�ヨ縺励∪縺�?��
	 */
	public void setIndexButtonVisibility(int visibility) {
		this.indexButton.setVisibility(visibility);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonBackToMain:
			if (navigationBarClickListener != null) {
				navigationBarClickListener.onBackButtonClick();
			}
		case R.id.buttonIndex:
			if (navigationBarClickListener != null) {
				navigationBarClickListener.onIndexButtonClick();
			}
		default:
			break;
		}
	}

	/**
	 * �?翫ン繧ｲ�?ｼ繧ｷ�?ｧ�?ｳ�?舌�蜀���?懊�?��?ｳ繧ｯ�?ｪ�?��?�譎ゅ�繧､�?�?�Φ�?医Μ繧ｹ�?翫�繧ｯ�?ｩ繧ｹ縺ｧ縺�?��<br>
	 * 繧｢繧ｯ�?��?��?薙ユ繧｣蛛ｴ縺ｫ繧ｯ�?ｪ�?��?�繧�?��??･縺励∪縺�?��
	 */
	public static interface NavigationBarClickListener {
		/**
		 * 謌ｻ繧�?�繧ｿ�?ｳ繧ｯ�?ｪ�?��?�譎ゅ↓蜻ｼ縺ｳ蜃ｺ縺輔ｌ縺ｾ縺�?��
		 */
		void onBackButtonClick();

		/**
		 * 逶ｮ谺｡�?懊�?��?ｳ繧ｿ�?��譎ゅ↓蜻ｼ縺ｳ蜃ｺ縺輔ｌ縺ｾ縺�?��
		 */
		void onIndexButtonClick();
	}
}
