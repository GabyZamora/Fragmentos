package com.example.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var FragmentoTurno = true


    fun IntercalarFragmentos(view: View){
        Toast.makeText(this,"Cambiando Fragmentos", Toast.LENGTH_LONG).show()
        val fragmento1 = FragmentBlank()
        val fragmento2 = BlankFragment2()
        val fragmento3 = BlankFragment3()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        if (FragmentoTurno) {
            //Instalar aquí el fragmento 1
            FragmentoTurno = false
            transaction.replace(R.id.reemplazarAqui, fragmento1)
            transaction.addToBackStack(null)
            transaction.commit()
        } else {
            //Instalar aquí fragmento2
            FragmentoTurno = true
            transaction.replace(R.id.reemplazarAqui, fragmento2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        if (FragmentoTurno){
            //Instalar aquí fragmento3
            FragmentoTurno = true
            transaction.replace(R.id.reemplazarAqui,fragmento3)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
