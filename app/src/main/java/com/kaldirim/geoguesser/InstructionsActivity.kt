package com.kaldirim.geoguesser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kaldirim.geoguesser.ui.InstructionsScreenUI


class InstructionsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstructionsScreenUI(
                onBackClick = { finish() } // schließt die Activity und geht zurück
            )
        }
    }
}
