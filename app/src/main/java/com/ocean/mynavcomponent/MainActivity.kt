package com.ocean.mynavcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.findFragmentById(R.id.navHostFragment)
            ?.findNavController()?.navigate(R.id.fragmentOne)
    }
}