package com.example.activitylifecycle


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDateTime



class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
    }

    override fun onResume() {
        super.onResume()
        var st =""
       st = tv.text.toString()
        tv.text = st+"\n" + "Im online"

    }

    override fun onPause() {
        super.onPause()
       val current = LocalDateTime.now()

        var st =""
        st = tv.text.toString()
       tv.text = st+"\n" + "Last seen on" + current
    }
}