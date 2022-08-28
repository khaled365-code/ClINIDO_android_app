package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityCashOrVisaBinding

class Cash_or_visa_Activity : AppCompatActivity() {

    lateinit var binding:ActivityCashOrVisaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCashOrVisaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.visaPayment.setOnClickListener {

            var intent:Intent=Intent(this,Confirm_visa_information_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Pleas fill all your visa information",Toast.LENGTH_LONG).show()
        }


        binding.cashPayment.setOnClickListener {

            var intent:Intent=Intent(this,Exit_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"See you in the clinic",Toast.LENGTH_LONG).show()
        }


    }
}