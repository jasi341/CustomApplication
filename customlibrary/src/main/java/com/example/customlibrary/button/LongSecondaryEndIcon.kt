package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.base.Buttons

class LongSecondaryEndIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setIconTintResource(R.color.orange)
        commonAttr(R.color.orange)
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setIconTintResource(R.color.orange)
        commonAttr(R.color.orange)
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setIconTintResource(R.color.disabled_text)
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
        textSize = ButtonUtils.txtSize(context = context, sp = ButtonUtils.TextSize.SMALL)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        iconGravity = ICON_GRAVITY_TEXT_END
        iconSize = ButtonUtils.Icon.SIZE
        iconPadding = ButtonUtils.Icon.PADDING
        if (txtColor != null) {
            setTextColor(
                ButtonUtils.txtColor(
                    color = txtColor, context = context, typedArray = typedArray
                )
            )
        } else {
            setTextColor(ButtonUtils.txtColor(context = context, typedArray = typedArray))
        }
        ContextThemeWrapper(context, R.style.button1)
        invalidate()

    }
}