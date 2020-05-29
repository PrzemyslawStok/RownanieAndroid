package com.e.rownaniekwadratowe

import RownanieKwadratowe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val A_string = A_text.text.toString()
            Log.v("przykładowy tag","Pole tekstowe: "+A_string)
            var A_double = 0.0

            try {
                A_double = A_string.toDouble()
            }catch (e:Exception){

            }

            Log.v("przykładowy tag","Odczytana liczba: "+A_double)
        }

        //val rownanieKwadratowe = RownanieKwadratowe(A_text.text.toString().toDouble(),B_text.text.toString().toDouble(),C_text.text.toString().toDouble())
    }
}
