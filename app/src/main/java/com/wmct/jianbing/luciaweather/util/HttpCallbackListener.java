package com.wmct.jianbing.luciaweather.util;

/**
 * Created by jianbing on 2016/5/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
