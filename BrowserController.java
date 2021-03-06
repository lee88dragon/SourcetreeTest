/*
 * Copyright 2014 A.C.R. Development
 */
package com.house365.browser.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;

public interface BrowserController {
	void updateUrl(String title);

	void updateProgress(int n);

	void updateHistory(String title, String url);

	void openFileChooser(ValueCallback<Uri> uploadMsg);

	void update();

	void onLongPress();

	void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback);

	void onHideCustomView();

	Bitmap getDefaultVideoPoster();

	View getVideoLoadingProgressView();

	void onCreateWindow(boolean isUserGesture, Message resultMsg);

	Activity getActivity();

	void hideActionBar();

	void showActionBar();

	void longClickPage(String url);

	void openBookmarkPage(WebView view);

	boolean isActionBarShowing();
}
