package com.xlib.limecolor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;

import com.xlib.limecolor.base.Contextor;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2019 (C) Xplo
 * <p>
 * Created  : 1/16/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : matcolor.utils
 * Comment  :
 */
public class ColorUtils {

    @SuppressLint("StaticFieldLeak")
    private static final Context context = Contextor.getInstance().getContext();


    /**
     * Get a color from color resource
     * @param resIdColor
     * @return
     */
    public static int getColor(int resIdColor) {
        return context.getResources().getColor(resIdColor);
    }

    /**
     * Get a random color from color resource array
     * @param resIdColorArray
     * @return
     */
    public static int getRandomColor(int resIdColorArray) {
        int returnColor = Color.GRAY;
        TypedArray colors = context.getResources().obtainTypedArray(resIdColorArray);
        int index = (int) (Math.random() * colors.length());
        returnColor = colors.getColor(index, Color.GRAY);
        colors.recycle();
        return returnColor;
    }


    /**
     * Get color list form color resource array
     * @param resIdColorArray
     * @return
     */
    public static List<Integer> getColorList(int resIdColorArray) {
        TypedArray colors = context.getResources().obtainTypedArray(resIdColorArray);
        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < colors.length(); i++) {
            items.add(colors.getColor(i, Color.GRAY));
        }
        colors.recycle();

        return items;
    }


    /**
     * Chooses random color defined in res/array.xml
     * need to check if its work or not
     */
    private int getRandomMaterialColor() {
        int returnColor = Color.GRAY;
        //int arrayId = context.getResources().getIdentifier("mdcolor_" + typeColor, "array", context.getPackageName());
        int arrayId = context.getResources().getIdentifier("mdcolor_400", "array", context.getPackageName());

        if (arrayId != 0) {
            TypedArray colors = context.getResources().obtainTypedArray(arrayId);
            int index = (int) (Math.random() * colors.length());
            returnColor = colors.getColor(index, Color.GRAY);
            colors.recycle();
        }
        return returnColor;
    }


}
