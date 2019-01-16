package matcolor.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

import matcolor.base.Contextor;

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

    private static final Context context = Contextor.getInstance().getContext();


    /**
     *
     * @param resIdColor
     * @return
     */
    public static int getMaterialColor(int resIdColor) {
        int returnColor = context.getResources().getColor(resIdColor);
        return returnColor;
    }

    /**
     *
     * @param resIdColorArray
     * @return
     */
    public static int getMaterialColorRandom(int resIdColorArray) {
        int returnColor = Color.GRAY;
        TypedArray colors = context.getResources().obtainTypedArray(resIdColorArray);
        int index = (int) (Math.random() * colors.length());
        returnColor = colors.getColor(index, Color.GRAY);
        colors.recycle();
        return returnColor;
    }


    /**
     *
     * @param resIdColorArray
     * @return
     */
    public static List<Integer> getMaterialColorList(int resIdColorArray) {
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
