package com.example.testarouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/test/main1")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 点击跳转
        val button = findViewById<Button>(R.id.btn_jump)
        button.setOnClickListener {
            ARouter.getInstance().build("/another/main2").navigation()
        }
    }
}