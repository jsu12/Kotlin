package com.rhtth.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.rhtth.adapter.todayAdapter

class RecyclerViewStudy1Activity : AppCompatActivity() {

    lateinit var todayAdapter : todayAdapter
    val datas = mutableListOf<TodayData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_study1)

        initRecycler()
    }

    private fun initRecycler(){
        todayAdapter = todayAdapter(this)
        val rv_today : RecyclerView = findViewById(R.id.rv_today)
        rv_today.adapter = todayAdapter

        datas.apply{
            add(TodayData(today = "2021.11.08", list = "11/08",content = "오늘은 21년11월8일 입니다."))
            add(TodayData(today = "2021.11.09", list = "11/09",content = "오늘은 21년11월9일 입니다."))
            add(TodayData(today = "2021.11.10", list = "11/10",content = "오늘은 21년11월10일 입니다."))
            add(TodayData(today = "2021.11.11", list = "11/11",content = "오늘은 21년11월11일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))
            add(TodayData(today = "2021.11.12", list = "11/12",content = "오늘은 21년11월12일 입니다."))

            todayAdapter.datas = datas
            todayAdapter.notifyDataSetChanged()


        }

    }

}