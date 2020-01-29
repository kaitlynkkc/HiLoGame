package com.example.hilogame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var number = Random.nextInt(1,100)
    var guessVal = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        guessVal = Integer.parseInt(guess.getText().toString().trim())
        if (guessVal == number) {
            hi_lo.text = "You win!"
            instructions.visibility = View.VISIBLE
            number = Random.nextInt(1,100)
        } else if (guessVal < number) {
            hi_lo.text = "Higher"
            instructions.visibility = View.GONE
        } else {
            hi_lo.text = "Lower"
            instructions.visibility = View.GONE
        }
    }
}
