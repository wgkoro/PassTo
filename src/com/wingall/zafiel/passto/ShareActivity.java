package com.wingall.zafiel.passto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class ShareActivity extends Activity implements OnClickListener{
	private static String TAG = "MESSAGE";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        if(Intent.ACTION_SEND.equals(getIntent().getAction())){
        	CharSequence url_str = getIntent().getExtras().getCharSequence(Intent.EXTRA_TEXT);
        	if(url_str != null){
                Uri uri = Uri.parse((String)url_str);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
        	}
        }
        
        View setting_button = this.findViewById(R.id.start_setting);
        setting_button.setOnClickListener(this);
    }
    
    public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.start_setting:
			startActivity(new Intent(android.provider.Settings.ACTION_APPLICATION_SETTINGS));
			break;
			
		default:
			break;
		}
	}

}