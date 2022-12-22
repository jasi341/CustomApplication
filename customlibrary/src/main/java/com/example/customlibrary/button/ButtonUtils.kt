package com.example.customlibrary.button

import android.content.Context
import android.content.res.TypedArray
import androidx.core.content.ContextCompat
import com.example.customlibrary.R

object ButtonUtils {

    object TextSize {
        const val SMALL = 40f
        const val LARGE = 50f
    }

    object Icon {
        const val SIZE = 52
        const val PADDING = 5
    }

    fun txtSize(sp: Float, context: Context): Float =
        (sp / context.resources.displayMetrics.density)


    fun txtColor(color: Int = R.color.white, context: Context, typedArray: TypedArray): Int =
        typedArray.getColor(
            R.styleable.MaterialButtons_FontColor,
            ContextCompat.getColor(context, color)
        )

}