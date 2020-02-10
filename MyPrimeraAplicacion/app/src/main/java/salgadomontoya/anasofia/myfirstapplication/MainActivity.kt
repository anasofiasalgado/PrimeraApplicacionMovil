package salgadomontoya.anasofia.myfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var num: Int= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label: TextView = findViewById(R.id.etiqueta) as TextView
        val down: Button= findViewById(R.id.down) as Button
        val up: Button= findViewById(R.id.up) as Button
        val generate: Button= findViewById(R.id.generate) as Button

        generate.setOnClickListener {  }

         num = Random.nextInt( 0, 100)

        label.setText(""+num+"")

        up.setOnClickListener {
        num= Random.nextInt(from: num, until: 100)
            label.setText(""+num+"")

        }
        //codigo
        down.setOnClickListener {
            num= Random.nextInt(from: 0, until: num)
            label.setText(""+num+"")

        }
        //codigo
    }
}
