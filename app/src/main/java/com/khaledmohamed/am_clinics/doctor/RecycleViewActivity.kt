package com.khaledmohamed.am_clinics.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khaledmohamed.am_clinics.Payment_for_call_Activity
import com.khaledmohamed.am_clinics.R
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)


        var list = ArrayList<DoctorData>()

        list.add(
            DoctorData(
            R.drawable.aaa,
            "Ahmed",
            "teeth",
                50
            )
        )

        list.add(
            DoctorData(
                R.drawable.health2,
                "omar",
                "Heart",
                80
            )
        )

        list.add(
            DoctorData(
                R.drawable.appointment,
                "khaled",
                "teeth",
                30
            )
        )

        list.add(
            DoctorData(
                R.drawable.healthmatters,
                "Salman",
                "teeth",
                90
            )
        )

        rv_Doctor.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL, false
        )

        val doctorAdapter = DoctorAdapter(list)

        rv_Doctor.adapter = doctorAdapter

        doctorAdapter.setonItemClickListener(object: DoctorAdapter.onItemClickListener{

            override fun Book_action(position: Int) {

                val intent = Intent(this@RecycleViewActivity,
                    Payment_for_call_Activity::class.java)
                startActivity(intent)

            }
        })

    }
}