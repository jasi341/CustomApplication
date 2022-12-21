package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.Utils
import com.example.customlibrary.base.Buttons

class ShortSecondaryGrey(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_ui_sec_short_gray)
        commonAttr()
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_ui_sec_gray_clicked)
        commonAttr()
    }

    private fun commonAttr() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        backgroundTintMode = null
        ContextThemeWrapper(context, R.style.button1)
        textSize = Utils.txtSize(context = context, sp = 40f)
        setTextColor(
            Utils.txtColor(
                color = R.color.orange, context = context, typedArray = typedArray
            )
        )
        invalidate()
    }

}