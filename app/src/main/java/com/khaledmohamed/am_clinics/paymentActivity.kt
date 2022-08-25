package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class paymentActivity : AppCompatActivity() {

    lateinit var chcash_btn:Button
    lateinit var chvisa_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment2)

        chcash_btn=findViewById(R.id.chcash_btn)
        chvisa_btn=findViewById(R.id.chvisa_btn)

        chcash_btn.setOnClickListener{
            var intent= Intent(this,manaractivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"See you in the clinic goodbye",Toast.LENGTH_LONG).show()

        }


        chvisa_btn.setOnClickListener{

            var intent= Intent(this,visaActivity2::class.java)
            startActivity(intent)
            Toast.makeText(this,"please fill your visa information",Toast.LENGTH_LONG).show()

        }
    }
}