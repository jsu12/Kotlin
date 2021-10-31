package com.rhtth.kotlinstudy

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContextStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_study)

        //1,ActivityManagerService에 접근 ->Activity의 주변 정보
        val context : Context = this

        //2.application의 context(주변정보) ->Application의 주변 정보
        val applicationContext : Context = getApplicationContext() as Context
        //=  val applicationContext = getApplicationContext()

    }
}