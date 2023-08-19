package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
 Navigation Component
 Fragmnetlar arası (sayfalar arası) geçişleri daha pratik yapmamıza olanak tanır.
 Activity üzerinde istediğimiz şekilde fragment geçişleri yapabiliriz.
 Geçişlerde veri transferleri yapabiliriz.


 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}