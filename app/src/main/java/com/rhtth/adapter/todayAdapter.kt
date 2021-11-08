package com.rhtth.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rhtth.kotlinstudy.R
import com.rhtth.kotlinstudy.TodayData

class todayAdapter(private val context: Context) :
    RecyclerView.Adapter<todayAdapter.ViewHolder>() {


    var datas = mutableListOf<TodayData>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.listview_today,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(datas[position])
    }

    override fun getItemCount(): Int = datas.size


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val txvtoday : TextView = itemView.findViewById(R.id.txv_today)
        private val txv_list : TextView = itemView.findViewById(R.id.txv_list)
        private val txv_content : TextView = itemView.findViewById(R.id.txv_content)

        fun bind(item: TodayData){
            txvtoday.text = item.today
            txv_content.text = item.content
            txv_list.text = item.list

        }


    }

}




