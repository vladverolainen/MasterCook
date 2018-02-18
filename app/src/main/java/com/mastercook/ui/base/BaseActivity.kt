package com.mastercook.ui.base

import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import com.mastercook.R
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity: AppCompatActivity() {

    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.activity_base)
        LayoutInflater.from(this).inflate(layoutResID, content, true)
    }

}