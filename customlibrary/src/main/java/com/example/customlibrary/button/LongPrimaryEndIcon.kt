package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.base.Buttons
import com.example.customlibrary.Utils.txtColor
import com.example.customlibrary.Utils.txtSize

class LongPrimaryEndIcon(context: Context, attr: AttributeSet) : Buttons(context, attr) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        setIconTintResource(R.color.white)
        commonAttr(context)
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        setIconTintResource(R.color.white)
        commonAttr(context)
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        setIconTintResource(R.color.disabled_text)
        commonAttr(context, R.color.disabled_text)
    }

    private fun commonAttr(context: Context, txtColor: Int? = null) {
        textSize = txtSize(context = context)
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
        iconGravity = ICON_GRAVITY_TEXT_END
        iconSize = 52
        iconPadding = 5
        ContextThemeWrapper(context, R.style.button1)
        invalidate()

    }
}