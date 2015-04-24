package com.example.jnjh;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BrowseShetuanxiaoxiActivity extends Activity {

	private WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browse_shetuaxiaoxi);
		
		webView = (WebView) findViewById(R.id.webView);
		String xiaoxiurl = getIntent().getStringExtra("xiaoxiurl");
		webView.loadUrl(xiaoxiurl);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
	}
}
