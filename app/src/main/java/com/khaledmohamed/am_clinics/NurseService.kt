package com.khaledmohamed.am_clinics

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NurseService : AppCompatActivity() {
    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nurse_service)
        title = "Nurse service"
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.speciality1_listview)
        list = ArrayList()
        list.add("   Bed bath")
        list.add("   Bed making")
        list.add("   Blood pressure")
        list.add("   CPR")
        list.add("   Drug administration")
        list.add("   Hot and cold application")
        list.add("   Infections control measures")
        list.add("   Measure body temperature")
        list.add("   Personal hygiene")
        list.add("   Pulse")
        list.add("   Topical medication")
        list.add("    Transfering and positioning")
        list.add("   Range of motion")
        list.add("   Respiration")



        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter
        listView.onItemClickListener=object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var intent: Intent =
                    Intent(this@NurseService, Confirm_home_visit_Activity::class.java)
                startActivity(intent)
            }

            }
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText(this@NurseService, "No Match found", Toast.LENGTH_LONG).show()
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