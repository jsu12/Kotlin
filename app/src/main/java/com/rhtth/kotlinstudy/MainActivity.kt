package com.rhtth.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.rhtth.kotlinstudy.databinding.ActivityDataBindingExampleBinding
import com.rhtth.kotlinstudy.databinding.ActivityMainBinding
import com.rhtth.kotlinstudy.databinding.ResultProfileBinding

data class UserName(
    val firstName: String,
    val lastName: String
)

class MainActivity : AppCompatActivity() {

    /*//result_profile결합클래스 생성
    private  lateinit var binding: ResultProfileBinding*/

    private lateinit var binding: ActivityDataBindingExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_example)
        binding.user = UserName("정","성욱")

        binding.bbuton1.setOnClickListener {
            val intent = Intent(this, Button1Activity::class.java)
            startActivity(intent)

        }



    }

}

