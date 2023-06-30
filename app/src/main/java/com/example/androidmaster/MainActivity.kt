package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.firstapp.FirstAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGreetApp = findViewById<Button>(R.id.btnHelloApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)

        btnGreetApp.setOnClickListener { navigateGreetApp()  }

        btnImcApp.setOnClickListener { navigateToIcmApp() }
    }
    private fun navigateGreetApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIcmApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
}