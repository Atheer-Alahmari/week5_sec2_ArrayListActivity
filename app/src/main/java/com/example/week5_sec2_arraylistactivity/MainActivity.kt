package com.example.week5_sec2_arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var cuont=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listName= ArrayList<String>()
        add_Btn.setOnClickListener {
            var name=name_ED.text.toString()
            listName.add(name)
            name_ED.text.clear()

            cuont++
            textView2.setText("number of Names: $cuont")
        }

        get_btn.setOnClickListener {
            try {
                var num=number_ED.text.toString().toInt()
                textView.setText(listName[--num])
                number_ED.text.clear()

            }catch (e:Exception){
                Toast.makeText(applicationContext, "Please Enter Number between 1 - $cuont ", Toast.LENGTH_SHORT).show()


            }
        }
    }

}