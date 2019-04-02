package xlib.matcolor.base;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * Copyright 2018 (C) Xplo
 * <p>
 * Created  : 10/23/2018
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : alime.utils
 * Comment  :       Contextor.getInstance().init(appContext);
 */
public class Contextor {

    @SuppressLint("StaticFieldLeak")
    private static Contextor sInstance;

    private Context mContext;

    public static Contextor getInstance() {
        if (sInstance == null) {
            sInstance = new Contextor();
        }
        return sInstance;
    }

    public void init(Context context) {
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }
}
