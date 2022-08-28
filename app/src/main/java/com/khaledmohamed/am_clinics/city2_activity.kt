package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class city2_activity : AppCompatActivity() {
    lateinit var searchView: SearchView
    lateinit var listView: ListView
    lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city2)
        title = "KotlinApp"
        searchView = findViewById(R.id.searchView)
        listView = findViewById(R.id.speciality1_listview)
        list = ArrayList()
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
        listView.onItemClickListener=object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var intent: Intent = Intent(this@city2_activity,Doctor__or_nurse_Activity::class.java)
                startActivity(intent)

            }


        }
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText(this@city2_activity, "No Match found", Toast.LENGTH_LONG).show()
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
