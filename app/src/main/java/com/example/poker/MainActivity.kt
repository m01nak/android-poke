package com.example.poker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pokeCount = 0

        val tvEmoticon: TextView = findViewById(R.id.tvEmoticon)
        val tvDialogue: TextView = findViewById(R.id.tvDialogue)
        val btnPoke: Button = findViewById<Button>(R.id.btnPoke)
        val btnSleep: Button = findViewById<Button>(R.id.btnSleep)

        fun pokeCLear(v: View) {
            tvEmoticon.setText("(∪｡∪)")
            tvDialogue.setText("...zZzZzZz...")

            pokeCount = 0
        }

        fun pokePrint(v: View) {
            when(pokeCount) {
                0 -> { tvDialogue.setText("Huh!?") ; tvEmoticon.setText("(•ิ_•ิ)!") ; pokeCount++ }
                1 -> { tvDialogue.setText("Oh, Hi there!") ; tvEmoticon.setText("(•‿•)") ; pokeCount++ }
                2 -> { tvDialogue.setText("Hello.") ; tvEmoticon.setText("(•‿•)ノ") ; pokeCount++ }
                3 -> { tvDialogue.setText("Hello, World!") ; tvEmoticon.setText("ヽ(^o^)ノ") ; pokeCount++ }
                4 -> { tvDialogue.setText("Hello?") ; tvEmoticon.setText("(´･_･`)") ; pokeCount++ }
                5 -> { tvDialogue.setText("What do you want?") ; tvEmoticon.setText("¯\\(_ಠ_ಠ_)/¯") ; pokeCount++ }
                6 -> { tvDialogue.setText("Stop Poking me!") ; tvEmoticon.setText("ლ(ಠ_ಠლ)") ; pokeCount++ }
                7 -> { tvDialogue.setText("...") ; tvEmoticon.setText("(-_-)") ; pokeCount++ }
                8 -> { tvDialogue.setText("You're lucky phones don't have hands.") ; tvEmoticon.setText("(ง'̀-'́)ง") ; pokeCount++ }
                9 -> { tvDialogue.setText("I said stop!!") ; tvEmoticon.setText("(•̀o•́)ง") ; pokeCount++ }
                10 -> { tvDialogue.setText("Okay, BYE!") ; tvEmoticon.setText("＼( ･_･)"); pokeCount++ }
                11 -> { pokeCLear(btnSleep)}
            }
        }

        btnSleep.setOnClickListener { pokeCLear(btnSleep) }
        btnPoke.setOnClickListener { pokePrint(btnPoke) }
    }
}