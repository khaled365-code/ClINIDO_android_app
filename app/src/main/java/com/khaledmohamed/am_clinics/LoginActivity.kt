package com.khaledmohamed.am_clinics

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding:ActivityLoginBinding
    lateinit var sharedpreferences:SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedpreferences=getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        binding.btnLogin.setOnClickListener{
            val name:String=binding.edtUsername.text.toString()
            val editor:SharedPreferences.Editor=sharedpreferences.edit()
            editor.putString("NAME",name)
            editor.apply()
            Toast.makeText(this,"YOUR USER NAME IS ${name} HELLO ${name}",Toast.LENGTH_LONG).show()

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