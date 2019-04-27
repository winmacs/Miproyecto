package com.edu.uabc.miproyecto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nompro.text="“Implementar un sistema web para el seguimiento de ventas para optimizar el servicio al cliente en la empresa APE de México”"
        descri.text="La empresa mexicana APE de México S. De RL. De CV. se dedica a la comercialización de insumos en general para maquiladoras y empresas agrícolas en México, los tiempos en una empresa siempre apremian y se requiere poder darle el servicio presenta desorden en sus ordenes de compra, tanto en su recepción, transcurso y entrega, así como la cobranza de las mismas. Existe mucha perdida de información, material de las ordenes de compra y en algunas ocasiones se desconoce que se entrego y no."
        referencia.text="https://www.youtube.com/watch?v=-s39b_Ki1C8\n" +
                "https://www.youtube.com/watch?v=Nc0FAbipWuE\n" +
                "https://www.desarrollolibre.net/blog/android/como-crear-un-navigationview-con-kotlin-en-android-studio#.XLPYQaTp1PY\n" +
                "https://www.youtube.com/watch?v=vC0uHjMDN0E\n" +
                "https://stackoverflow.com/questions/52255575/how-to-make-a-scrollview-in-kotlin\n" +
                "https://tutorialwing.com/android-scrollview-using-kotlin-example/"

    }

}
