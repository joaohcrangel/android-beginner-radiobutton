package com.example.a_004_radiobutton;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Context context;
	
	private RadioGroup rg;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        context = getBaseContext();
        
        rg = (RadioGroup)findViewById(R.id.rg);
        
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				
				RadioButton rb = (RadioButton)findViewById(checkedId);
				
				Toast.makeText(context, "Selecionado: "+rb.getText().toString(), Toast.LENGTH_SHORT).show();
				
			}
			
		});  
        
    }
    
}
