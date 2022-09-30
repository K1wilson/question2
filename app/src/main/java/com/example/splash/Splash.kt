package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Splash : AppCompatActivity() {
    lateinit var backgrounding : ImageView
    lateinit var bgtext : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
         backgrounding = findViewById(R.id.iv_logo)
         bgtext = findViewById(R.id.iv)
        val sideAnimation =AnimationUtils.loadAnimation(this,R.anim.slide)
        backgrounding.startAnimation(sideAnimation)
        bgtext.startAnimation(sideAnimation)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}