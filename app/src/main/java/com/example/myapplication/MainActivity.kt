package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var txtResultado: TextView? = null
    val historial = mutableListOf<String>()

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

        val miBoton: Button = findViewById(R.id.btnIngresar)
        miBoton.setOnClickListener { onClick(1) }
    }
    private fun onClick(boton:Int){
        when(boton) {
            1 -> {
                //Se crea el intent encargador de la comunicacion entre activities
                val intent = Intent(this, ActivityResultados::class.java)
                //Creamos el bundle para el paso de informacion entre activities
                val miBundle:Bundle = Bundle()
                miBundle.putString("Numeros",historial.toString())
                //Se le agrega informacion al intent para que sea enviada
                intent.putExtras(miBundle)
                //Iniciamos el llamado a la nueva actividad
                startActivity(intent)
            }
        }
    }
    private fun clickSumar(){
        val text1: TextView =findViewById(R.id.number1)
        val number1:String=text1.text.toString()
        val number1Int: Int=number1.toInt()

        val text2: TextView =findViewById(R.id.number2)
        val number2:String=text2.text.toString()
        val number2Int: Int=number2.toInt()

        txtResultado=findViewById(R.id.txtResultado)

        val sumar = number1Int+number2Int

        historial.add(sumar.toString())

        txtResultado!!.text="La suma es $sumar"
    }
    private fun clickRestar(){
        val text3: TextView =findViewById(R.id.number1)
        val number1:String=text3.text.toString()
        val number1Int: Int=number1.toInt()

        val text4: TextView =findViewById(R.id.number2)
        val number2:String=text4.text.toString()
        val number2Int: Int=number2.toInt()

        txtResultado=findViewById(R.id.txtResultado)

        val restar = number1Int-number2Int

        historial.add(restar.toString())

        txtResultado!!.text="La resta es $restar"
    }
    private fun clickMultipicar(){
        val text5: TextView =findViewById(R.id.number1)
        val number1:String=text5.text.toString()
        val number1Int: Int=number1.toInt()

        val text6: TextView =findViewById(R.id.number2)
        val number2:String=text6.text.toString()
        val number2Int: Int=number2.toInt()

        txtResultado=findViewById(R.id.txtResultado)

        val multiplicar = number1Int*number2Int

        historial.add(multiplicar.toString())

        txtResultado!!.text="La multiplicacion es $multiplicar"
    }
    private fun clickDvividir(){
        val text7: TextView =findViewById(R.id.number1)
        val number1:String=text7.text.toString()
        val number1Int: Int=number1.toInt()

        val text8: TextView =findViewById(R.id.number2)
        val number2:String=text8.text.toString()
        val number2Int: Int=number2.toInt()

        txtResultado=findViewById(R.id.txtResultado)

        val dividir = number1Int/number2Int

        historial.add(dividir.toString())

        txtResultado!!.text="La division es $dividir"
    }
}