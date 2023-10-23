package com.n2isys.listview_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.listview_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewBind.root)


    }
}