package com.e.rownaniekwadratowe

import RownanieKwadratowe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        oblicz.setOnClickListener {
            val rownanieKwadratowe = RownanieKwadratowe(A_text.text.toString().toDouble(),B_text.text.toString().toDouble(),C_text.text.toString().toDouble())

            rownanieText.setText(rownanieKwadratowe.pobierzRownanie())

            rownanieKwadratowe.wyswietlRownanie()
            rownanieKwadratowe.wyswietlRozwiazania()
        }

    }
}
