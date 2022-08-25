package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Confirm_visa_information_Activity : AppCompatActivity() {

    lateinit var visaconfirm_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_visa_inf)

        visaconfirm_btn=findViewById(R.id.visaconfirm_btn)

        visaconfirm_btn.setOnClickListener{

            var intent= Intent(this,manaractivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"You payed successfully",Toast.LENGTH_LONG).show()

        }



    }
}