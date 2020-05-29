package com.e.rownaniekwadratowe

import RownanieKwadratowe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val A = getDouble(A_text)
            val B = getDouble(B_text)
            val C = getDouble(C_text)

            Log.v("przykładowy tag","Odczytane liczby: ${A} ${B} ${C}")

            val naszeRownanie = RownanieKwadratowe(A,B,C)

            Log.v("rownanie",naszeRownanie.pobierzRownanie())
        }
    }

    fun getDouble(nasz_tekst: EditText):Double{
        val textString = nasz_tekst.text.toString()
        var liczba: Double = 0.0

        try {
            liczba = textString.toDouble()
        }catch (e:Exception){

        }

        return liczba
    }
}
