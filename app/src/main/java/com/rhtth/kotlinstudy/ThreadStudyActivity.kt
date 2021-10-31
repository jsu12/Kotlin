package com.rhtth.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ThreadStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        //방법1
        val runnable : Runnable = object : Runnable{
            override fun run() {
                Log.d("thread-1","Thread is made")
            }
        }
        val thread : Thread = Thread(runnable)

        val button : Button = findViewById(R.id.button_thread)
        button.setOnClickListener {
            thread.start()
        }

        //방법2
        Thread(object: Runnable{
            override fun run() {
                Log.d("thread-1","Thread2 is made")

            }
        }).start()

        //방법3
        Thread(Runnable{
            Log.d("thread-1","Thread3 is made")
            Thread.sleep(2000) //2초동안 Thread 멈춤
            runOnUiThread{
                button.setBackgroundColor(getColor(R.color.cardview_shadow_start_color))
            }
                    }).start()


    }
}