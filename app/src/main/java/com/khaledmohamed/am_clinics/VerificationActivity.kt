package com.khaledmohamed.am_clinics

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.khaledmohamed.am_clinics.databinding.ActivityVerificationBinding

class VerificationActivity : AppCompatActivity() {
    lateinit var binding:ActivityVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
           if(!binding.verifiCodesent.text.isNullOrEmpty())
           {
               var intent = Intent(this, khaledActivity1::class.java)
               Toast.makeText(this, "correct code", Toast.LENGTH_LONG).show()
               startActivity(intent)

           }
            else
           {
               Toast.makeText(this, "You should enter the code sent to your mobile", Toast.LENGTH_LONG).show()
           }
        }
    }
}