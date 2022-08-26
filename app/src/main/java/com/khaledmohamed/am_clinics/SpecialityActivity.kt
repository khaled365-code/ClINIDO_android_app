package com.khaledmohamed.am_clinics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class SpecialityActivity : AppCompatActivity() {

    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speciality)

        title = "KotlinApp"
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.listView)
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
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText(this@SpecialityActivity, "No Match found", Toast.LENGTH_LONG).show()
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
