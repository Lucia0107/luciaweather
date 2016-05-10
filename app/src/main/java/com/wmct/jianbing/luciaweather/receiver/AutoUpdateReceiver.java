package com.wmct.jianbing.luciaweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.wmct.jianbing.luciaweather.service.AutoUpdateService;

/**
 * Created by jianbing on 2016/5/10.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
