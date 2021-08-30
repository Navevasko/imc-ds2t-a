package br.senai.sp.jandira.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPeso = findViewById<EditText>(R.id.edit_peso)
        val editAltura = findViewById<EditText>(R.id.edit_altura)
        val textResultado = findViewById<TextView>(R.id.view_resultado)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {
            Toast.makeText(this, editPeso.text.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}