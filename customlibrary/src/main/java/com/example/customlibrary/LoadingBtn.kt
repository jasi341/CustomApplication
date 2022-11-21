package com.example.customlibrary

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.airbnb.lottie.LottieAnimationView

class LoadingBtn(private var mContext: Context, attrs:AttributeSet):LottieAnimationView(mContext,attrs) {

    fun loadingPrimaryBtn(){
        setBackgroundResource(R.drawable.btn_clicked)
        playAnimation()
        ContextThemeWrapper(mContext, R. style.button1)
        loop(true)
    }

    fun loadingSecondaryBtn(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        playAnimation()
        ContextThemeWrapper(mContext, R. style.button1)
        loop(true)
    }

    fun loadingSecondaryBtnGray(){
        setBackgroundResource(R.drawable.btn_ui_sec_short_gray)
        playAnimation()
        ContextThemeWrapper(mContext, R. style.button1)
        loop(true)
    }

}