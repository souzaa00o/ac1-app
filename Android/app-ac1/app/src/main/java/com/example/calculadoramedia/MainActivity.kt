package com.example.calculadoramedia

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proc(compoenente:View){
        val nome = tbxNome.text;
        val n1 = tbxNota1;
        val n2 = tbxNota2;
        val media = (n1+n2)/2

        if(nome == null || n1 < 0 || n2 < 0){
            if(media < 7){
                lblResposta.visibility = View.VISIBLE
                lblResposta.setTextColor(Color.parseColor("#FF0000"))
                lblResposta.setText("Reprovado - nota final ${media}")
            }else{
                lblResposta.visibility = View.VISIBLE
                lblResposta.setTextColor(Color.parseColor("#008000"))
                lblResposta.setText("Reprovado - nota final ${media}")
            }
        }
    }

    fun limpar(compoenente: View){
        tbxNome.setText("")
        tbxNota1.setText("")
        tbxNota2.setText("")
        lblResposta.visibility = View.INVISIBLE

    }
}