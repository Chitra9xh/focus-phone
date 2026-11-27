package com.focusfone

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "Focus Fone"
            textSize = 24f
            setPadding(64, 200, 64, 64)
        })
    }
}
