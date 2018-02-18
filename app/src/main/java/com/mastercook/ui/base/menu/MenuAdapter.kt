package com.mastercook.ui.base.menu

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mastercook.R
import kotlinx.android.synthetic.main.li_menu.view.*

class MenuAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val HEADER = 0
    private val ITEM = 1

    private val array = arrayListOf("Главная", "Закладки", "Настройки")

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is ItemHolder) {
            holder.tvName.text = array[position - 1]
            holder.ivIcon.setImageResource(R.mipmap.ic_launcher_round)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == HEADER)
            return HeaderHolder(LayoutInflater.from(parent.context).inflate(R.layout.header_menu, parent, false))
        else return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.li_menu, parent, false))
    }


    override fun getItemCount(): Int {
       return 1 + array.size
    }

    override fun getItemViewType(position: Int): Int {
        return if(position == 0) HEADER else ITEM
    }

    class HeaderHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvName = itemView.tvName
        val ivIcon = itemView.ivIcon
    }
}