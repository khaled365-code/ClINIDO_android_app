package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class speciality_call : AppCompatActivity() {

    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speciality_call)

        title = "KotlinApp"
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.speciality1_listview)
        list = ArrayList()
        list.add("   Audiology")
        list.add("   Cardiology and thoracic surgery")
        list.add("   Dentistry")
        list.add("   Allergy and immunology")
        list.add("   Andrology and male infertility")
        list.add("   Cardiology and vascular disease")
        list.add("   Chest and respiratory")
        list.add("   Dermatology")
        list.add("   Diabetes and Endocrinology")
        list.add("   Dietician and Nutrition")
        list.add("   Ear,NOSE and Throat")
        list.add("   ophthalmology")
        list.add("      Neurology")

        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter
        listView.onItemClickListener=object: AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long)
            {
                //var intent: Intent = Intent(this@speciality_call,City_Activity::class.java)
                //startActivity(intent)

            }

        }
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText(this@speciality_call, "No Match found", Toast.LENGTH_LONG).show()
                }
                return false
            }
            override fun onQueryTextChange(newText: String): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })
    }
}
