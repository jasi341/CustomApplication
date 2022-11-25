package com.example.customapplication


import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.customapplication.databinding.ActivityInputFieldsBinding
import java.util.logging.Logger

class InputFieldsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputFieldsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputFieldsBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // binding.errorLayout.ErrorMethod()
        binding.err.errorMessage()


        val mobilePattern = "[0-9]{10}"
        binding.button.setOnClickListener {

            val mobile =binding.textInputEditText.text.toString()

            if (mobile=="sjasmeet438@gmail.com" || mobile.isEmpty()){
                binding.textField.error =""
                binding.err.visibility = View.VISIBLE
//                binding.errorLayout.visibility = View.VISIBLE
//                binding.errorLayout.visibility = View.VISIBLE
                binding.textField.boxStrokeColor= ContextCompat.getColor(this,R.color.disabled)
            }
            if((mobile.matches(mobilePattern.toRegex()))){
                binding.textField.error=null
                binding.err.visibility = View.INVISIBLE
//                binding.errorLayout.visibility = View.GONE
//                binding.errorLayout.visibility = View.GONE
                binding.textField.boxStrokeColor= ContextCompat.getColor(this,R.color.stro)
                Toast.makeText(this,"Valid number" ,Toast.LENGTH_SHORT).show()
            }
        }
        binding.button2.setOnClickListener {
            startActivity(Intent(this,TransitionActivity::class.java))
        }
    }
}