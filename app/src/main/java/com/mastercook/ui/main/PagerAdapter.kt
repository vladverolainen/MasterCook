package com.mastercook.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.mastercook.ui.main.MainActivity.Companion.TAB

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return PageFragment.newInstance(position)
    }

    override fun getCount(): Int {
        return TAB.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return TAB[position]
    }
}
