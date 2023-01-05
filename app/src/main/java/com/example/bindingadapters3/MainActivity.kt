package com.example.bindingadapters3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingadapters3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val post = Post("Studying","Learning Binding Adapters","https://imaages.unsplash.com/photo-1583863788434-e58a36330cf0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8YWRhcHRlcnxlbnwwfHwwfHw%3D&w=1000&q=80",R.drawable.loading)
        binding.post = post
    }
}