package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class VerificationActivity : AppCompatActivity() {
    lateinit var btn_continue:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        btn_continue=findViewById(R.id.btn_continue)
        btn_continue.setOnClickListener {
            var intent=Intent(this,khaledActivity1::class.java)
            startActivity(intent)
            Toast.makeText(this,"correct code",Toast.LENGTH_LONG).show()
        }
    }
}