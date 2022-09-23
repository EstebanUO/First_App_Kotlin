package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

class RegistroLogin : AppCompatActivity() {
    var campoUsuario:EditText?=null
    var campoPass:EditText?=null
    var txtUsuario:TextView?=null
    var txtPass:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_login)
        iniciarComponentes()
        cargarDatos()
    }
    private fun iniciarComponentes() {
        var btnGuardar:Button=findViewById(R.id.btnGuardar)
        btnGuardar.setOnClickListener { guardarDatos() }
        var btnCargar:Button=findViewById(R.id.btnCargar)
        btnCargar.setOnClickListener { cargarDatos() }
        campoUsuario=findViewById(R.id.campoUser)
        campoPass=findViewById(R.id.campoPass)
        txtUsuario=findViewById(R.id.txtUsuario)
        txtPass=findViewById(R.id.txtPass)
    }
    private fun guardarDatos() {
        var preferences:SharedPreferences=getSharedPreferences("credenciales",Context.MODE_PRIVATE)
        var usuario= campoUsuario?.text.toString()
        var pass= campoPass?.text.toString()
        var editor:SharedPreferences.Editor=preferences.edit()
        editor.putString("user",usuario)
        editor.putString("pass",pass)
        txtUsuario?.text=usuario
        txtPass?.text=pass
        editor.commit()
        Toast.makeText(this,"Se han registrado los datos",Toast.LENGTH_SHORT).show()

        //Se crea el intent encargador de la comunicacion entre activities
        val intent = Intent(this, MainActivity::class.java)
        //Creamos el bundle para el paso de informacion entre activities
        val miBundle:Bundle = Bundle()
        //Se le agrega informacion al intent para que sea enviada
        intent.putExtras(miBundle)
        //Iniciamos el llamado a la nueva actividad
        startActivity(intent)
    }
    private fun cargarDatos() {
        var preferences:SharedPreferences=getSharedPreferences("credenciales",Context.MODE_PRIVATE)
        var user: String? =preferences.getString("user","No existe la información")
        var pass: String? =preferences.getString("pass","No existe la información")
        txtUsuario?.text=user
        txtPass?.text=pass
    }
}