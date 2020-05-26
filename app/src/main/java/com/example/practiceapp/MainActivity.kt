package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt=findViewById<EditText>(R.id.nameEt)
        val emailEt=findViewById<EditText>(R.id.emailEt)
        val phoneEt=findViewById<EditText>(R.id.phoneEt)
        val saveBtn=findViewById<Button>(R.id.saveButton)

        //handle button onClick

            saveBtn.setOnClickListener {
                //get text from EditText

                var name=nameEt.text.toString()
                var email=emailEt.text.toString()
                var phone=phoneEt.text.toString()

                //intent to start activity

                val intent=Intent(this@MainActivity,SeclondActivity::class.java)
                intent.putExtra("Name",name)
                intent.putExtra("Email",email)
                intent.putExtra("phone",phone)
                startActivity(intent)
            }
    }
}
