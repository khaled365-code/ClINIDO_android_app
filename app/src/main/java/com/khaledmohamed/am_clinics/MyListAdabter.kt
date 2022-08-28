package com.khaledmohamed.am_clinics.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.khaledmohamed.am_clinics.Model
import com.khaledmohamed.am_clinics.R

class MyListAdapter(var mCtx: Context, var resource:Int, var items:List<Model>)
    : ArrayAdapter<Model>( mCtx , resource , items ){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView : ImageView = view.findViewById(R.id.icon_Iv)
        var textView : TextView = view.findViewById(R.id.title_Tv)
        var textView1 : TextView = view.findViewById(R.id.desc_Tv)


        var person : Model = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(person.photo))
        textView.text = person.title
        textView1.text = person.desc


        return view
    }

}