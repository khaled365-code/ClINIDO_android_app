package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener{
         if(!binding.edtUsername.text.isNullOrEmpty() && !binding.edtPassword.text.isNullOrEmpty())
         {
             var intent = Intent(this, select_service_Activity::class.java)
             startActivity(intent)
             finish()

         }else
         {
             Toast.makeText(this, "you should enter your name and password", Toast.LENGTH_LONG).show()

         }
        }
        binding.btnCreate.setOnClickListener {
            var intent=Intent(this,Signup_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"fill all following required information",Toast.LENGTH_LONG).show()
        }

    }
}