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

        binding.selectappointmentChoose.setOnClickListener{

            var intent=Intent(this,SpecialityActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Please select an speciality ",Toast.LENGTH_LONG).show()

        }

        binding.selectcallsChoose.setOnClickListener {

            var intent=Intent(this,speciality_call::class.java)
            startActivity(intent)
            Toast.makeText(this,"Please select an speciality ",Toast.LENGTH_LONG).show()
        }

        binding.selectvisitChoose.setOnClickListener {

            var intent=Intent(this,city2_activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Please choose doctor or nurse ! ",Toast.LENGTH_LONG).show()

        }

        binding.selectreadingChoose.setOnClickListener {

            var intent=Intent(this,Scroll_articles_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Choose an article to read it",Toast.LENGTH_LONG).show()
        }






    }
}