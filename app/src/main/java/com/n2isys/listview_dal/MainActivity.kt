package com.n2isys.listview_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.n2isys.listview_dal.adapters.StudentAdapter
import com.n2isys.listview_dal.databinding.ActivityMainBinding
import com.n2isys.listview_dal.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()
    lateinit var mAdpter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewBind.root)

        mStudentList.add( Student("홍기봉",1968))
        mStudentList.add( Student("정달호",1978))
        mStudentList.add( Student("소대연",1988))
        mStudentList.add( Student("유필성",1985))
        mStudentList.add( Student("김주하",1978))
        mStudentList.add( Student("김미나",1984))
        mStudentList.add( Student("한인택",1991))

        mAdpter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        viewBind.studentListView.adapter = mAdpter

    }
}