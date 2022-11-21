package com.example.customapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customapplication.databinding.ActivityIconsButtonBinding


class IconsButtonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIconsButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIconsButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Primary Button long
        binding.btn1.primaryButtonLongNeutral()
        binding.btn2.primaryButtonLongClicked()
        binding.btn3.primaryButtonLongDisabled()
        binding.ld1.loadingPrimaryBtn()

        //Primary Button Long Icon
        binding.btn4.primaryButtonLongIconNeutral()
        binding.btn5.primaryButtonLongIconClicked()
        binding.btn6.primaryButtonLongIconDisabled()
        binding.ld2.loadingPrimaryBtn()

        //Primary Button Long Tail Icon
        binding.btn7.primaryButtonLongTailIconNeutral()
        binding.btn8.primaryButtonLongTailIconClicked()
        binding.btn9.primaryButtonLongTailIconDisabled()
        binding.ld3.loadingPrimaryBtn()

        //Secondary Button Long
        binding.btn10.secondaryButtonLongNeutral()
        binding.btn11.secondaryButtonLongClicked()
        binding.btn12.secondaryButtonLongDisabled()
        binding.ld4.loadingSecondaryBtn()

        //Secondary Button Long Icon
        binding.btn13.secondaryButtonLongIconNeutral()
        binding.btn14.secondaryButtonLongIconClicked()
        binding.btn15.secondaryButtonLongIconDisabled()
        binding.ld5.loadingSecondaryBtn()

        //Secondary Button long Tail Icon
        binding.btn16.secondaryButtonLongTailIconNeutral()
        binding.btn17.secondaryButtonLongTailIconClicked()
        binding.btn18.secondaryButtonLongTailIconDisabled()
        binding.ld6.loadingSecondaryBtn()

        //tertiary Button
        binding.btn19.tertiaryButtonNeutral()
        binding.btn20.tertiaryButtonNeutral()
        binding.btn21.tertiaryButtonDisabled()


        //primary Button short
        binding.btn22.primaryButtonShortNeutral()
        binding.btn23.primaryButtonShortClicked()
        binding.btn24.primaryButtonShortDisabled()
        binding.ld7.loadingPrimaryBtn()


        //secondary Buttons Short
        binding.btn25.secondaryButtonShortNeutral()
        binding.btn26.secondaryButtonShortClicked()
        binding.btn27.secondaryButtonShortDisabled()
        binding.ld8.loadingSecondaryBtn()

        //secondary Button Short Grey
        binding.btn28.secondaryButtonShortGrayNeutral()
        binding.btn29.secondaryButtonShortGrayClicked()
        binding.ld9.loadingSecondaryBtnGray()








    }
}