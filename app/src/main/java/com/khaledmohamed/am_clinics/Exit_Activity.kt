package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityExitBinding

class Exit_Activity : AppCompatActivity() {

    lateinit var binding:ActivityExitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityExitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exitmainpageBtn.setOnClickListener {

            var intent: Intent = Intent(this,select_service_Activity::class.java)
            startActivity(intent)

        }

        binding.exitgotoarticlesBtn.setOnClickListener {

            var intent: Intent = Intent(this,Scroll_articles_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this, "You can read different medical articles here", Toast.LENGTH_LONG).show()

        }

        binding.exitlogoutBtn.setOnClickListener {

            moveTaskToBack(true)
            android.os.Process.killProcess(android.os.Process.myPid())
            System.exit(1)
        }



    }
}