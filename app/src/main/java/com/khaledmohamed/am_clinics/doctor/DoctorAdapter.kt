package com.khaledmohamed.am_clinics.doctor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khaledmohamed.am_clinics.R
import kotlinx.android.synthetic.main.item_recycler.view.*

class DoctorAdapter(var myList: ArrayList<DoctorData>):
    RecyclerView.Adapter<DoctorAdapter.ViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener {

        fun Book_action(position: Int)

    }

    fun setonItemClickListener(listener : onItemClickListener){
        mListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(
            R.layout.item_recycler,
            parent,false)

        return ViewHolder(v,mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var Data = myList[position]

        holder.doctorImg.setImageResource(Data.img)
        holder.doctorName.text = Data.name
        holder.doctorSpec.text = Data.spec
        holder.doctorFees.text = Data.fees.toString()
    }

    override fun getItemCount(): Int {
        return myList.size
    }


    class ViewHolder(itemView: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(itemView) {

        val doctorImg = itemView.Doctor_image!!
        val doctorName = itemView.Doctor_title!!
        val doctorSpec = itemView.spec_detail!!
        val doctorFees = itemView.fees_detail!!

        init {
            itemView.Book_btn.setOnClickListener {
                listener.Book_action(adapterPosition)
            }
        }

    }
}