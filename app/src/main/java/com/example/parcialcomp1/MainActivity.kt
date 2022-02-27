package com.example.parcialcomp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sumar = findViewById<Button>(R.id.sumar)
        var borrar = findViewById<Button>(R.id.borrar)

        var btn1= findViewById<EditText>(R.id.btn1)
        var btn2 = findViewById<EditText>(R.id.btn2)
        var result = findViewById<TextView>(R.id.result)
        var result2 = findViewById<TextView>(R.id.result2)
        var result3 = findViewById<TextView>(R.id.result3)

        sumar.setOnClickListener{
            if(btn1.text.isNotEmpty() && btn2.text.isNotEmpty()){
                result.setText(
                    "El resultado de la suma es:"+(btn1.text.toString().toInt()+btn2.text.toString().toInt())+" Pulse BORRAR")
            }
            else if(btn1.text.isEmpty() && btn2.text.isEmpty()){
                result2.setText(
                    "Datos Erroneos Pulse BORRAR")

            }else{
                result3.setText(
                    "El resultado de la suma es:"+(if(btn1.text.isNotEmpty()) btn1.text.toString().toInt() else btn2.text.toString().toInt())+" Pulse BORRAR")


            }
            borrar.setOnClickListener {

                btn1.setText("")

                btn2.setText("")

                result.setText("")

                result2.setText("")

                result3.setText("")
            }
        }

    }


}




