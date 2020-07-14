package cn.zhaojunchen.weather

import android.widget.Toast
import java.time.Duration

fun String.toast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(App.context, this, duration).show()
}