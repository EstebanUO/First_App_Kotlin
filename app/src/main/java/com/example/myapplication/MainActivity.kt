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
        val text3: TextView =findViewById(R.id.number1)
        val number1:String=text3.text.toString()
        val number1Int: Int=number1.toInt()

        val text4: TextView =findViewById(R.id.number2)
        val number2:String=text4.text.toString()
        val number2Int: Int=number2.toInt()

        val resultado: TextView =findViewById(R.id.result)

        val restar = number1Int-number2Int

        resultado.text="$restar"
    }
    private fun clickMultipicar(){
        val text5: TextView =findViewById(R.id.number1)
        val number1:String=text5.text.toString()
        val number1Int: Int=number1.toInt()

        val text6: TextView =findViewById(R.id.number2)
        val number2:String=text6.text.toString()
        val number2Int: Int=number2.toInt()

        val resultado: TextView =findViewById(R.id.result)

        val multiplicar = number1Int*number2Int

        resultado.text="$multiplicar"
    }
    private fun clickDvividir(){
        val text7: TextView =findViewById(R.id.number1)
        val number1:String=text7.text.toString()
        val number1Int: Int=number1.toInt()

        val text8: TextView =findViewById(R.id.number2)
        val number2:String=text8.text.toString()
        val number2Int: Int=number2.toInt()

        val resultado: TextView =findViewById(R.id.result)

        val dividir = number1Int/number2Int

        resultado.text="$dividir"
    }
}