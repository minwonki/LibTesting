package com.wk.min.libtesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wk.min.dialoglib.SimpleClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val simple = SimpleClass()
        simple.showMessage("minwonki")
        simple.showMessage2("minwonki")
    }
}
