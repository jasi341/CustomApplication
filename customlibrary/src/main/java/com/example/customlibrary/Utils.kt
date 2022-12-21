package com.example.customlibrary

import android.content.Context
import android.content.res.TypedArray
import androidx.core.content.ContextCompat

object Utils {
    private const val defaultFontSize = 50f;

    fun txtSize(sp: Float = defaultFontSize, context: Context): Float =
        (sp / context.resources.displayMetrics.density)


    fun txtColor(color: Int = R.color.white, context: Context, typedArray: TypedArray): Int =
        typedArray.getColor(
            R.styleable.MaterialButtons_FontColor,
            ContextCompat.getColor(context, color)
        )

}