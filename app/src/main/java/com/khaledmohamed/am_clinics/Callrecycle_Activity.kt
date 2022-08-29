package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.khaledmohamed.am_clinics.listview.MyListAdapter

class Callrecycle_Activity : AppCompatActivity() {

    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.callrecycler_view)
        listView = findViewById(R.id.lisview)
        var list = mutableListOf<Model>()

        list.add(Model("Dr/ Ahmed Mahmoud ", "Audiology", R.drawable.doctorr1))
        list.add(Model("Dr/ Amal Abdelwahab", "Audiology", R.drawable.doctorr3))
        list.add(Model("Dr/ Ahmed El-sayed", " Dentistry", R.drawable.doctor1male))
        list.add(Model("Dr/ Nora Tawfeek", "Allergy and immunology", R.drawable.doctor2female))
        list.add(Model("Dr/ khaled Essam", "Chest and respiratory", R.drawable.doctor2male))
        list.add(Model("Dr/ Fatma Ibrahim", "Dermatology", R.drawable.doctor7female))
        list.add(Model("Dr/ Mostafa El-sayed", "Diabetes and Endocrinology", R.drawable.doctor2male))
        list.add(Model("Dr/ Nada Mahmoud", "Ear , NOSE and Throat", R.drawable.female))
        list.add(Model("Dr/ Ahmed Abdelkader", "Ophthalmology", R.drawable.doctorr1))
        list.add(Model("Dr/ Manar Mahmoud", "Neurology", R.drawable.doctor2female))
        list.add(Model("Dr/ Mohamed khaled", " Cardiology and thoracic surgery", R.drawable.doctorr1))
        list.add(Model("Dr/ Mostafa Gaber", "Dietician and Nutrition", R.drawable.doctor2male))

        listView.adapter = MyListAdapter(this, R.layout.custom_list, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            var intent= Intent(this,Payment_for_call_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Please Confirm Your Reservation ", Toast.LENGTH_LONG).show()
        }
    }
}
