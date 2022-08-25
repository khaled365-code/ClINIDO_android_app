package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityKhaledsecondBinding

class khaledsecondActivity : AppCompatActivity() {
    lateinit var binding:ActivityKhaledsecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityKhaledsecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnClinic.setOnClickListener{

          if(!binding.selectArea.text.isNullOrEmpty())
          {
              var intent = Intent(this, atalahactivity1::class.java)
              startActivity(intent)
              Toast.makeText(this, "please choose your preffered doctor", Toast.LENGTH_LONG).show()

          }
            else
          {
              Toast.makeText(this, "You Should Select Your Area!", Toast.LENGTH_LONG).show()

          }
        }

    }
}