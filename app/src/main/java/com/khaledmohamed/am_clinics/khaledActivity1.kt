package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class khaledActivity1 : AppCompatActivity() {
    lateinit var btn_supmit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khaled1)
        btn_supmit=findViewById(R.id.btn_supmit)
        btn_supmit.setOnClickListener {
            var intent=Intent(this,khaledsecondActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"your data submitted successfully",Toast.LENGTH_LONG).show()



        }
    }
}