package com.example.customlibrary

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

class MaterialButtons(private var mContext: Context, attrs:AttributeSet) : MaterialButton(mContext,attrs) {

    //Neutral Primary button Long
    fun primaryButtonLongNeutral() {
        setBackgroundResource(R.drawable.btn_gredient)
        textSize = 16f
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( ContextCompat.getColor(mContext,R.color.white))
        ContextThemeWrapper(mContext, R. style.button1)
        invalidate()
    }

    //Clicked Primary button Long
    fun primaryButtonLongClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        textSize = 16f
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( ContextCompat.getColor(mContext,R.color.white))
        ContextThemeWrapper(mContext, R. style.button1)
        invalidate()
    }

    //Disabled Primary button Long
    fun primaryButtonLongDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        textSize = 16f
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }


    //Neutral Primary button long icon
    fun primaryButtonLongIconNeutral(){
        setTextColor( ContextCompat.getColor(mContext,R.color.white))
        setBackgroundResource(R.drawable.btn_gredient)
        ContextThemeWrapper(mContext, R. style.button1)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 16f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Primary button long icon
    fun primaryButtonLongIconClicked(){
        setTextColor(ContextCompat.getColor(mContext,R.color.white))
        setBackgroundResource(R.drawable.btn_clicked)
        ContextThemeWrapper(mContext, R. style.button1)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 16f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long icon
    fun primaryButtonLongIconDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 16f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }

    //Neutral Primary button long tail icon
    fun primaryButtonLongTailIconNeutral(){
        setBackgroundResource(R.drawable.btn_gredient)
        ContextThemeWrapper(mContext, R. style.button1)
        setTextColor(ContextCompat.getColor(mContext,R.color.white))
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 16f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //CLicked Primary button long tail icon
    fun primaryButtonLongTailIconClicked(){
        setBackgroundResource(R.drawable.btn_clicked)
        setTextColor(ContextCompat.getColor(mContext,R.color.white))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 16f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long tail icon
    fun primaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 16f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode= null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }

    //Neutral Secondary button long
    fun secondaryButtonLongNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setTextColor( ContextCompat.getColor(mContext,R.color.orange))
        textSize = 14f
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Secondary button long
    fun secondaryButtonLongClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textSize = 14f
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //DisabledSecondary button long
    fun secondaryButtonLongDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        textSize = 14f
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral secondary button long icon
    fun secondaryButtonLongIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked secondary button long icon
    fun secondaryButtonLongIconClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
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
        setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        iconGravity = ICON_GRAVITY_TEXT_START
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
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
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
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
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        iconGravity = ICON_GRAVITY_TEXT_END
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
        iconSize  = 52
        iconPadding = 5
        backgroundTintMode = null
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //can be used for Neutral and clicked of tertiary buttons
    fun tertiaryButtonNeutral(){
       // setBackgroundColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = 14f
        //transparent background
        ContextThemeWrapper(mContext, R. style.button1)
        background= null
        backgroundTintMode = null
        setTextColor( ContextCompat.getColor(mContext,R.color.orange))
        invalidate()
    }
    // disabled tertiary Button
    fun tertiaryButtonDisabled(){
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = 14f
        background= null
        backgroundTintMode = null
        ContextThemeWrapper(mContext, R. style.button1)
        setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()

    }

    //primary Button short neutral
    fun primaryButtonShortNeutral(){
        setTextColor( ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 16f
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_gredient)
        invalidate()
    }

    //Clicked Primary button short
    fun primaryButtonShortClicked() {
        setTextColor(ContextCompat.getColor(mContext,R.color.white))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 16f
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_clicked)
        invalidate()
    }

    //Disabled Primary button short
    fun primaryButtonShortDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 16f
        backgroundTintMode = null
        setTextColor(ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }

    //Neutral secondary button short
    fun secondaryButtonShortNeutral() {
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_sec_neutral)
        invalidate()
    }

    //Clicked secondary button short
    fun secondaryButtonShortClicked(){
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_sec_clicked)
        invalidate()
    }

    //Disabled secondary button short
    fun secondaryButtonShortDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = 14f
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        setTextColor( ContextCompat.getColor(mContext,R.color.disabled_text))
        invalidate()
    }

    //Secondary button short gray
    fun secondaryButtonShortGrayNeutral(){
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        ContextThemeWrapper(mContext, R. style.button1)
        textSize = 14f
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_ui_sec_short_gray)
        invalidate()
    }

    //Secondary button short gray clicked
    fun secondaryButtonShortGrayClicked(){
        setTextColor(ContextCompat.getColor(mContext,R.color.orange))
        textAlignment = TEXT_ALIGNMENT_CENTER
        textSize = 14f
        ContextThemeWrapper(mContext, R. style.button1)
        backgroundTintMode = null
        setBackgroundResource(R.drawable.btn_ui_sec_gray_clicked)
        invalidate()
    }

}