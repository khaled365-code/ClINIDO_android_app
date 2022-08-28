package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Doctor_details_Activity : AppCompatActivity() {

    lateinit var baymoney_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_appointment_details)
        baymoney_btn=findViewById(R.id.baymoney_btn)
        baymoney_btn.setOnClickListener{

            var intent= Intent(this,Cash_or_visa_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"How Do you want to pay?",Toast.LENGTH_LONG).show()

        }


    }
}