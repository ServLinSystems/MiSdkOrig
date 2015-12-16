package com.sinagame.support.misdk;

import android.app.Activity;
import android.content.Context;

import com.xiaomi.gamecenter.sdk.MiCommplatform;
import com.xiaomi.gamecenter.sdk.OnLoginProcessListener;
import com.xiaomi.gamecenter.sdk.entry.MiAppInfo;

public class MiSdkAgent {

    public static void miLogin(Activity arg1, OnLoginProcessListener arg2) {
        MiCommplatform.getInstance().miLogin(arg1, arg2);
    }

    public static void Init(Context arg1, MiAppInfo arg2) {
        MiCommplatform.Init(arg1, arg2);
    }
}
