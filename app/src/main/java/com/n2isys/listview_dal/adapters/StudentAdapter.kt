package com.n2isys.listview_dal.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.n2isys.listview_dal.R
import com.n2isys.listview_dal.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student> (mContext,resId,mList){

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!

        val studentData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameText)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearText)

        nameTxt.text = studentData.name
        val koreaAge = 2021- studentData.birthYear +1
        birthYearTxt.text = "( ${koreaAge} 세)"
        return row
    }

}