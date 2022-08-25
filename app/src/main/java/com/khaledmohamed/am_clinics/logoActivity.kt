package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class   logoActivity : AppCompatActivity() {

      lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        handler= Handler(Looper.getMainLooper())
        handler.postDelayed({
            var intent:Intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()},5000)



    }
}