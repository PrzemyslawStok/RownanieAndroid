package com.e.rownaniekwadratowe

import RownanieKwadratowe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val A_string = A_text.text.toString()git
            Log.v("przykładowy tag","Pole tekstowe: "+A_string)
        }

        //val rownanieKwadratowe = RownanieKwadratowe(A_text.text.toString().toDouble(),B_text.text.toString().toDouble(),C_text.text.toString().toDouble())
    }
}
