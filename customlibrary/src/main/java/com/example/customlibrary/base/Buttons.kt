package com.example.customlibrary.base

import android.content.Context
import android.util.AttributeSet
import com.example.customlibrary.R
import com.google.android.material.button.MaterialButton

open class Buttons(context: Context, attrs: AttributeSet) : MaterialButton(context, attrs) {
    protected val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Buttons)

    open fun setNeutral() {

    }

    open fun setClicked() {

    }

    open fun setDisabled() {

    }

    open fun setLoading(){

    }

}