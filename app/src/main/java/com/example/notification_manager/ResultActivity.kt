package com.example.notification_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (intent.getBooleanExtra("notification", false)) { //Just for confirmation
//            txtTitleView.text = intent.getStringExtra("title")
//            txtMsgView.text = intent.getStringExtra("message")

            Toast.makeText(this,"Title : ${intent.getStringExtra("title")}  message : ${intent.getStringExtra("message")}",Toast.LENGTH_SHORT).show()

        }

    }
}