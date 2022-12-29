package com.example.customapplication


import android.content.Intent
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.customapplication.databinding.ActivityInputFieldsBinding
import com.example.customlibrary.Dialog

class InputFieldsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputFieldsBinding
    private lateinit var dialog: Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputFieldsBinding.inflate(layoutInflater)
        dialog = Dialog(this)


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
        binding.button3.setOnClickListener {

            dialog.setDialogTitle("This is a title")
            dialog.setDialogMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus luctus fermentum magna vel facilisis. Praesent hendrerit tempor ante, vitae congue nisi efficitur non. Curabitur volutpat lobortis orci. Pellentesque ultricies, nisi quis rutrum laoreet, mi dui ultricies elit, sed molestie tortor enim sit amet dui. Etiam vitae neque a turpis ornare bibendum. Phasellus volutpat, neque quis tempus blandit, magna massa suscipit lorem, non fringilla lectus eros et dui. Maecenas in augue felis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Praesent sit amet dui id velit euismod scelerisque et eu dui. Cras eu urna nec nunc imperdiet faucibus")
            dialog.setCancelableDialog(false)

            dialog.setPositiveButtonDialog("OK") { _, _ ->
//                Toast.makeText(this, "OK button pressed", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,TransitionActivity::class.java))
            }
            dialog.setNegativeButtonDialog("Cancel") { dialog, _ ->
                Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
          // dialog.setDialogBackground(ContextCompat.getDrawable(this,R.drawable.ic_launcher_background))

            dialog.showDialog()
        }

        // make a custom dialog



    }
}