package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Scroll_articles_Activity : AppCompatActivity() {

    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var textView6: TextView
    private lateinit var textView7: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_articles)

        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textview4)
        textView5 = findViewById(R.id.textView5)
        textView6= findViewById(R.id.textview6)
        textView7= findViewById(R.id.textview7)
        textView2.setOnClickListener{
            var intent: Intent = Intent(this,Article1_Activity::class.java)
            startActivity(intent)

        }

        textView3.setOnClickListener{
            var intent: Intent = Intent(this,Article2_Activity::class.java)
            startActivity(intent)


        }
        textView4.setOnClickListener{
            var intent: Intent = Intent(this,Article3_Activity::class.java)
            startActivity(intent)

        }
        textView5.setOnClickListener{
            var intent: Intent = Intent(this,Article4_Activity::class.java)
            startActivity(intent)
        }
        textView6.setOnClickListener{
            var intent: Intent = Intent(this,Article5_Activity::class.java)
            startActivity(intent)
        }
        textView7.setOnClickListener{
            var intent: Intent = Intent(this,Article6_Activity::class.java)
            startActivity(intent)

        }



    }
}