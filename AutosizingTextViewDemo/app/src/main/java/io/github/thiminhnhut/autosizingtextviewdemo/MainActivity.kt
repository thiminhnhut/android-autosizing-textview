package io.github.thiminhnhut.autosizingtextviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtDisplay: TextView
    private lateinit var edtInputText: EditText
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addControls()

        addEvents()

    }

    private fun addControls() {
        txtDisplay = findViewById(R.id.txtDisplay)
        edtInputText = findViewById(R.id.edtInputText)
        btnSend = findViewById(R.id.btnSend)
    }

    private fun addEvents() {
        btnSend.setOnClickListener {
            txtDisplay.text = edtInputText.text
        }
    }
}
