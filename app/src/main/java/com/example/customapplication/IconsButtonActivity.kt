package com.example.customapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customapplication.databinding.ActivityIconsButtonBinding


class IconsButtonActivity : AppCompatActivity() {

    private var _binding: ActivityIconsButtonBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       _binding = ActivityIconsButtonBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        binding.apply {
            //Primary Button long
            btn1.setNeutral()
            btn2.setClicked()
            btn3.setDisabled()
            ld1.loadingPrimaryBtn()

            //Primary Button Long Icon
            btn4.setNeutral()
            btn5.setClicked()
            btn6.setDisabled()
            ld2.loadingPrimaryBtn()

            //Primary Button Long Tail Icon
            btn7.setNeutral()
            btn8.setClicked()
            btn9.setDisabled()
            ld3.loadingPrimaryBtn()

            //Secondary Button Long
            btn10.setNeutral()
            btn11.setClicked()
            btn12.setDisabled()
            ld4.loadingSecondaryBtn()

            //Secondary Button Long Icon
            btn13.setNeutral()
            btn14.setClicked()
            btn15.setDisabled()
            ld5.loadingSecondaryBtn()

            //Secondary Button long Tail Icon
            btn16.setNeutral()
            btn17.setClicked()
            btn18.setDisabled()
            ld6.loadingSecondaryBtn()

            //tertiary Button
            btn19.setNeutral()
            btn20.setNeutral()
            btn21.setDisabled()

            //primary Button short
            btn22.setNeutral()
            btn23.setClicked()
            btn24.setDisabled()
            ld7.loadingPrimaryBtn()

            //secondary Buttons Short
            btn25.setNeutral()
            btn26.setClicked()
            btn27.setDisabled()


            //secondary Button Short Grey
            btn28.setNeutral()
            btn29.setClicked()
            ld9.loadingSecondaryBtnGray()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}