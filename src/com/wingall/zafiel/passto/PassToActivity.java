package com.wingall.zafiel.passto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class PassToActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

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