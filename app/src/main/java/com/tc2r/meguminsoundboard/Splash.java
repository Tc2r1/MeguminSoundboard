package com.tc2r.meguminsoundboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import java.lang.ref.WeakReference;

public class Splash extends Activity {


	private static class StartMainActivityRunnable implements Runnable {
		// 2. Make sure we keep the source Activity as a WeakReference (more on that later)
		private WeakReference<Activity> mActivity;

		private StartMainActivityRunnable(Activity activity) {
			mActivity = new WeakReference(activity);
		}

		@Override
		public void run() {
			// 3. Check that the reference is valid and execute the code
			if (mActivity.get() != null) {
				Activity activity = mActivity.get();
				Intent mainIntent = new Intent(activity, MainActivity.class);
				activity.startActivity(mainIntent);
				activity.finish();
				activity = null;
				mainIntent = null;
			}
		}
	}
	private final int SPLASH_DISPLAY_LENGTH = 2000;

	private Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		mHandler.postDelayed(new StartMainActivityRunnable(this), SPLASH_DISPLAY_LENGTH);
	}

	@Override
	public void onDestroy() {
		mHandler.removeCallbacksAndMessages(null);
		mHandler = null;
		super.onDestroy();
	}

}
