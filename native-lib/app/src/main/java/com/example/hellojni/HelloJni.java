
package com.example.hellojni;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import com.example.lib.Helper;

public class HelloJni extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a TextView and set its content from a native function.
        TextView  tv = new TextView(this);
        tv.setText( new Helper().getString() );
        setContentView(tv);
    }

    static {
        System.loadLibrary("hello-jni");
    }
}

