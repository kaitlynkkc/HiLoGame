package com.example.hilogame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
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
            guess.setEnabled(false)
            newgame.visibility = View.VISIBLE
        } else if (guessVal < number) {
            hi_lo.text = "Higher"
            instructions.visibility = View.GONE
            guess.text = null
        } else {
            hi_lo.text = "Lower"
            instructions.visibility = View.GONE
            guess.text = null
        }
    }

    fun newGame(view: View) {
        guess.text = null
        hi_lo.text = null
        instructions.visibility = View.VISIBLE
        guess.setEnabled(true)
        number = Random.nextInt(1,100)
        newgame.visibility = View.INVISIBLE
    }
}
