package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.base.Buttons

class ShortSecondaryWithoutIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        commonAttr(R.color.orange)
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        commonAttr(R.color.orange)

    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
        textSize = ButtonUtils.txtSize(context = context, sp = ButtonUtils.TextSize.SMALL)
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(context, R.style.button1)
        backgroundTintMode = null
        if (txtColor != null) {
            setTextColor(
                ButtonUtils.txtColor(
                    color = txtColor, context = context, typedArray = typedArray
                )
            )
        } else {
            setTextColor(ButtonUtils.txtColor(context = context, typedArray = typedArray))
        }
        invalidate()
    }
}