package com.example.customapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.customapplication.databinding.ActivityTransitionBinding

class TransitionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransitionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransitionBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn1.primaryButtonLongNeutral()

        //post delay of 5 sec after button is clicked

        binding.btn1.setOnClickListener {
            binding.btn1.primaryButtonLongClicked()


            binding.btn1.postDelayed({
                binding.btn2.loadingPrimaryBtn()
                binding.btn2.visibility = View.VISIBLE
                binding.btn1.visibility = View.GONE
            }, 200)

            binding.btn1.postDelayed({
                binding.btn1.visibility = android.view.View.VISIBLE
                binding.btn1.primaryButtonLongDisabled()
                binding.btn2.visibility= android.view.View.GONE
            }, 2000)
        }

        binding.btn.setOnClickListener{
            //start Icon buttons Activity
            startActivity(Intent(this,IconsButtonActivity::class.java))

        }

    }
}