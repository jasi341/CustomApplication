package com.example.customlibrary

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat


class ErrorField(private val mContext:Context,attributeSet: AttributeSet)
    :androidx.appcompat.widget.AppCompatTextView(mContext,attributeSet) {

    private val a = mContext.obtainStyledAttributes(attributeSet,R.styleable.ErrorField)

    fun ErrorMethod(){

//        val text =  a.getString(R.styleable.ErrorField_errorText)
//        setText(text)

        val errorTextSize= a.getDimension(R.styleable.ErrorField_errorTextSize,14f)
        textSize = errorTextSize

        val errorTextColor = a.getColor(R.styleable.ErrorField_errorTextColor,ContextCompat.getColor(mContext, R.color.error_text))
        setTextColor(errorTextColor)

        val errorIcon = a.getDrawable(R.styleable.ErrorField_errorIcon)

        if (errorIcon != null) {
            setCompoundDrawablesWithIntrinsicBounds(errorIcon,null,null,null)

        }
        // set margin of textView

        val errorIconColor = a.getColor(R.styleable.ErrorField_errorIconColor,ContextCompat.getColor(mContext,
            R.color.error_text
        ))




    }

}
