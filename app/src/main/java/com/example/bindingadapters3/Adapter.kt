package com.example.bindingadapters3

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromUrl","placeholder")
fun ImageView.imageFromUrl(url : String, placeholder: Int){
    Glide.with(this.context).load(url).placeholder(placeholder).into(this)

}