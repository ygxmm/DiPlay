package com.shilapi.xcertplay

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 32, 32, 32)
        }

        val title = TextView(this).apply {
            text = "DiPlay legacy compatibility build"
            textSize = 26f
            setPadding(0, 0, 0, 24)
        }
        val body = TextView(this).apply {
            text = "This build keeps the app compatible with Android 4.3 (API 18) by disabling modern Compose and using classic Android views."
            textSize = 16f
        }

        root.addView(title)
        root.addView(body)
        setContentView(root)
    }
}
