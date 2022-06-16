package com.example.tab_host2

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
@Suppress("deprecation")
class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("강아지").setIndicator("강아지")
        tabSpec1.setContent(R.id.imageView1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("고양이").setIndicator("고양이")
        tabSpec2.setContent(R.id.imageView2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("토끼").setIndicator("토끼")
        tabSpec3.setContent(R.id.imageView3)
        tabHost.addTab(tabSpec3)

        var tabSpec4 = tabHost.newTabSpec("말").setIndicator("말")
        tabSpec4.setContent(R.id.imageView4)
        tabHost.addTab(tabSpec4)

        tabHost.currentTab = 0
    }
}