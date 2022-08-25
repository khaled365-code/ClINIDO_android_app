package com.khaledmohamed.am_clinics

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.khaledmohamed.am_clinics.databinding.ActivityCodeVerificationBinding

class Verification_code_Activity : AppCompatActivity() {
    lateinit var binding:ActivityCodeVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCodeVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
           if(!binding.verifiCodesent.text.isNullOrEmpty())
           {
               var intent = Intent(this, select_service_Activity::class.java)
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