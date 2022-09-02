package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonSumar: Button =findViewById(R.id.btnSumar)
        botonSumar.setOnClickListener{ clickSumar() }
        val botonRestar: Button =findViewById(R.id.btnRestar)
        botonRestar.setOnClickListener { clickRestar() }
        val botonMultiplicar: Button =findViewById(R.id.btnMultiplicar)
        botonMultiplicar.setOnClickListener { clickMultipicar() }
        val botonDividir: Button =findViewById(R.id.btnDividir)
        botonDividir.setOnClickListener { clickDvividir() }
    }
    private fun clickSumar(){
        val text1: TextView =findViewById(R.id.number1)
        val number1:String=text1.text.toString()
        val number1Int: Int=number1.toInt()

        val text2: TextView =findViewById(R.id.number2)
        val number2:String=text2.text.toString()
        val number2Int: Int=number2.toInt()

        val resultado: TextView =findViewById(R.id.result)

        val sumar = number1Int+number2Int

        resultado.text="$sumar"
    }
    private fun clickRestar(){

    }
    private fun clickMultipicar(){

    }
    private fun clickDvividir(){

    }
    private fun clickIgual(){

    }

}