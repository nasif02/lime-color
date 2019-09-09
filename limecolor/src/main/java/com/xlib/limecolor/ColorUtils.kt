package com.xlib.limecolor

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color

import java.util.ArrayList

/**
 * Copyright 2019 (C) Xplo
 *
 *
 * Created  : 1/16/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : matcolor.utils
 * Comment  :
 */
class ColorUtils {


    /**
     * Chooses random color defined in res/array.xml
     * need to check if its work or not
     */
    private fun getRandomMaterialColor(context: Context): Int {
        var returnColor = Color.GRAY
        //int arrayId = context.getResources().getIdentifier("mdcolor_" + typeColor, "array", context.getPackageName());
        val arrayId = context.resources.getIdentifier("mdcolor_400", "array", context.packageName)

        if (arrayId != 0) {
            val colors = context.resources.obtainTypedArray(arrayId)
            val index = (Math.random() * colors.length()).toInt()
            returnColor = colors.getColor(index, Color.GRAY)
            colors.recycle()
        }
        return returnColor
    }

    companion object {


        /**
         * Get a random color from color resource array
         * @param resIdColorArray
         * @return
         */
        fun getRandomColor(context: Context, resIdColorArray: Int): Int {
            var returnColor = Color.GRAY
            val colors = context.resources.obtainTypedArray(resIdColorArray)
            val index = (Math.random() * colors.length()).toInt()
            returnColor = colors.getColor(index, Color.GRAY)
            colors.recycle()
            return returnColor
        }


        /**
         * Get color list form color resource array
         * @param resIdColorArray
         * @return
         */
        fun getColorList(context: Context, resIdColorArray: Int): List<Int> {
            val colors = context.resources.obtainTypedArray(resIdColorArray)
            val items = ArrayList<Int>()
            for (i in 0 until colors.length()) {
                items.add(colors.getColor(i, Color.GRAY))
            }
            colors.recycle()

            return items
        }
    }


}
