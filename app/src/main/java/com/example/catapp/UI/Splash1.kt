package com.example.catapp.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.catapp.R

class Splash1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_1)
        Handler().postDelayed({
            val intent = Intent(this, Splash2::class.java)
            startActivity(intent)
            finish()
        }, 2000)

    }
}