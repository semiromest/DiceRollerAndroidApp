package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var baslaTusu:Button = findViewById(R.id.baslangic)
        var zarGoster: ImageView = findViewById(R.id.Imagezar)

        zarGoster.setImageResource(R.drawable.dice_1)


        baslaTusu.setOnClickListener{
            var rastgele = (1..6).random()


            when(rastgele){
                1-> zarGoster.setImageResource(R.drawable.dice_1)
                2-> zarGoster.setImageResource(R.drawable.dice_2)
                3-> zarGoster.setImageResource(R.drawable.dice_3)
                4-> zarGoster.setImageResource(R.drawable.dice_4)
                5-> zarGoster.setImageResource(R.drawable.dice_5)
                6-> zarGoster.setImageResource(R.drawable.dice_6)
            }
            Toast.makeText(this, "tuşa basıldı", Toast.LENGTH_SHORT).show()

            
        }
    }

}