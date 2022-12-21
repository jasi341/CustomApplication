package com.example.customlibrary

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

class MaterialButtons(private var mContext: Context, attrs: AttributeSet) :
    MaterialButton(mContext, attrs) {

    private val a = mContext.obtainStyledAttributes(attrs, R.styleable.MaterialButtons)

    // Default Value = 50f
    private fun txtSizeHelper(sp: Float = 50f): Float {
        return (sp / resources.displayMetrics.density)
    }

    // Default color = White
    private fun txtColorHelper(color: Int = R.color.white): Int {
        return a.getColor(
            R.styleable.MaterialButtons_FontColor,
            ContextCompat.getColor(mContext, color)
        )
    }

    //Neutral Primary button Long
    fun primaryButtonLongNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        textSize = txtSizeHelper()
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor(txtColorHelper())
        ContextThemeWrapper(mContext, R.style.button1)
        invalidate()
    }

    //Clicked Primary button Long
    fun primaryButtonLongClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        textSize = txtSizeHelper()
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor(txtColorHelper())
        ContextThemeWrapper(mContext, R.style.button1)
        invalidate()
    }

    //Disabled Primary button Long
    fun primaryButtonLongDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        textSize = txtSizeHelper()
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor(txtColorHelper(R.color.disabled_text))
        ContextThemeWrapper(mContext, R.style.button1)
        invalidate()
    }

    //Neutral Primary button long icon
    fun primaryButtonLongIconNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        ContextThemeWrapper(mContext, R.style.button1)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = txtSizeHelper()
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        setTextColor(txtColorHelper())
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Primary button long icon
    fun primaryButtonLongIconClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        ContextThemeWrapper(mContext, R.style.button1)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = txtSizeHelper()
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setTextColor(txtColorHelper())
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long icon
    fun primaryButtonLongIconDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper()
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        setTextColor(txtColorHelper(R.color.disabled_text))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral Primary button long tail icon
    fun primaryButtonLongTailIconNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        ContextThemeWrapper(mContext, R.style.button1)
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = txtSizeHelper()
        iconSize = 52
        iconPadding = 5
        setTextColor(txtColorHelper())
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //CLicked Primary button long tail icon
    fun primaryButtonLongTailIconClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper()
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        setTextColor(txtColorHelper())
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long tail icon
    fun primaryButtonLongTailIconDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper()
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor(txtColorHelper(R.color.disabled_text))
        invalidate()
    }

    //Neutral Secondary button long
    fun secondaryButtonLongNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        textSize = txtSizeHelper(40f)
        ContextThemeWrapper(mContext, R.style.button1)
        backgroundTintMode = null
        setTextColor(txtColorHelper(R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Secondary button long
    fun secondaryButtonLongClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        textSize = txtSizeHelper(40f)
        ContextThemeWrapper(mContext, R.style.button1)
        backgroundTintMode = null
        setTextColor(txtColorHelper(R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //DisabledSecondary button long
    fun secondaryButtonLongDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        textSize = txtSizeHelper(40f)
        ContextThemeWrapper(mContext, R.style.button1)
        backgroundTintMode = null
        setTextColor(txtColorHelper(R.color.disabled_text))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral secondary button long icon
    fun secondaryButtonLongIconNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        setTextColor(txtColorHelper(R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked secondary button long icon
    fun secondaryButtonLongIconClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R.style.button1)
        setTextColor(txtColorHelper(R.color.orange))
        textSize = txtSizeHelper(40f)
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongIconDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setTextColor(txtColorHelper(R.color.disabled_text))
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral secondary button long tail icon
    fun secondaryButtonLongTailIconNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setTextColor(txtColorHelper(R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //CLicked secondary button long icon
    fun secondaryButtonLongTailIconClicked() {
        setBackgroundResource(R.drawable.btn_sec_clicked)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        setTextColor(txtColorHelper(R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongTailIconDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        iconSize = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        setTextColor(txtColorHelper(R.color.disabled_text))
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //can be used for Neutral and clicked of tertiary buttons
    fun tertiaryButtonNeutral() {
        // setBackgroundColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = txtSizeHelper(40f)
        ContextThemeWrapper(mContext, R.style.button1)
        background = null
        backgroundTintMode = null
        setTextColor(txtColorHelper(R.color.orange))
        invalidate()
    }

    // disabled tertiary Button
    fun tertiaryButtonDisabled() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = txtSizeHelper(40f)
        background = null
        backgroundTintMode = null
        ContextThemeWrapper(mContext, R.style.button1)
        setTextColor(txtColorHelper(R.color.disabled_text))
        invalidate()
    }

    //primary Button short neutral
    fun primaryButtonShortNeutral() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_gredient)
        setTextColor(txtColorHelper())
        invalidate()
    }

    //Clicked Primary button short
    fun primaryButtonShortClicked() {
        //setTextColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(50f)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_clicked)
        setTextColor(txtColorHelper())
        invalidate()
    }

    //Disabled Primary button short
    fun primaryButtonShortDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(50f)
        backgroundTintMode = null
        setTextColor(txtColorHelper(R.color.disabled_text))
        invalidate()
    }

    //Neutral secondary button short
    fun secondaryButtonShortNeutral() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setTextColor(txtColorHelper(R.color.orange))
        invalidate()
    }

    //Clicked secondary button short
    fun secondaryButtonShortClicked() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setTextColor(txtColorHelper(R.color.orange))
        invalidate()
    }

    //Disabled secondary button short
    fun secondaryButtonShortDisabled() {
        setBackgroundResource(R.drawable.btn_sec_disabled)
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = txtSizeHelper(40f)
        ContextThemeWrapper(mContext, R.style.button1)
        backgroundTintMode = null
        setTextColor(txtColorHelper(R.color.disabled_text))
        invalidate()
    }

    //Secondary button short gray
    fun secondaryButtonShortGrayNeutral() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R.style.button1)
        textSize = txtSizeHelper(40f)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_ui_sec_short_gray)
        setTextColor(txtColorHelper(R.color.orange))
        invalidate()
    }

    //Secondary button short gray clicked
    fun secondaryButtonShortGrayClicked() {
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = txtSizeHelper(40f)
        ContextThemeWrapper(mContext, R.style.button1)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_ui_sec_gray_clicked)
        setTextColor(txtColorHelper(R.color.orange))
        invalidate()
    }

    //can be used for Neutral and clicked of tertiary buttons
    fun errorMessage() {
        textAlignment = TEXT_ALIGNMENT_TEXT_START
        textSize = txtSizeHelper(35f)
        ContextThemeWrapper(mContext, R.style.button1)
        background = null
        backgroundTintMode = null
        val text = resources.getText(R.string.error_message, "Invalid Input")
        setText(text)

        val iconDrawable = a.getDrawable(R.styleable.MaterialButtons_Icon)
        iconDrawable?.setTint(ContextCompat.getColor(mContext, R.color.error_text))
        icon = iconDrawable

        if (iconDrawable == null) {
            icon = ContextCompat.getDrawable(mContext, R.drawable.ui_warning)
        }
        iconSize = 45
        isAllCaps = false

        //set Margin
        val marginTop = a.getDimension(R.styleable.MaterialButtons_MarginTop, -10f)
        setPadding(0, marginTop.toInt(), 0, 0)

        iconPadding = mContext.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._4sdp)
        iconSize = mContext.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._12sdp)
        iconTint = ColorStateList.valueOf(ContextCompat.getColor(mContext, R.color.error_text))
        setTextColor(txtColorHelper(R.color.error_text))
        invalidate()
    }

}