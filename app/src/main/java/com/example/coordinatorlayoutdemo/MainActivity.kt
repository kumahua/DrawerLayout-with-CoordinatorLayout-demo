package com.example.coordinatorlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Adapter
import com.example.coordinatorlayoutdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = arrayListOf<String>()
        for (i in 0..50) {
            list.add(i.toString())
        }

        val adapter = MyAdapter(list)
        binding.recyclerView.adapter = adapter

        binding.drawerIcon.setOnClickListener {

            binding.drawerLayout.openDrawer(Gravity.RIGHT)
        }
    }
}