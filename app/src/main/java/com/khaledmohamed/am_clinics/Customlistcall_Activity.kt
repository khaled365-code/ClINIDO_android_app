package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.khaledmohamed.am_clinics.listview.MyListAdapter

class Customlistcall_Activity : AppCompatActivity() {

    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customlistcall)
        listView = findViewById(R.id.lisview)
        var list = mutableListOf<Model>()

        list.add(Model("Dr/ Mona", "Audiology", R.drawable.female))
        list.add(Model("Dr/ Amal", "Audiology", R.drawable.female))
        list.add(Model("Dr/Manal", " Dentistry", R.drawable.female))
        list.add(Model("Dr/Engy", "Allergy and immunology", R.drawable.female))
        list.add(Model("Dr/Layla", "Chest and respiratory", R.drawable.female))
        list.add(Model("Dr/zina", "Dermatology", R.drawable.female))
        list.add(Model("Dr/mohammed", "Diabetes and Endocrinology", R.drawable.male))
        list.add(Model("Dr/mahmoud", "Ear,NOSE and Throat", R.drawable.male))
        list.add(Model("Dr/ahmed", "ophthalmology", R.drawable.male))
        list.add(Model("Dr/zin", "Neurology", R.drawable.male))
        list.add(Model("Dr/amr", " Cardiology and thoracic surgery", R.drawable.male))
        list.add(Model("Dr/mostafa", "Dietician and Nutrition", R.drawable.male))

        listView.adapter = MyListAdapter(this, R.layout.custom_list, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            var intent= Intent(this,Payment_for_call_Activity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Please Confirm Your Reservation ", Toast.LENGTH_LONG).show()
        }
    }
}
