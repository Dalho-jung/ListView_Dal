package com.n2isys.listview_dal.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.n2isys.listview_dal.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student> (mContext,resId,mList){


}