package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SeclondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seclond)

        //get data from intent

        var intent= intent
        var name= intent.getStringExtra("Name")
        var email= intent.getStringExtra("Email")
        var phone= intent.getStringExtra("phone")

        //textview

        val resultTv=findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text="Name :"+name+"\n \n Email :"+email+"\n \n Phone :"+phone+""
    }
}
