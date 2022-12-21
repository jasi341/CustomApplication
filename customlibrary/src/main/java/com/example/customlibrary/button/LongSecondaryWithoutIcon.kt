package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.base.Buttons
import com.example.customlibrary.Utils.txtColor
import com.example.customlibrary.Utils.txtSize

class LongSecondaryWithoutIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        commonAttr(context, R.color.orange)
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        commonAttr(context, R.color.orange)
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        commonAttr(context, R.color.disabled_text)
    }

    private fun commonAttr(context: Context, txtColor: Int? = null) {
        textSize = txtSize(context = context, sp = 40f)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        if (txtColor != null) {
            setTextColor(
                txtColor(
                    color = txtColor,
                    context = context,
                    typedArray = typedArray
                )
            )
        } else {
            setTextColor(txtColor(context = context, typedArray = typedArray))
        }
        ContextThemeWrapper(context, R.style.button1)
        invalidate()
    }
}