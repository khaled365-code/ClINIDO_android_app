package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var btn_login:Button
    lateinit var btn_create:Button
    lateinit var edt_name: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login=findViewById(R.id.btn_login)
        btn_create=findViewById(R.id.btn_create)
        btn_login.setOnClickListener {
            var intent=Intent(this,khaledActivity1::class.java)
            startActivity(intent)
            Toast.makeText(this,"you logged successfully",Toast.LENGTH_LONG).show()
        }
        btn_create.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"fill all following required information",Toast.LENGTH_LONG).show()
        }

    }
}