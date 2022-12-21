package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.Utils
import com.example.customlibrary.base.Buttons

class TertiaryWithoutIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        commonAttr(R.color.orange)
    }

    override fun setDisabled() {
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
        textSize = Utils.txtSize(context = context, sp = 40f)
        textAlignment = TEXT_ALIGNMENT_CENTER
        background = null
        backgroundTintMode = null
        if (txtColor != null) {
            setTextColor(
                Utils.txtColor(
                    color = txtColor,
                    context = context,
                    typedArray = typedArray
                )
            )
        }
        ContextThemeWrapper(context, R.style.button1)
        invalidate()
    }

}