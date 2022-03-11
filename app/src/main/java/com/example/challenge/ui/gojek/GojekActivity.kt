package com.example.challenge.ui.gojek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.challenge.R
import com.example.challenge.ui.gojek.chat.ChatFragment
import com.example.challenge.ui.gojek.dashboard.DashboardFragment
import com.example.challenge.ui.gojek.order.OrderFragment
import com.example.challenge.ui.gojek.promo.PromoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class GojekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek)

        val dashboardFragment = DashboardFragment()
        val promoFragment = PromoFragment()
        val orderFragment = OrderFragment()
        val chatFragment = ChatFragment()

        makeCurrentFragment(dashboardFragment)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_dashboard -> makeCurrentFragment(dashboardFragment)
                R.id.menu_promo -> makeCurrentFragment(promoFragment)
                R.id.menu_order -> makeCurrentFragment(orderFragment)
                R.id.menu_chat -> makeCurrentFragment(chatFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_container, fragment)
            commit()
        }
    }
}