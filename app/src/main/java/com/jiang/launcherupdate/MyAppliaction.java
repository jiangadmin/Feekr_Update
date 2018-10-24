package com.jiang.launcherupdate;

import android.app.Application;
import android.content.Context;

import com.xgimi.business.api.clients.XgimiDeviceClient;

/**
 * Created by  jiang
 * on 2017/7/3.
 * Email: www.fangmu@qq.com
 * Phone：186 6120 1018
 * Purpose:TODO
 * update：
 */

public class MyAppliaction extends Application {
    private static final String TAG = "MyAppliaction";
    public static boolean LogShow = true;
    public static Context context;

    public static String SN = XgimiDeviceClient.getMachineId();

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

}
