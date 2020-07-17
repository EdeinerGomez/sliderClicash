package com.example.sliderfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v4.view.ViewPager
import android.view.View
import com.example.sliderfragment.R.drawable.slider1
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) ;

        button1.setOnClickListener {

            val firstFragment = FragmentOne()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

            transaction.replace(R.id.fragment, firstFragment)
            transaction.addToBackStack(null)
            transaction.commit()


        }


        button2.setOnClickListener {

            val secondFragment = FragmentMapa()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

            transaction.replace(R.id.fragment, secondFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }









    }
}



