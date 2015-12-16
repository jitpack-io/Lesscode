package com.kppassion.lesscode;

import android.content.Context;
import android.widget.Toast;

/**
 * For toast a message
 */
public class KpToast {

    private final Context mContext;

    public KpToast(Context context) {
        mContext = context;
    }

    public void simpleToast(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
