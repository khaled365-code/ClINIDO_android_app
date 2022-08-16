package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class logoActivity : AppCompatActivity() {
    lateinit var stbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)
        stbutton=findViewById(R.id.stbutton)
        stbutton.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)

            Toast.makeText(this,"Welcome to our application",Toast.LENGTH_LONG).show()

        }
    }
}