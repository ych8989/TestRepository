package com.mycompany.myapplication.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.mycompany.myapplication.service.BackgroundService;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final String TAG = " BootCompletedReceiver ";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive");

        Intent i = new Intent(context, BackgroundService.class);
        context.startService(i);

    }
}
