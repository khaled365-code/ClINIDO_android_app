package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
             var intent = Intent(this, khaledActivity1::class.java)
             intent.putExtra("username",binding.edtUsername.text.toString())
             startActivity(intent)
             Toast.makeText(this, "you logged successfully", Toast.LENGTH_LONG).show()
             finish()

         }else
         {
             Toast.makeText(this, "you should enter your name and password", Toast.LENGTH_LONG).show()

         }
        }
        binding.btnCreate.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"fill all following required information",Toast.LENGTH_LONG).show()
        }

    }
}