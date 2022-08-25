package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Cash_or_visa_Activity : AppCompatActivity() {

    lateinit var chcash_btn:Button
    lateinit var chvisa_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cash_or_visa)

        chcash_btn=findViewById(R.id.chcash_btn)
        chvisa_btn=findViewById(R.id.chvisa_btn)

        chcash_btn.setOnClickListener{
            var intent= Intent(this,manaractivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"See you in the clinic goodbye",Toast.LENGTH_LONG).show()

        }


        chvisa_btn.setOnClickListener{

            var intent= Intent(this,Confirm_visa_information_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"please fill your visa information",Toast.LENGTH_LONG).show()

        }
    }
}