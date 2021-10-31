package com.rhtth.kotlinstudy

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        //SharedPreference sp1이라는 이름을 가진 sharedPref객체 생성
        val sharedPref1 = getSharedPreferences("sp1", Context.MODE_PRIVATE)
        val sharedPref2 = getSharedPreferences("sp2",Context.MODE_PRIVATE)

        //Mode
        //  MODE_PRIVATE : 생성한 application에서만 사용 가능
        //  MODE_WORLD_REDABLE : 다른 application에서 사용 가능 -> 읽기전용
        //  MODE_WORLD_WRITEABLE : 다른 application에서 사용 가능 -> 읽기,쓰기 가능
        //카카오톡, 카카오페이 간(서로 다른 app)에 상호작용을 할때 WORLD모드를 사용한다
        //  MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        //  MODE_APPEND : 기존 preference에 신규로 추가

        //값을 저장(sp1)
        val editor1 : SharedPreferences.Editor = sharedPref1.edit()
        editor1.putString("hello","안녕하세요")
        editor1.commit()

        //값을 저장(sp2)
        val editor2 : SharedPreferences.Editor = sharedPref2.edit()
        editor2.putString("hi","안녕")
        //editor에는 remove("key값") ->해당 key값만 제거
        // clear() -> 해당 editor 데이터 전부 삭제
        // 사용 후에는 항상 commit()을 해야한다.
        //editor2.remove("hi")
        editor2.commit()

        //sp1 ->SharedPreference
        //key->hello value -> 안녕하세요
        //sp2 -> SharedPreference
        //key->.hi value ->안녕

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            //SharedPreference에 값을 불러오는 방법
            val sharedPref11 = getSharedPreferences("sp1",Context.MODE_PRIVATE)
            val sharedPref22 = getSharedPreferences("sp2",Context.MODE_PRIVATE)

            //hello키가 있을 때 value값을 출력하지만 해당 키가 없을 때는 "데이터 없음"이 출력
            val value1 = sharedPref11.getString("hello","데이터 없음")
            val value2 = sharedPref22.getString("hi","데이터 없음")
            Log.d("key-value","Value :"+value1+value2)
        }

    }}