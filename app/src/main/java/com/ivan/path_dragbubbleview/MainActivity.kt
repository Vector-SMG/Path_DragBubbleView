package com.ivan.path_dragbubbleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


/*
 * @author liuwei
 * @email 13040839537@163.com
 * create at 2018/8/6
 * description:
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reset_btn.setOnClickListener {
            drag_buddle_view.reset()
        }
    }
}
