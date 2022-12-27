package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.base.Buttons
import com.example.customlibrary.button.ButtonUtils.txtColor
import com.example.customlibrary.button.ButtonUtils.txtSize

class LongPrimaryStartIcon(context: Context, attr: AttributeSet) : Buttons(context, attr) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        setIconTintResource(R.color.white)
        commonAttr()
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        setIconTintResource(R.color.white)
        commonAttr()
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        setIconTintResource(R.color.disabled_text)
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
        textSize = txtSize(context = context,sp = ButtonUtils.TextSize.LARGE)
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
        iconGravity = ICON_GRAVITY_TEXT_START
        iconSize = ButtonUtils.Icon.SIZE
        iconPadding = ButtonUtils.Icon.PADDING
        ContextThemeWrapper(context, R.style.button1)
        invalidate()

    }
}