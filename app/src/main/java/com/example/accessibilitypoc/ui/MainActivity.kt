package com.example.accessibilitypoc.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.example.accessibilitypoc.R
import com.example.accessibilitypoc.extensions.isAa11yServiceSelected

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(isAa11yServiceSelected()){
            setContentView(R.layout.activity_mail_a11y)
        }else{
            setContentView(R.layout.activity_main)
        }


    }
}