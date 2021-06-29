package com.example.testarouter

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author hejinhua
 * @date 2021/6/29
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)
    }

}