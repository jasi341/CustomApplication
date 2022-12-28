package com.example.customlibrary

import android.content.Context
import android.content.DialogInterface
import android.util.AttributeSet
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.google.android.material.dialog.MaterialAlertDialogBuilder


//declared a class inherited form material dialog builder
class Dialog(private val mContext: Context, attrs: AttributeSet) :
    MaterialAlertDialogBuilder(mContext) {

    private val a = context.obtainStyledAttributes(attrs,R.styleable.Dialog)

    //declared a method to show dialog
    fun showDialog() {

        //Custom title of dialog
        val title = a.getString(R.styleable.Dialog_dialogTitle)
        setTitle(title)

        //Custom message of dialog
        val message = a.getString(R.styleable.Dialog_dialogMessage)
        setMessage(message)


        //Custom background for positive button of dialog
        val positiveButtonBackground = getDrawable(mContext,R.drawable.btn_gredient)
        setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
            // do something
        }).setPositiveButtonIcon(positiveButtonBackground)

        //set negative button of dialog
        setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
            //do something
        }
        //set neutral button of dialog
        setNeutralButton("Cancel") { dialogInterface: DialogInterface, i: Int ->
            //do something
        }
        //show dialog
        show()
    }
}
//class Dialog(context :Context,attrs: AttributeSet)
//    : MaterialAlertDialogBuilder(context)
//    //MaterialDialogs{
//{
//    private val a = context.obtainStyledAttributes(attrs,R.styleable.Dialog)
//    //set the title
//    override fun setTitle(title: CharSequence?): MaterialAlertDialogBuilder {
//        val b = a.getString(R.styleable.Dialog_dialogTitle)
//        setTitle(b)
//        return super.setTitle(b)
//    }
//
//    override fun setPositiveButton(
//        text: CharSequence?,
//        listener: DialogInterface.OnClickListener?
//    ): MaterialAlertDialogBuilder {
//
//
//        val positiveButtonText = a.getString(R.styleable.Dialog_dialogPositiveButton)
//        setPositiveButton(positiveButtonText,listener)
//        return super.setPositiveButton(positiveButtonText, listener)
//
//    }
//
//    override fun setPositiveButtonIcon(icon: Drawable?): MaterialAlertDialogBuilder {
//        val positiveButtonIcon = a.getDrawable(R.styleable.Dialog_dialogPositiveButtonIcon)
//        setPositiveButtonIcon(positiveButtonIcon)
//        return super.setPositiveButtonIcon(icon)
//    }

//}