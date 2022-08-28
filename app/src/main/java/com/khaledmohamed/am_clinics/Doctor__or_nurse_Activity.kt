package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityDoctorOrNurseBinding

class Doctor__or_nurse_Activity : AppCompatActivity() {

    lateinit var binding:ActivityDoctorOrNurseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDoctorOrNurseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doctorvisitId.setOnClickListener {

            var intent= Intent(this,DoctorService::class.java)
            startActivity(intent)
            Toast.makeText(this,"Choose one of these services", Toast.LENGTH_LONG).show()

        }

        binding.nursevisitId.setOnClickListener {

            var intent= Intent(this,NurseService::class.java)
            startActivity(intent)
            Toast.makeText(this,"Choose one of these services", Toast.LENGTH_LONG).show()

        }





    }
}