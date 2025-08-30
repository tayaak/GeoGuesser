package com.kaldirim.geoguesser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kaldirim.geoguesser.ui.InstructionsScreenUI
import com.kaldirim.geoguesser.ui.theme.GeoguesserTheme


class InstructionsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeoguesserTheme {
            InstructionsScreenUI(
                onBackClick = { finish() } // schließt die Activity und geht zurück
            )}
        }
    }
}
