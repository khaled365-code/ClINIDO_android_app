package com.khaledmohamed.am_clinics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class City_Activity : AppCompatActivity() {
    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)
        title = "KotlinApp"
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.listView)
        list = ArrayList()
        list.add("  All cities")
        list.add("  Qalyubia")
        list.add("  Mansoura")
        list.add("  Menoufia")
        list.add("  Alexandria")
        list.add("  Assuit")
        list.add("  Beni Suef")
        list.add("  cairo")
        list.add("  El Beheira")
        list.add("  El Dakahlia")
        list.add("  EL ismailia")
        list.add("  EL Minia")
        list.add("  EL Sharqia")
        list.add("  Gharbia")
        list.add("  Giza")
        list.add("  Hurghada")
        list.add("  Kafr El Sheikh")


        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText(this@City_Activity, "No Match found", Toast.LENGTH_LONG).show()
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
