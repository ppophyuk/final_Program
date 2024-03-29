package com.example.kcb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Load extends Activity {

    //time for picture display
    private static final int LOAD_DISPLAY_TIME = 3000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFormat(PixelFormat.RGBA_8888);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
        setContentView(R.layout.activity_load);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                //Go to main activity, and finish load activity
                Intent mainIntent = new Intent(Load.this, MainActivity.class);
                Load.this.startActivity(mainIntent);
                Load.this.finish();
            }
        }, LOAD_DISPLAY_TIME);
    }
}