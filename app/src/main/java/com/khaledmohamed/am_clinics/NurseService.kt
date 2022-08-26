package com.khaledmohamed.am_clinics

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
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
        listView = findViewById(R.id.listView)
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