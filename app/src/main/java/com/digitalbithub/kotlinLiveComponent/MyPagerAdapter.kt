package com.digitalbithub.kotlinLiveComponent

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by shanky on 1/11/17.
 */
class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return MyFragment()
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "Page " + position
    }

    override fun getCount(): Int {
        return 2
    }
}