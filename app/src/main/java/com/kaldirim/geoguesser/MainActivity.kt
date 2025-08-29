package com.kaldirim.geoguesser

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kaldirim.geoguesser.ui.screens.MainScreenUI

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Compose UI setzen: MainScreenUI aus ui/screens/MainScreen.kt
        setContent {
            MainScreenUI(
                onStartGameClick = {
                    startActivity(Intent(this, GameActivity::class.java))
                },
                onInstructionsClick = {
                    startActivity(Intent(this, InstructionsActivity::class.java))
                },
                onAboutClick = {
                    startActivity(Intent(this, AboutActivity::class.java))
                }
            )
        }
    }
}
