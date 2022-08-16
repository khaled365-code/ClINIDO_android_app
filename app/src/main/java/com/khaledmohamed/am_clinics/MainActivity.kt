package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn_signup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_signup=findViewById(R.id.btn_signup)
        btn_signup.setOnClickListener {
            var intent=Intent(this,VerificationActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"please enter the code sent to your mobile",Toast.LENGTH_LONG).show()

        }
    }
}