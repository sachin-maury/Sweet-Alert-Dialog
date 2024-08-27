package com.hedroid.sweetalertdialog

import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import cn.pedant.SweetAlert.SweetAlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success SweetAlert")
                .setContentText("This is Success SweetAlert Box")
                .show()
        }

        btn2.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error SweetAlert")
                .setContentText("This is Success SweetAlert Box")
                .show()
        }

        btn3.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning SweetAlert")
                .setContentText("This is Success SweetAlert Box")
                .show()
        }


    }
}