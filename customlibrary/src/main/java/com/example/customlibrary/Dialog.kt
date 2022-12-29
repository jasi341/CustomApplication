package com.example.customlibrary

import android.content.Context
import android.content.DialogInterface
import android.graphics.drawable.Drawable
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder


//declared a class inherited form material dialog builder
class Dialog(mContext: Context) : MaterialAlertDialogBuilder(mContext) {

    //method to show dialog
    fun showDialog() {
        ContextThemeWrapper(this.context,R.style.AlertDialogCustom)
        android.view.ContextThemeWrapper(this.context,R.style.MaterialAlertDialog)
        show()

    }

    //method to set title
    fun setDialogTitle(title: String) {
        setTitle(title)
        setDialogBackground()
    }

    //method to set message
    fun setDialogMessage(message: String) {
        setMessage(message)
    }

    //method to set positive button
    fun setCancelableDialog(boolean: Boolean) {
        setCancelable(boolean)
    }

    //method to set positive button
    fun setPositiveButtonDialog(text: String, listener: DialogInterface.OnClickListener) {
        setPositiveButton(text, listener)
    }

    //method to set negative button
    fun setNegativeButtonDialog(text: String, listener: DialogInterface.OnClickListener) {
        setNegativeButton(text, listener)
    }

    //method to set dialog background
    fun setDialogBackground(drawable: Drawable? = null) {
         val backgroundDrawable = ContextCompat.getDrawable(context, R.drawable.white_back_dialog)
        background = drawable ?: backgroundDrawable

    }

}

