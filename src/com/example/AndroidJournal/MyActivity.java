package com.example.AndroidJournal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.dropbox.client2.session.Session;

public class MyActivity extends Activity {

    final static private String APP_KEY = "INSERT_APP_KEY";
    final static private String APP_SECRET = "INSERT_APP_SECRET";
    final static private Session.AccessType ACCESS_TYPE = Session.AccessType.DROPBOX;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textBox = (TextView) findViewById(R.id.textView);

        textBox.setText("Testing");
    }
}
