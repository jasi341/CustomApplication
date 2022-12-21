package com.example.customlibrary.button

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.example.customlibrary.R
import com.example.customlibrary.Utils
import com.example.customlibrary.base.Buttons

class ShortPrimaryWithoutIcon(context: Context, attrs: AttributeSet) : Buttons(context, attrs) {

    override fun setNeutral() {
        textSize = Utils.txtSize(context = context, sp = 40f)
        setBackgroundResource(R.drawable.btn_gredient)
        commonAttr()
    }

    override fun setClicked() {
        textSize = Utils.txtSize(context = context, sp = 40f)
        setBackgroundResource(R.drawable.btn_clicked)
        commonAttr()
    }

    override fun setDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        textSize = Utils.txtSize(context = context, sp = 40f)
        commonAttr(R.color.disabled_text)
    }

    private fun commonAttr(txtColor: Int? = null) {
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