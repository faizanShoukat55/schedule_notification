package com.example.notification_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {


    private val mNotificationTime =
        Calendar.getInstance().timeInMillis + 5000 //Set after 5 seconds from the current time.
    private var mNotified = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        if (!mNotified) {
//            NotificationUtils().setNotification(mNotificationTime, this@MainActivity)
//        }

        NotificationUtils().setNotification(mNotificationTime, this@MainActivity)

    }
}