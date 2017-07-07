package com.mycompany.myapplication.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final String TAG = " BootCompletedReceiver ";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive");

    }
}
