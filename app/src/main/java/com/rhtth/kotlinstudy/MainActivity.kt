package com.rhtth.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rhtth.kotlinstudy.databinding.ResultProfileBinding

class MainActivity : AppCompatActivity() {

    //result_profile결합클래스 생성
    private  lateinit var binding: ResultProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //xml의 레이아웃들을 메모리에 객체화
        binding = ResultProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //button1을 누르면 button1 activitiy로 이동
      binding.button1.setOnClickListener {
          val intent = Intent(this,Button1Activity::class.java)
          startActivity(intent)
      }
        //button2을 누르면 button2 activitiy로 이동
        binding.button2.setOnClickListener {
            val intent = Intent(this,Button2Activity::class.java)
            startActivity(intent)
        }
        //button3을 누르면 button3 activitiy로 이동
        binding.button3.setOnClickListener {
            val intent = Intent(this,Button3Activity::class.java)
            startActivity(intent)
        }
    }
}