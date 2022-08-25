package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivitySelectServiceBinding

class select_service_Activity : AppCompatActivity() {
    lateinit var binding:ActivitySelectServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySelectServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}