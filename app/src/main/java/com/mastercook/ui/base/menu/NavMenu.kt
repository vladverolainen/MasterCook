package com.mastercook.ui.base.menu

import android.annotation.SuppressLint
import android.content.Context
import android.support.design.widget.NavigationView
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import kotlinx.android.synthetic.main.activity_base.view.*

class NavMenu: NavigationView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @SuppressLint("RestrictedApi")
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        rvListMenu.layoutManager = LinearLayoutManager(context)
        rvListMenu.adapter = MenuAdapter()
    }

}