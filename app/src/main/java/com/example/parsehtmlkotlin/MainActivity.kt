package com.example.parsehtmlkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parsehtmlkotlin.fragment.HomeFragment

@Suppress("DEPRECATION", "CAST_NEVER_SUCCEEDS")
class MainActivity : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    private val homeFragment = HomeFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, homeFragment)
        fragmentTransaction.commit()
    }
}
