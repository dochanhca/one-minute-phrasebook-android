package com.mamlambo.article.phrasebook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class PhrasebookActivity extends Activity {
    private final static String DEBUG_TAG = "PrasebookActivity";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageView map = (ImageView)findViewById(R.id.ImageViewMap);
        map.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String geoUriString = getResources().getString(R.string.map_location);
                Log.d(DEBUG_TAG, "String: "+geoUriString);
                Uri geoUri = Uri.parse(geoUriString);
                Intent mapCall = new Intent(Intent.ACTION_VIEW, geoUri);
                startActivity(mapCall);
            }
        });
    }
}