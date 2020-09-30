package com.findcam.sdk;

import android.util.Log;

/**
 * @WYU-WIN
 * @date 2020/9/30 0030.
 * description：
 */
public class FCOpenSDK {
    private static String TAG = "FCOpenSDK";

    public static void loadLibrary() {
        try {
            System.loadLibrary("mp4recorder");
            Log.i(TAG, "loadLibrary 1 suc");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        try {
            System.loadLibrary("decoder");
            Log.i(TAG, "loadLibrary 2 suc");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }


        try {
            System.loadLibrary("VRConfig");
            Log.i(TAG, "loadLibrary 3 suc");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }

        try {
            System.loadLibrary("IOTCAPIs_ubia");
            Log.i(TAG, "loadLibrary 4 suc");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }

        try {
            System.loadLibrary("AVAPIs_ubia");
            Log.i(TAG, "loadLibrary 5 suc");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}
