package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.Utils
import com.example.customlibrary.base.Buttons

class SecondaryTailIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setIconTintResource(R.color.orange)
        commonAttr(context, R.color.orange)
    }

    override fun setClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setIconTintResource(R.color.orange)
        commonAttr(context, R.color.orange)
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setIconTintResource(R.color.disabled_text)
        commonAttr(context, R.color.disabled_text)
    }

    private fun commonAttr(context: Context, txtColor: Int? = null) {
        textSize = Utils.txtSize(context = context, sp = 40f)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        iconGravity = ICON_GRAVITY_TEXT_END
        iconSize = 52
        iconPadding = 5
        if (txtColor != null) {
            setTextColor(
                Utils.txtColor(
                    color = txtColor,
                    context = context,
                    typedArray = typedArray
                )
            )
        } else {
            setTextColor(Utils.txtColor(context = context, typedArray = typedArray))
        }
        ContextThemeWrapper(context, R.style.button1)
        invalidate()

    }
}