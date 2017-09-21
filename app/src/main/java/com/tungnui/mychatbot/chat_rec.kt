package com.tungnui.mychatbot

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView



/**
 * Created by thanh on 21/09/2017.
 */
class chat_rec(itemView: View) : RecyclerView.ViewHolder(itemView) {


    internal var leftText: TextView
    internal var rightText: TextView

    init {

        leftText = itemView.findViewById<View>(R.id.leftText) as TextView
        rightText = itemView.findViewById<View>(R.id.rightText) as TextView


    }
}