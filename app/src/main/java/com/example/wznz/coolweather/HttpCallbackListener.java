package com.example.wznz.coolweather;

/**
 * Created by wznz on 16-4-29.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
