package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.firstapp.FirstAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity
import com.example.androidmaster.settings.SettingActivity
import com.example.androidmaster.superheroapp.SuperHeroListActivity
import com.example.androidmaster.todoapp.TodoActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnGreetApp: Button
    private lateinit var btnImcApp: Button
    private lateinit var btnTODO: Button
    private lateinit var btnSuperHero: Button
    private lateinit var btnSettings: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGreetApp = findViewById(R.id.btnHelloApp)
        btnImcApp = findViewById(R.id.btnIMCApp)
        btnTODO = findViewById(R.id.btnTODO)
        btnSuperHero = findViewById(R.id.btnSuperHero)
        btnSettings = findViewById(R.id.btnSettings)

        initListeners()

    }

    private fun initListeners() {
        btnGreetApp.setOnClickListener { navigateGreetApp() }

        btnImcApp.setOnClickListener { navigateToIcmApp() }

        btnTODO.setOnClickListener { navigateToTodoApp() }

        btnSuperHero.setOnClickListener { navigateToSuperHeroApp() }

        btnSettings.setOnClickListener { navigateToSettings() }

    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateGreetApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIcmApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSettings() {
        val intent = Intent(this, SettingActivity::class.java)
        startActivity(intent)
    }
}