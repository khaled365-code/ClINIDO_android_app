package com.khaledmohamed.am_clinics

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DoctorService : AppCompatActivity() {
    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_service)
        title = "Select service"
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.listView)
        list = ArrayList()
        list.add("   Chest and Respiratory")
        list.add("   Dentistry (Teeth)")
        list.add("   Dermatology (skin)")
        list.add("   Diabetes and Endocrinology")
        list.add("   Ear, Nose and Throat")
        list.add("   General Surgery")
        list.add("   Gynaecology and Infertility")
        list.add("   Internal Medicine")
        list.add("   Nephrology")
        list.add("   Neurology (Brain Nerves)")
        list.add("   Old People Health")
        list.add("   Oncology Surgery (Tumor Surgery)")
        list.add("   Ophthalmology (Eyes)")
        list.add("   Orthopedics (Bones)")
        list.add("   Pain Management")
        list.add("   Pediatrics and New Born")
        list.add("   physiotherapy and Sport Injures")
        list.add("   Rheumatology")
        list.add("   Spinal Surgery")
        list.add("   Urology (Urinary System)")
        list.add("   Phonetics (Speech)")
        list.add("   Vascular Surgery (Arteries and Vein Surgery)")




        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText(this@DoctorService, "No Match found", Toast.LENGTH_LONG).show()
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
