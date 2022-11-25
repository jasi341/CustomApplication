package com.example.customlibrary

import android.content.Context
import android.os.Looper.loop
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.airbnb.lottie.LottieAnimationView

class LoadingBtn(private var mContext: Context, attrs:AttributeSet):LottieAnimationView(mContext,attrs) {

    fun loadingPrimaryBtn(){
        setBackgroundResource(R.drawable.btn_clicked)
        playAnimation()
        setAnimation(R.raw.loader)
        ContextThemeWrapper(mContext, R. style.button1)
        loop(true)
    }

    fun loadingSecondaryBtn(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        playAnimation()
        setAnimation(R.raw.loader2)
        ContextThemeWrapper(mContext, R. style.button1)
        loop(true)
    }

    fun loadingSecondaryBtnGray(){
        setBackgroundResource(R.drawable.btn_ui_sec_short_gray)
        playAnimation()
        setAnimation(R.raw.loader2)
        ContextThemeWrapper(mContext, R. style.button1)
        loop(true)
    }

}