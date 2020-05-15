package com.e.rownaniekwadratowe

import RownanieKwadratowe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rownanieKwadratowe = RownanieKwadratowe(5.0,5.0,5.0)

        rownanieKwadratowe.wyswietlRownanie()
        rownanieKwadratowe.wyswietlRozwiazania()
    }
}
