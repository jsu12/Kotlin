package com.rhtth.kotlinstudy

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.io.File

class GlideStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide_study)

        val image : ImageView = findViewById(R.id.iv_glide)

        Glide.with(this)
            .load(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .thumbnail(0.1f)
            .into(image)

    }
}