package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.Utils
import com.example.customlibrary.base.Buttons

class ShortSecondaryWithoutIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_sec_short_neutral)
        elevation = 20f
        commonAttr(R.color.orange)
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_sec_short_clicked)
        elevation = 20f
        commonAttr(R.color.orange)

    }

    override fun setDisabled() {
        background = null
        backgroundTintMode = null
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
        textSize = Utils.txtSize(context = context, sp = 40f)
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(context, R.style.button1)
        backgroundTintMode = null
        if (txtColor != null) {
            setTextColor(
                Utils.txtColor(
                    color = txtColor, context = context, typedArray = typedArray
                )
            )
        } else {
            setTextColor(Utils.txtColor(context = context, typedArray = typedArray))
        }
        invalidate()
    }
}