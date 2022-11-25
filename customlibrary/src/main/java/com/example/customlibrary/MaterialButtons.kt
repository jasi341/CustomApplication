package com.example.customlibrary

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.internal.ViewUtils.dpToPx

class MaterialButtons(private var mContext: Context, attrs:AttributeSet) : MaterialButton(mContext,attrs) {

    private val a = mContext.obtainStyledAttributes(attrs,R.styleable.MaterialButtons)

    //Neutral Primary button Long
    fun primaryButtonLongNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        //  setTextColor( ContextCompat.getColor(mContext,R.color.white))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        ContextThemeWrapper(mContext, R. style.button1)
        invalidate()

    }

    //Clicked Primary button Long
    fun primaryButtonLongClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        // setTextColor( ContextCompat.getColor(mContext,R.color.white))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        ContextThemeWrapper(mContext, R. style.button1)
        invalidate()
    }

    //Disabled Primary button Long
    fun primaryButtonLongDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        //setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        invalidate()
    }


    //Neutral Primary button long icon
    fun primaryButtonLongIconNeutral(){
        //  setTextColor( ContextCompat.getColor(mContext,R.color.white))
        setBackgroundResource(R.drawable.btn_gredient)
        ContextThemeWrapper(mContext, R. style.button1)
        iconGravity = ICON_GRAVITY_TEXT_START
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Primary button long icon
    fun primaryButtonLongIconClicked(){
        //  setTextColor(ContextCompat.getColor(mContext,R.color.white))
        setBackgroundResource(R.drawable.btn_clicked)
        ContextThemeWrapper(mContext, R. style.button1)
        iconGravity = ICON_GRAVITY_TEXT_START
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long icon
    fun primaryButtonLongIconDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        //setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }

    //Neutral Primary button long tail icon
    fun primaryButtonLongTailIconNeutral(){
        setBackgroundResource(R.drawable.btn_gredient)
        ContextThemeWrapper(mContext, R. style.button1)
        // setTextColor(ContextCompat.getColor(mContext,R.color.white))
        iconGravity = ICON_GRAVITY_TEXT_END
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //CLicked Primary button long tail icon
    fun primaryButtonLongTailIconClicked(){
        setBackgroundResource(R.drawable.btn_clicked)
        //  setTextColor(ContextCompat.getColor(mContext,R.color.white))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long tail icon
    fun primaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode= null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        //  setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }

    //Neutral Secondary button long
    fun secondaryButtonLongNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        //  setTextColor( ContextCompat.getColor(mContext,R.color.orange))
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Secondary button long
    fun secondaryButtonLongClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        // setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        //textSize = 14f
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //DisabledSecondary button long
    fun secondaryButtonLongDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        // setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
       // textSize = 14f
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral secondary button long icon
    fun secondaryButtonLongIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        //setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked secondary button long icon
    fun secondaryButtonLongIconClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        // setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        // setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral secondary button long tail icon
    fun secondaryButtonLongTailIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        //setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //CLicked secondary button long icon
    fun secondaryButtonLongTailIconClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        //setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        //setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //can be used for Neutral and clicked of tertiary buttons
    fun tertiaryButtonNeutral(){
        // setBackgroundColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        background= null
        backgroundTintMode = null
        //setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        invalidate()
    }
    // disabled tertiary Button
    fun tertiaryButtonDisabled(){
        textAlignment = TEXT_ALIGNMENT_CENTER
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        background= null
        backgroundTintMode = null
        ContextThemeWrapper(mContext, R. style.button1)
        //setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        invalidate()

    }

    //primary Button short neutral
    fun primaryButtonShortNeutral(){
        //setTextColor( ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_gredient)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        invalidate()
    }

    //Clicked Primary button short
    fun primaryButtonShortClicked() {
        //setTextColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_clicked)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.white))
        setTextColor(fontColor)
        invalidate()
    }

    //Disabled Primary button short
    fun primaryButtonShortDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 50f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        // setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        invalidate()
    }

    //Neutral secondary button short
    fun secondaryButtonShortNeutral() {
        //setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_sec_neutral)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        invalidate()
    }

    //Clicked secondary button short
    fun secondaryButtonShortClicked(){
        // setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_sec_clicked)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        invalidate()
    }

    //Disabled secondary button short
    fun secondaryButtonShortDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        textAlignment = TEXT_ALIGNMENT_CENTER
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        // setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.disabled_text))
        setTextColor(fontColor)
        invalidate()
    }

    //Secondary button short gray
    fun secondaryButtonShortGrayNeutral(){
        // setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_ui_sec_short_gray)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        invalidate()
    }

    //Secondary button short gray clicked
    fun secondaryButtonShortGrayClicked(){
        //setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        val sp = 40f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_ui_sec_gray_clicked)
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.orange))
        setTextColor(fontColor)
        invalidate()
    }

    //can be used for Neutral and clicked of tertiary buttons
    fun errorMessage(){
        // setBackgroundColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment  = TEXT_ALIGNMENT_TEXT_START
        val sp = 35f
        val dp = sp / resources.displayMetrics.density
        textSize = dp
        ContextThemeWrapper(mContext, R. style.button1)
        background= null
        backgroundTintMode = null
        val text = a.resources.getText(R.string.error_message,"Invalid Input")
        setText(text)

        val iconDrawable = a.getDrawable(R.styleable.MaterialButtons_Icon)
        iconDrawable?.setTint(ContextCompat.getColor(mContext,R.color.error_text))
        icon = iconDrawable

        if(iconDrawable==null){
            icon = ContextCompat.getDrawable(mContext,R.drawable.ui_warning)
        }
        iconSize = 45
        isAllCaps = false

        //set Margin
        val marginTop = a.getDimension(R.styleable.MaterialButtons_MarginTop,-10f)
        setPadding(0,marginTop.toInt(),0,0)

        iconPadding =  mContext.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._4sdp)

        iconSize = mContext.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._12sdp)

        iconTint = ColorStateList.valueOf(ContextCompat.getColor(mContext,R.color.error_text))
        val fontColor = a.getColor(R.styleable.MaterialButtons_FontColor,ContextCompat.getColor(mContext,R.color.error_text))
        setTextColor(fontColor)
        invalidate()
    }

}