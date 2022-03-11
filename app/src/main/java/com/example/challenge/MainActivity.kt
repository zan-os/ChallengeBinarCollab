package com.example.challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.challenge.ui.gojek.GojekActivity
import com.example.challenge.ui.gojek.chat.ChatFragment
import com.example.challenge.ui.gojek.dashboard.DashboardFragment
import com.example.challenge.ui.gojek.order.OrderFragment
import com.example.challenge.ui.gojek.promo.PromoFragment
import com.example.challenge.ui.shopee.ShopeeActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Change the class to ShopeeActivity or GojekActivity
        val intent = Intent(this, ShopeeActivity::class.java)

        startActivity(intent)
    }
}