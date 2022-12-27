package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.base.Buttons
import com.example.customlibrary.button.ButtonUtils.txtColor
import com.example.customlibrary.button.ButtonUtils.txtSize

class LongPrimaryWithoutIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        commonAttr()
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        commonAttr()
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
        textSize = txtSize(sp = ButtonUtils.TextSize.LARGE, context = context)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        if (txtColor != null) {
            setTextColor(
                txtColor(
                    color = txtColor, context = context, typedArray = typedArray
                )
            )
        } else {
            setTextColor(txtColor(context = context, typedArray = typedArray))
        }
        ContextThemeWrapper(context, R.style.button1)
        invalidate()

    }

}