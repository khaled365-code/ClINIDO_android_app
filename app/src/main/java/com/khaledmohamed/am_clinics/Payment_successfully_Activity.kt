package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.RecyclerView

class Payment_successfully_Activity : AppCompatActivity() {

   lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_successfully)
        handler= Handler(Looper.getMainLooper())
        handler.postDelayed({
            var intent: Intent = Intent(this,Exit_Activity::class.java)
            startActivity(intent)
            finish()},4000)



    }
}
