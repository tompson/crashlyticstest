package com.troii.crashlyticstest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.crashlytics.android.Crashlytics;

public class MyActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Crashlytics.start(this);

		final WebView webView = (WebView) findViewById(R.id.webView);

		webView.setVisibility(View.VISIBLE);
		webView.loadUrl(getString(R.string.start_url));
	}
}
