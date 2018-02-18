package com.mastercook.ui.main

import android.os.Bundle
import android.support.v4.view.PagerAdapter
import com.mastercook.R
import com.mastercook.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    companion object {
        val TAB = arrayOf("Главная", "Избранное")
    }

    lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerAdapter = PagerAdapter(supportFragmentManager)
        pager.adapter = pagerAdapter

    }
}
