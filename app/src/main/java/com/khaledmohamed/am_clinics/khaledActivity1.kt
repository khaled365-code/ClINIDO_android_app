package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityKhaled1Binding

class khaledActivity1 : AppCompatActivity() {
    lateinit var binding:ActivityKhaled1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityKhaled1Binding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnSupmit.setOnClickListener{
           if(!binding.specialityField.text.isNullOrEmpty()
               &&!binding.cityField.text.isNullOrEmpty()
               &&!binding.feesField.text.isNullOrEmpty())
           {
               var intent = Intent(this, khaledsecondActivity::class.java)
               startActivity(intent)
               Toast.makeText(this, "your data submitted successfully", Toast.LENGTH_LONG).show()

           }
           else
           {
               Toast.makeText(this, "All fields are required!", Toast.LENGTH_LONG).show()

           }

        }


    }
}