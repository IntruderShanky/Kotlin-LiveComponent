package com.digitalbithub.kotlinLiveComponent

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle
import android.support.v4.view.ViewPager

class MainActivity : LifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager: ViewPager = findViewById(R.id.pager) as ViewPager
        pager.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
