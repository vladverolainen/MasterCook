package com.mastercook.ui.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import com.mastercook.R
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity: AppCompatActivity() {

    internal var TAB = arrayOf("Главная", "Избранное")

     var pager: ViewPager
     var pagerAdapter: PagerAdapter
    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.activity_base)
        LayoutInflater.from(this).inflate(layoutResID, content, true)

        pager = findViewById(R.id.pager)
        pagerAdapter = MyFragmentPagerAdapter(supportFragmentManager)
        pager.adapter = pagerAdapter

        pager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float,
                                        positionOffsetPixels: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

    }

    private inner class MyFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

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
}